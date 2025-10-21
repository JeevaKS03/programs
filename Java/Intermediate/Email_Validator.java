import java.util.Scanner;
public class Main {
    static boolean validator(String email){
        String s = "@gmail.com";
        if (email.contains(" ")) {
            System.out.println("Your Email Should not Contains White Spaces!");
            return false;
        }
        if(email.contains("@")){
            if(!email.substring(email.indexOf('@')).equals("@gmail.com")) {
                System.out.println("Your Email should ends with @gmail.com");
                return false;
            }
            else{
                return true;
                }
        }
        else{
            System.out.println("Your Email Should Contain @");
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String email;
        do{
            System.out.print("Enter an Email: ");
            email = scanner.next();
        }while(!validator(email));
        System.out.println("Hello! " + email.substring(0,email.indexOf("@")));

    }
}
