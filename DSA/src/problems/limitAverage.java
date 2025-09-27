package problems;
import java.util.*;
public class limitAverage {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<=4;i++)
        {
            System.out.println("Enter"+(i+1)+" number");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter limit 1: ");
        int limit1 = sc.nextInt();
        System.out.println("Enter linmit 2: ");
        int limit2 = sc.nextInt();

        int count=0;
        int total=0;

        for(int n:arr)
        {
            if(n>limit1 && n<limit2)
            {
                count++;
                total+=n;

            }
        }
        if(total==0)
            System.out.println("No values found with that range");
        else
            System.out.println("Average is: "+(total/count));
    }
}
