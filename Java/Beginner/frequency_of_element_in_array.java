package programs;
import java.util.HashMap;

public class frequency_of_element_in_array {
    public static void main(String[] args) {
    int[] arr = {2,2,4,6,8,6,3,3};
    //Using Hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int temp = map.get(arr[i]);
                map.put(arr[i],temp+1);
            }
        }
        Object[] array = map.values().toArray();
        for(int i=0;i<map.size();i++){
            System.out.println(arr[i]+" repeated :"+array[i]);
        }
    }

}
