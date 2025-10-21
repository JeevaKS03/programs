package programs;

public class second_largest_element_in_list {
    public static void main(String[] args) {
        int[] num = {3,4,65,34,6,56,6,5};
        //Second largest element
            int flarge=num[0];
            int slarge=num[0];
            for(int i=0;i<num.length;i++){
                if(num[i]>flarge){
                    slarge=flarge;
                    flarge=num[i];
                }
                else if(num[i]>slarge && num[i]!=flarge){
                    slarge=num[i];
                }
            }
            System.out.println("First largest element: "+flarge);
            System.out.println("Second largest element: "+slarge);
        //Second smallest element (bit difficult)
            int fsmall = flarge;
            int ssmall = flarge;
            for(int i=0;i<num.length;i++){
                if(num[i]<fsmall){
                    ssmall = fsmall;
                    fsmall = num[i];
                }
                else if(num[i]<ssmall && num[i]!=fsmall){
                    ssmall = num[i];
                }
            }
            System.out.println("First smallest element: "+fsmall);
            System.out.println("Second smallest element: "+ssmall);
    }
}
