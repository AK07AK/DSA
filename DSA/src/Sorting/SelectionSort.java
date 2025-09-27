package Sorting;

public class SelectionSort {
    public void selectionSort(int[] arr)
    {
        int minIndex=0;
        for(int i=0;i<arr.length;i++)
        {
            minIndex = findMin(arr,i);
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    private static int findMin(int[] arr,int idx)
    {
        int n = arr.length;
        int min=Integer.MAX_VALUE,res=0;
        for(int i=idx;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
                res=i;
            }
        }
        return res;
    }
}
