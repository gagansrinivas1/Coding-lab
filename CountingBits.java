import java.util.*;

class CountingBits {
    static int countBits(int item) {
        if(item == 0) {
            return 1;
        } else {
            return (int)(Math.log(item)/Math.log(2) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String strNums = sc.nextLine();
        String[] tokens = strNums.split(" ");
        int[] ary = new int[tokens.length];

        for(int i = 0; i < tokens.length; i++) {
            ary[i] = Integer.parseInt(tokens[i]);
        }

        for(int i = 0; i < ary.length; i++){
            count += countBits(ary[i]);
        }

        System.out.println(count);
    }
}
