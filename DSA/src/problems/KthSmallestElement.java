package problems;
import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1,12,4,17,19,3};
        int k = 3;
        if(k>arr.length)
            System.out.print(-1);
        Arrays.sort(arr);
        System.out.print(arr[k-1]);
    }
}
