package programs;

public class largest_element_in_list {
    public static void main(String[] args) {
        int[] num = {3,4,6,2,5,78,8,3,4,0};
        //Largest element
        int max =num[0];
        for(int i:num){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Largest element: "+max);
        //Smallest element
        int min=num[0];
        for(int i:num){
            if(i<min){
                min=i;
            }
        }
        System.out.println("Smallest element: "+min);

    }
}
