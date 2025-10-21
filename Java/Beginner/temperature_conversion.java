package programs;

public class temperature_conversion {
    public static void main(String[] args) {
        double Celsius = 32;
        double Fahrenheit = Celsius * (9.0/5) + 32;
        System.out.println("Fahrenheit: "+Fahrenheit);

        Fahrenheit = 89.6;
        Celsius = (Fahrenheit-32) * (5.0/9);
        System.out.println("Celsius: "+Celsius);
    }
}
