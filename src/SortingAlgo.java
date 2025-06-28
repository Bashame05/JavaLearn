
public class SortingAlgo {

    public static void arrayPrint(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
//       int[] arr = {7,8,3,1,2};
//       //bubble sort
//        int n = arr.length;
//        //outer loop for counting iterations
//        for(int i=0;i<n-1;i++){
//        //inner loop for sorting through array
//           for(int j=0;j<n-i-1;j++){
//               if(arr[j]>arr[j+1]){
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//               }
//           }
//        }
//        arrayPrint(arr);
//        System.out.println();
//
//        //selection sort
//        int[] arr1 = {5,7,4,9,2};
//        //outer loop for iteration and starting smallest index
//        for(int i=0;i<arr1.length-1;i++){
//            int smallest = i;
//            //for finding the actual smallest element
//            for(int j=i+1;j<arr1.length;j++){
//                if(arr1[smallest]>arr1[j]){
//                    smallest = j;
//                }
//            }
//            int temp = arr1[i];
//            arr1[i] = arr1[smallest];
//            arr1[smallest] = temp;
//        }
//        arrayPrint(arr1);
//        System.out.println();

        //insertion sort
        int[] a ={3,1};
        //for getting the current value and value of j
        for(int i=1;i<a.length;i++){
            int j = i-1;
            int current = a[i];
            //shifting the  current value to its correct position
            while(j>=0 && a[j]>current){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
        arrayPrint(a);

    }
}
