import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String Product;
        double Price;
        int Count;
        System.out.println("Welcome!!!");
        System.out.print("Enter the name of the Product: ");
        Product = scanner.nextLine();
        System.out.print("Enter the Price of the Each "+Product+" : ");
        Price = scanner.nextDouble();
        System.out.print("Enter the Quantity of the "+Product+" : ");
        Count = scanner.nextInt();
        System.out.println("\nYou have bought "+Count+" "+Product+"/s");
        System.out.println("Your Total is "+"$"+Price*Count);
        System.out.println("Thank You For Purchasing!!!");
        System.out.println("Have a Nice Day 🙂");
        scanner.close();
    }
}

