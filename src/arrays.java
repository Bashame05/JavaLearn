import java.util.*;

public class arrays{
    public static void main(String[] args){
        //type[] arrayName = new type[size]; OR type arrayName[] = new type[size];
        //type arrayName[] = {........};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        //searching in an array
        System.out.print("Enter the number you want to search in the array:");
        int num = sc.nextInt();
        //can also use arrayName.length if array size is not given
        for(int i=0; i<n; i++){
            if(arr[i]==num)
                System.out.println("The number found at index " + i);
        }

        //find largest and smallest in array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
           System.out.println("The max element is "+max+" and the min element is "+min);

        //printing an array in reverse
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }


        //2D ARRAYS

        //type[][] arrayName = new type[][]; or type arrayName[][] = new type[][];

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //print a 2d array
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //searching an element inside a 2d array
        System.out.print("Enter the number u want to search inside the matrix:");
        int x = sc.nextInt();
        boolean found = false;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==x){
                    System.out.println("The number found at index "+i+" and index "+j);
                    found = true;
                }
            }
        }
        if(!found)
            System.out.println("The element does not exist inside the matrix");

        //sum of all elements inside the matrix
        int sum = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=sum+matrix[i][j];
            }
        }
        System.out.println("The sum of all the elements of the matrix is "+sum);

        //transpose of a matrix
        int[][] transpose = new int[c][r];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}