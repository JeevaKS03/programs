package programs;

public class n_prime_numbers {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else {
            for (int i = 2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int n=5;
        int num=0;
        while(n!=0){
            if(isPrime(num)){
                System.out.print(num+" ");
                n--;
            }
            num++;
        }
    }
}
