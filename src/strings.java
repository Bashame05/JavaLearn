import java.util.*;

public class strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your name:");
//        String name = sc.nextLine();
//        System.out.println("Your name is "+name);
//
//        String firstName = "Meme";
//        String lastName = "Bashame";
//        //concatenation
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);
//
//        //length of string
//        for(int i=0; i<fullName.length(); i++){
//            System.out.print(fullName.charAt(i) + " ");
//        }
//        System.out.println();
//        System.out.println("The length of the string is "+fullName.length());
//
//        //compare two strings
//        //s1>s2 = returns +ve value
//        //s1<s2 = returns -ve value
//        //s1=s2 = returns 0
//        if(firstName.compareTo(lastName)==0){
//            System.out.println("The strings are equal");
//        }else 
//            if(firstName.compareTo(lastName)<0){
//            System.out.println("The second string is greater");
//        }else{
//            System.out.println("The first string is greater");
//        }
//        //substring of a string
//         String halfname = fullName.substring(0,4);
//        System.out.println(halfname);
//
//        //some more basic string functions
//        //contains(String str)--> checks whether the string contains a specific sequence
//        //equals(String str)--> checks whether the passsed string and the previous string are equal or not(case sensitive)
//        //equalsIgnoreCase(String str)--> same as above but not case-sensitive
//        //startsWith(String prefix) or endsWith(String suffix)--> checks whether a string starts or ends with something
//        //indexOf(String str) or lastIndexOf(String str)--> returns the first or last index of the first or last occurrence of any substring
//        //toUpperCase() or  toLowerCase() --> converts to uppercase or lowercase
//        //trim()--> removes the starting and ending spaces
//
//        //counting the occurrence of a specific character
//        System.out.print("Enter the character u wanna search:");
//        char a = sc.next().charAt(0);
//        int count = 0;
//        for(int i=0; i<fullName.length(); i++){
//            if(fullName.charAt(i)==a)
//                count=count+1;
//        }
//        System.out.println("The character "+a+" appeared "+count+" times in "+fullName);

        //palindrome checker
//        System.out.print("Enter a string:");
//        String str = sc.nextLine();
//        boolean palindrome = true;
//        int n = str.length();
//        for(int i=0; i<n/2; i++){
//            if(str.charAt(i)!=str.charAt(n-1-i)) {
//                palindrome = false;
//                break;
//            }
//        }
//        if(palindrome){
//            System.out.println(str + " is  a palindrome");
//        }else{
//            System.out.println(str + " is not a palindrome");
//        }

        //reverse a string
//        System.out.print("Enter a string:");
//        String str = sc.nextLine();
//
//        int n = str.length();
//        for(int i=n-1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }

        //count vowel
        System.out.print("Enter a string:");
        String str1 = sc.nextLine();
        String str = str1.toLowerCase();
        int count = 0;
        for(int i=0;i<str1.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count = count + 1;
            }
        }
        System.out.println("There are "+count+" vowels in the string "+str1);
        sc.close();
    }
}