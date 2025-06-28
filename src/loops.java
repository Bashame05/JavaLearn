import java.util.*;

public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//    //print numbers using while
//    int j = 0;
//    while(j<=10){
//        System.out.print(j + " ");
//        j++;
//    }
//    //print numbers using do while
//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=10);
//    //multiplication table
//        System.out.print("Enter a natural number:");
//        int n = sc.nextInt();
//
//        for(int i = 1 ; i<=10 ; i++ ){
//          int mul = n * i;
//            System.out.println(n+"*"+i+"="+mul);
//        }
//    //sum of n natural numbers
//        System.out.print("Enter a number n:");
//        int n = sc.nextInt();
//
//        int i = 1;
//        int sum = 0;
//        while(i<=n){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("The sum of "+n+" numbers is : "+sum);
//    //factorial of a number
//        System.out.print("Enter a number n : ");
//        int n = sc.nextInt();
//        int fact = 1;
//
//        for(int i = 1 ; i<=n ; i++){
//            fact = fact * i;
//        }
//        System.out.println("The factorial of "+n+" is : "+fact);
    //reversing a number
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int rev=0;

        while(n>0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        System.out.println("The reversed number is "+rev);

    }
}