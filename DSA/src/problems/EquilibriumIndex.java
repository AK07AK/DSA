package problems;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        int n = arr.length;
        int sum=0,ls=0;
        for (int j : arr) sum += j;
        for(int i=0;i<n;i++)
        {
            sum=sum-arr[i];
            if(ls==sum)
            {
                System.out.print(i+" ");
                return;
            }
            ls+=arr[i];
        }
        System.out.println(-1);
    }
}
