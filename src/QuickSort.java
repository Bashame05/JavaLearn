public class QuickSort {
    private static void quicksort(int[] arr, int low, int high) {
        if(low<high){
            int pidx = partition(arr,low,high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low-1;
        int pivot = arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args){
        int[] arr = {6,3,9,5,2,8};
        quicksort(arr,0,arr.length-1);
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}
