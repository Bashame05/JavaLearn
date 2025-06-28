public class pattern{
    public static void main(String[] args){
//        for(int i = 0; i<4;i++){
//            for(int j = 0 ; j<5 ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n = 5;
//        int m = 5;
//
//        for(int i =0; i<n ; i++){
//            for(int j=0 ; j<m ; j++){
//                if(i==0 || j==0 || i==n-1 || j==m-1){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        int n = 5;
//
//        for(int i =0; i<n ; i++){
//            for(int j = 0  ; j<=n-1-i ; j++){
//                System.out.print(" ");
//            }
//            for(int k = 0 ; k <= i ; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int n=4;
        for(int i = n; i>=1; i--){
            for(int j = i;j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        //Butterfly pattern
//        int n = 4;
//         for(int i = 1; i<=n; i++){
//             for(int j =1 ; j<=i ; j++){
//                 System.out.print(j);
//             }
//             int spaces = 2*(n-i);
//             for(int k = 1 ; k<=spaces; k++ ){
//                 System.out.print(" ");
//             }
//             for(int j =i ; j>=1 ; j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//        for(int i = n; i>=1; i--){
//            for(int j =1; j<=i ; j++){
//                System.out.print(j);
//            }
//            int spaces = 2*(n-i);
//            for(int k = 1 ; k<=spaces; k++ ){
//                System.out.print(" ");
//            }
//            for(int j =i ; j>=1 ; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        right aligned rectangle ig
//        int n = 5;
//        for(int i = 1 ; i<=n ; i++){
//            int spaces = 5-i;
//            for(int j = 1; j<=spaces ; j++){
//                System.out.print(" ");
//            }
//            for(int j = n; j>=1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//         int n = 5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//        for(int i=n-1;i>=1;i--){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

    }
}