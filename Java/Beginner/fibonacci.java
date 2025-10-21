package programs;

public class fibonacci {
    static int fibonaci(int i){
        if(i==0){
            return 0;
        }
        else if(i==1){
            return 1;
        }
        else{
            return fibonaci(i-1)+fibonaci(i-2);
        }
    }
    public static void main(String[] args) {
        //Using for loop
            int num=6;
            int a=0;
            int b=1;
            System.out.print(a+" ");
            for(int i=0;i<num-1;i++){
                System.out.print(b+" ");
                int temp=a+b;
                a=b;
                b=temp;
            }
        //Using Recursion
        for(int i=0;i<num;i++){
            System.out.print(fibonaci(i)+" ");
        }


    }
}
