import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("Enter the Lenght of Side A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the Lenght of Side B: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The Length of Side C is : " + Math.round(c*Math.pow(10,2)) / Math.pow(10,2) + "cm");
        scanner.close();
    }
}

