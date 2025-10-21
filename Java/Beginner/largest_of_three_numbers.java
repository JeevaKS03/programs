package programs;

public class largest_of_three_numbers {
    public static void main(String[] args) {
        int num1=5;
        int num2=7;
        int num3=7;
        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is greatest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 + " is greatest");
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3 + " is greatest");
        }
        else if(num1 == num2 && num1==num3 && num2==num3){
            System.out.println("All three numbers are equal");
        }
        else{
            System.out.println("Two numbers are equal");
        }
    }
}
