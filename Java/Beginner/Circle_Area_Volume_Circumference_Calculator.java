import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;
        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = ((double) 4 /3) * Math.PI * Math.pow(radius,3);
        System.out.printf("The Circumference is: %.1fcm \n" , circumference);
        System.out.printf("The Area is: %.1fcm² \n" , area);
        System.out.printf("The Volume is: %.1fcm³ \n" , volume);
        scanner.close();
    }
}


