import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(4);
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        map.put(3, 4);
        map.put(2, 5);
        System.out.println(map);


    }
}