import java.util.*;

public class functions{
    //print name
//    public static void pname( String name){
//        System.out.println("your name is :"+name);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your name:");
//        String name = sc.nextLine();
//        pname(name);
//
//    }
//    //print factorial
//    public static int fact(int a ){
//        int factorial=1;
//      for(int i=1;i<=a;i++){
//          factorial = factorial * i;
//      }
//      return factorial;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int a = sc.nextInt();
//
//        System.out.println("The factorial of number is "+fact(a));
//    }
//    //calculate average
//    public static float average(int a,int b,int c){
//        float avg;
//        avg = (float)(a+b+c)/3;
//        return avg;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter three numbers:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println("The average of your three numbers is:"+average(a,b,c));
//
//    }
//    //sum of first n odd numbers
//    public static int sumofodd(int n){
//        int sum=0;
//        int odd=1;
//        for(int i=1;i<=n;i++) {
//            sum = sum + odd;
//            odd = odd + 2;
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number n:");
//        int n = sc.nextInt();
//        System.out.println("The sum of the first "+n+" odd numbers is "+sumofodd(n));
//    }
    //greater of two nos
    public static void greater(int a , int b){
        if(a>b){
            System.out.println(a+" is greater");
        }else if(b>a){
            System.out.println(b+" is greater");
        }else{
            System.out.println("The numbers are equal");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        greater(a,b);
    }
}