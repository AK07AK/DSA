package redemptionArc.algorithms;

public class BinarySearch {

    public static void binarySearch(){
        int[] arr = {1,2,3,4,5,6};
        int target = 9;
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid = (end+start)/2;
            if(arr[mid]==target)
            {
                System.out.println("Found at idx: "+mid);
                System.exit(0);
                break;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
        }

        System.out.println("Target not found!");
    }
}
