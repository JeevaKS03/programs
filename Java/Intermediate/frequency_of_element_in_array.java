package programs;
import java.util.ArrayList;
import java.util.HashMap;

public class frequency_of_element_in_array {
    public static void main(String[] args) {
        int[] arr = {2,2,4,6,8,6,3,3};
        //Using Hashmap
            /*HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                if(!map.containsKey(arr[i])){
                    map.put(arr[i],1);
                }
                else{
                    int temp = map.get(arr[i]);
                    map.put(arr[i],temp+1);
                }
            }
            for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " repeated: " + entry.getValue());
            }

             */
        //Using arraylist and loop
        /*
            ArrayList<Integer> visited = new ArrayList<>();
            int count;
            for(int i=0;i<arr.length;i++){
             if (!visited.contains(arr[i])) {
                count=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j]) {
                        count++;
                    }
                }
                    System.out.println(arr[i]+" repeated :"+count+" times");
                    visited.add(arr[i]);
                }
            }
         */
        //Using array and loop
            int[] visited = new int[arr.length];
            int visited_count=0;
            int count;
            boolean iscontain;
            for(int i=0;i<arr.length;i++){
                count=0;
                iscontain=false;
                for(int k=0;k<visited.length;k++){
                    if(arr[i]==visited[k]){
                        iscontain=true;
                        break;
                    }
                }
                for(int j=0;j<arr.length;j++){
                    if(!iscontain && arr[i]==arr[j]){
                        count++;
                    }
                }
                if(!iscontain){
                    System.out.println(arr[i]+" repeated: "+count);
                }
                visited[visited_count]=arr[i];
                visited_count++;
                }
    }
}
