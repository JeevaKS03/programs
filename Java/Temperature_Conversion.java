import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        //condition ? true : false ;

        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();
        newTemp =(unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32 ;
        System.out.printf("The Temperature is : %.2f°%s",newTemp,unit);

        scanner.close();
    }
}
