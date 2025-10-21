package programs;

public class sum_of_even_numbers_in_list {
    public static void main(String[] args) {
        int[] num = {2,4,6,4,3,5,79,9,5,2};
        int sum=0;
        for(int i:num){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers: "+sum);
    }
}
