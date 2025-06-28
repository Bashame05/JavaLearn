import java.util.*;

public class recursion {
//    public static void pnum(int n , int i, int sum){
//        if(i==n) {
//            sum = sum + i;
//            System.out.println(sum);
//            return;
//        }
//        sum = sum + i;
//        pnum(n,i+1,sum);
//    }
//    public static void main(String[] args){
//        int n = 2;
//        int i = 1;
//        int sum = 0;
//        pnum(n,i,sum);
//    }
//    public static  int fact(int n){
//        if(n==1 || n==0)
//            return 1;
//        int fm1 = fact(n-1);
//        int factorial = n * fm1;
//        return factorial;
//    }
//    public static void main(String[] args){
//        int n = 5;
//        System.out.println(fact(n));
//    }

//    public static void fibonacci(int a,int b,int n){
//        if(n==0)
//            return;
//        int c = a + b;
//        System.out.print(c + " ");
//        fibonacci(b,c,n-1);
//    }
//    public static void main(String[] args){
//        int a = 0;
//        int b = 1;
//        int n = 14;
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//        fibonacci(a,b,n);
//    }

//    public static void towerOfHanoi(int n, String src , String helper , String dest){
//        if(n == 1){
//            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
//            return;
//        }
//        towerOfHanoi(n-1,src,dest,helper);
//        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
//        towerOfHanoi(n-1,helper,src,dest);
//    }
//    public static void main(String[] args){
//        int n=3;
//        towerOfHanoi(n,"S","H","D");
//    }
//    public static void pstring(String S , int idx){
//        if(idx==0){
//            System.out.print(S.charAt(idx));
//            return;
//        }
//        System.out.print(S.charAt(idx));
//        pstring(S,idx-1);
//    }
//    public static void main(String[] args){
//        String s = "Bashame";
//        pstring(s,s.length()-1);
//    }
//    public static int first = -1;
//    public static int last  = -1;
//    public static void findOccur(String str,int idx,char elem){
//        if(idx==str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        if(str.charAt(idx)==elem){
//            if(first == -1){
//                first = idx;
//            }else{
//                last = idx;
//            }
//        }
//        findOccur(str,idx+1,elem);
//    }
//    public static void main(String[] args){
//        String str = "abaacdaefaah";
//        findOccur(str,0,'f');
//    }
//
//    public static void moveAllX(String str,int idx,int count,String newstr){
//        if(idx == str.length()){
//            for(int i=0;i<count;i++){
//                newstr += "x";
//            }
//            System.out.println(newstr);
//            return;
//        }
//        if(str.charAt(idx)=='x'){
//            count += 1;
//            moveAllX(str,idx+1,count,newstr);
//        }else{
//            newstr = newstr + str.charAt(idx);
//            moveAllX(str,idx+1,count,newstr);
//        }
//    }
//    public static void main(String[] args){
//        String str = "axbcxxdxx";
//        moveAllX(str,0,0,"");
//    }
//    public static void printPerm(String str , String permutaion){
//        if(str.length()==0){
//            System.out.println(permutaion);
//            return;
//        }
//        for(int i=0;i<str.length();i++){
//            char curChar = str.charAt(i);
//            String newStr = str.substring(0,i) + str.substring(i+1);
//            printPerm(newStr,permutaion+curChar);
//        }
//    }
//    public static void main(String[] args){
//        String str = "abc";
//        printPerm(str,"");
//    }
//    public static int countPaths(int i,int j, int n, int m){
//        if (i == n || j == m) {
//            return 0;
//        }
//        if(i==n-1 && j==m-1){
//            return 1;
//        }
//        int downPaths = countPaths(i+1,j,n,m);
//        int rightPaths = countPaths(i,j+1,n,m);
//        return downPaths + rightPaths;
//    }
//    public static void main(String[] args){
//        int n=3;
//        int m=3;
//        System.out.println(countPaths(0,0,n,m));
//    }
//    public static int placeTiles(int n,int m){
//        if(n==m){
//            return 2;
//        }
//        if(n<m){
//            return 1;
//        }
//        int vertWays = placeTiles(n-m,m);
//        int horWays  = placeTiles(n-1,m);
//        return vertWays + horWays;
//    }
//    public static void main(String[] args){
//        int n=3;
//        int m=2;
//        System.out.println(placeTiles(n,m));
//    }
//    public static int callGuests(int n){
//        if(n<=1)
//            return 1;
//        int singleWays = callGuests(n-1);
//        int pairWays   = (n-1) * callGuests(n-2);
//        return singleWays + pairWays;
//    }
//    public static void main(String[] args){
//        int n=4;
//        System.out.println(callGuests(n));
//    }
    public static void printSubset(ArrayList<Integer> subset){
        int i = 0;
        while(i<subset.size()){
            System.out.print(subset.get(i)+" ");
            i = i + 1;
        }
        System.out.println();
    }
    public static void subsets(int n , ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        //element add hoga
        subset.add(n);
        subsets(n-1,subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        subsets(n-1,subset);
    }
    public static void main(String[] args){
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(n,subset);
    }
}