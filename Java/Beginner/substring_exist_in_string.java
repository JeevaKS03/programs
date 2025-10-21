package programs;

public class substring_exist_in_string {
    public static void main(String[] args) {
        String string = "abcdefhello";
        String sub= "hello";
        boolean iscontain;
        //Using inbuilt function
            iscontain = string.contains(sub);
            if(iscontain){
                System.out.println("Contains");
            }
            else{
                System.out.println("Not contains");
            }

        //From Scratch
            //This is an 3 index technique one main and if the first char of sub is equal to main then an
            //iterating starts with parallel with indexes one for sentence and another for substring if while
            //iterating if any one char doesn't match it breaks and continue else if no breaks sub string exist
            iscontain = false;
            int i_main;
            int i_orig;
            int i_sub;
            boolean temp=true;
            for(i_main=0;i_main<string.length();i_main++){
                if(string.charAt(i_main)==sub.charAt(0)){
                    i_sub=0;
                    temp=true;
                    for (i_orig = i_main;i_sub<sub.length();i_orig++,i_sub++){
                        if(string.charAt(i_orig)!=sub.charAt(i_sub)){
                            temp=false;
                            break;
                        }
                    }
                    if(temp){
                        iscontain=true;
                        break;
                    }
                }
            }
            if(iscontain){
                System.out.println("Contains");
            }
            else{
                System.out.println("Not contains");
            }
    }
}
