package programs;

public class reverse_string {
    public static void main(String[] args) {
        String text = "JeevaKS";
        //Using String builder
            StringBuilder sb = new StringBuilder(text);
            String rev_text = sb.reverse().toString();
            System.out.println("Reversed string: "+rev_text);
        //Using loop
            String rev = "";
            for(int i=text.length()-1;i>=0;i--){
                rev+=text.charAt(i);
            }
            System.out.println("Reversed string: "+rev);
        //Improved loop version
            StringBuilder rev_build = new StringBuilder();
            for(int i = text.length()-1;i>=0;i--){
                rev_build.append(text.charAt(i));
            }
            System.out.println("Reversed string: "+rev_build); //.toString() is called implicitly
    }
}
