package programs;

public class prime {
    public static void main(String[] args) {
        int num = 144;

        boolean isPrime = true;
        if (num == 0 || num == 1) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
           }
         }
        if(isPrime){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Not Prime");
        }
    }
}
