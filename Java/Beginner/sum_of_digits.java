package programs;

public class sum_of_digits {
    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumofdigits(n/10);
    }
    public static void main(String[] args) {
        int num=1234;
        //Using loop
            int sum=0;
            int temp=num;
            while(temp>0){
                sum+=temp%10;
                temp=temp/10;
            }
            System.out.println("Sum: "+sum);
        //Using Recursion
        System.out.println("Sum: "+sumofdigits(num));
    }
}
