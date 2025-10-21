package programs;

public class swap_without_third_variable {
    public static void main(String[] args) {
        //For integers
            int a = 5;
            int b = 3;
            //Using arithmetics
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("A: "+a);
            System.out.println("B: "+b);
            //Using XOR
            a = 5;
            b = 3;
            a=a^b;
            b=a^b;
            a=a^b;
            System.out.println("A: "+a);
            System.out.println("B: "+b);
        //For Strings
            String x = "Hello";
            String y = "world";
            x = x + y;
            y = x.substring(0,x.length()-y.length());
            x = x.substring(y.length());
            System.out.println("X: "+ x);
            System.out.println("Y: "+ y);
    }
}
