package programs;

public class factorial {
    static int factorial(int n){
        if (n==0){
            return 1;
        }
        else{
            return  n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        //Using for loop
            int num=5;
            int fact=1;
            for (int i=1;i<=num;i++){
                fact = fact*i;
            }
            System.out.println("Fact: "+fact);
        //Using recursion
            System.out.println("Fact: "+factorial(5));

    }
}
