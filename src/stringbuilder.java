
public class stringbuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Bashame Meme");
        System.out.println(sb);

        //char at
        System.out.println(sb.charAt(0));

        //set char at
//        sb.setCharAt(0,'A');
//        System.out.println(sb);

        //insert at
        sb.insert(6,'e');
        System.out.println(sb);

        //delete at
        sb.delete(6,7);
        System.out.println(sb);

        //reverse a string
        int n = sb.length();
        for(int i=0; i<n/2;i++){
            int front = i;
            int back = n-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
