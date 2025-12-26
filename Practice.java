import java.util.*;

public class practice{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers separated by commas:");
        String input = sc.nextLine();
        String s[]=input.split(",");
        int ele[]=new int[s.length];
        for(int i=0;i<ele.length;i++){
            ele[i]=Integer.parseInt(s[i]);
        }
        int sum=0, i=0, num2=0, found=0;
        while(i<ele.length)
        {
            if(ele[i]==5)
            {
                while(ele[i]!=8)
                {
                    num2 = num2*10+ele[i];
                    i++;
                    if(i==ele.length)
                        break;
                }
                if(i<ele.length)
                {
                    found=1;
                    num2 = num2*10+ele[i];
                }
                else{
                    break;
                }
            }
            else{
                sum = sum+ele[i];
                i++;
            }
        }
        if(found==1)
            System.out.println(sum+num2);
        else{
            System.out.println("-1");
        }
    }
}
