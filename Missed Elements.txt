import java.util.*;
import java.util.Scanner;

public class missedelements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int N;
        N = sc.nextInt();

        int [] arr = new int[N];

        System.out.println("Enter elements:");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=1; i<N; i++){
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println("Maximum element:"+max);
        
        int [] flag = new int[max+1];

        for(int j=0; j<=max; j++)
        {
            flag[j] = 0;
        }

        for(int j = 0; j<N; j++)
        {
            flag[arr[j]] = flag[arr[j]] + 1;
        }

        int MissedCount = 0;
        int [] missedEles = new int[max];

        for(int j = 1; j<=max; j++){
            if(flag[j] == 0)
            {
                missedEles[MissedCount] = j;
                MissedCount = MissedCount + 1;
            }
        }

        if(MissedCount == 0)
        {
            System.out.println("No Missed Elements");
            return;
        }

        System.out.println("Missing elements are: ");
        for(int k=0; k<MissedCount; k++)
        {
            System.out.println(missedEles[k]);
        }
    }
}