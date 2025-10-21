package programs;

public class palindrome {
    public static void main(String[] args) {
        String text = "mom";

        //Using String builder
            StringBuilder sb = new StringBuilder(text);
            String rev_text = sb.reverse().toString();
            if(rev_text.equals(text)){
                System.out.println("Palindrome!");
            }
            else{
                System.out.println("Not Palindrome!");
            }
        //Using loop
            String rev = "";
            for(int i=text.length()-1;i>=0;i--){
                rev+=text.charAt(i);
            }
            if(rev.equals(text)){
                System.out.println("Palindrome!");
            }
            else{
                System.out.println("Not Palindrome!");
            }
    }
}
