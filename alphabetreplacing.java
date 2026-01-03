import java.util.*;
public class alphabet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        String r= "";
        for(int i=0; i< s.length();i++){
            int x;
            x = s.charAt(i);
            if(x >= 'a' && x <= 'z')
            {
                x = ((int)x+1)%123;
                if(x==0)
                x=97;
                char x1 = (char)x;
                if(!(x1 == 'a'|| x1 == 'e' || x1 == 'i' || x1 == 'o' || x1 == 'u'))
                r = r+x1;
            }
            else{
                r = r+s.charAt(i);
            }
        
        }
        System.out.println(r);
    }
}



