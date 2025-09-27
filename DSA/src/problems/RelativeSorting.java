package problems;
import java.util.*;

public class RelativeSorting {
    public static void main(String[] args) {
        int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] arr2 = {2,42,38,0,43,21};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new TreeMap<>();

        for(int item:arr1)
            map.put(item,map.getOrDefault(item,0)+1);
        int[] res = new int[arr1.length];
        int idx=0;
        for(int item:arr2)
        {
            int freq = map.get(item);
            if(freq>0)
            {
                while(freq>0)
                {
                    res[idx++]=item;
                    freq--;
                }
            }
            map.remove(item);
        }
        for(int item:map.keySet())
        {
            res[idx++]=item;
        }
        return res;

    }
}
