package Sorting;

public class QuickSort {
    public void quickSort(int[] arr,int start,int end)
    {
        if(start>=end)
            return;
        int boundary = partition(arr,start,end);
        quickSort(arr,start,boundary-1);
        quickSort(arr,boundary+1,end);
    }
    private static int partition(int[] arr,int left,int right)
    {
        int pivot = arr[right];
        int boundary=left-1;
        for(int i=left;i<=right;i++)
        {
            if(pivot>=arr[i])
            {
                boundary++;
                int temp = arr[boundary];
                arr[boundary] = arr[i];
                arr[i] = temp;
            }
        }
        return boundary;

    }
}
