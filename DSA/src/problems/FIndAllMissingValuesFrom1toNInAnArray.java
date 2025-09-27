package problems;
import java.util.*;
public class FIndAllMissingValuesFrom1toNInAnArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> result = new ArrayList<>();
        boolean[] n = new boolean[nums.length+1];
        for(int num : nums) {
            n[num] = true;
        }

        for(int i=1; i<=nums.length; i++) {
            if(!n[i]) result.add(i);
        }

        System.out.println(result);

    }
}
