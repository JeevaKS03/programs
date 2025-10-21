package programs;
import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = scn.nextInt();
        if(num % 2==0){
            System.out.println("Even number!");
        }
        else{
            System.out.println("Odd number!");
        }
    }
}
