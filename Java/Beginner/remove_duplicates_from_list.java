package programs;
import java.util.ArrayList;

public class remove_duplicates_from_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(5);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);


    }
}
