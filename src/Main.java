
 import java.util.*;


public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //Number even or odd
        System.out.print("Enter any number:");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd");
        }
      //mini calculator
      System.out.print("Enter a number a:");
        int a = sc.nextInt();
        System.out.print("Enter a number b:");
        int b = sc.nextInt();

        System.out.println("Select the operation between 1-5 :");
        int c = sc.nextInt();

        switch (c){
            case 1 :
                System.out.println("The addition of a and b is "+(a+b));
                break;
            case 2:
                System.out.println("The difference of a and b is "+(a-b));
                break;
            case 3 :
                System.out.println("The product of a and b is "+(a*b));
                break;
            case 4 :
                System.out.println("The division of a and b is "+(a/b));
                break;
            case 5:
                System.out.println("The remainder of a and b is "+(a%b));
                break;
            default:
                System.out.println("Invalid Operation");
        }
        sc.close();

    }
}
