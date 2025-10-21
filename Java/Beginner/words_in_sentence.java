package programs;

public class words_in_sentence {
    public static void main(String[] args) {
        String text = "Hello world how are you ";
        //Using split()
            String[] array = text.split(" "); //Use .trim().split("\\s+") for advanced version
            System.out.println("Words in sentence: "+array.length);
        //Using Looping
            int words=1;
            if(text.charAt(text.length()-1)==' '){
                words--;
            }
            for(char i:text.toCharArray()){
                if(i==' '){
                    words++;
                }
            }
            System.out.println("Words in sentence: "+words);
    }
}
