public class MergeSort {
    private static void divide(int[] arr, int si, int ei) {
        if(si>=ei) return;
        int mid = (si + ei)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,ei,mid);
    }

    private static void conquer(int[] arr, int si, int ei, int mid) {
        int idx1 = si;
        int idx2 = mid+1;
        int[] merged = new int[ei-si+1];
        int x = 0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i< merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    public static void main(String[] args){
        int[] arr = {4,6,2,9,1};
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
        divide(arr,0,arr.length-1);
        System.out.println("SORTED ARRAY");
        for(int n : arr){
            System.out.print(n+" ");
        }
    }


}
