package programs;

public class vowel_consonant_count {
    public static void main(String[] args) {
        int vowel_count=0;
        int consonant_count=0;
        char[] vowel = {'a','e','i','o','u'};
        char[] consonant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        String str = "Jeevaa2";
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            boolean isvowel=false;
            for(int j=0;j<vowel.length;j++){
                if(str.charAt(i)==vowel[j]){
                    vowel_count++;
                    isvowel=true;
                }
            }
            if(!isvowel){
                for(int j=0;j<consonant.length;j++){
                    if(str.charAt(i)==consonant[j]){
                       consonant_count++;
                    }
                }
            }
        }
        System.out.println("Vowels: "+vowel_count);
        System.out.println("Consonants: "+consonant_count);
    }
}
