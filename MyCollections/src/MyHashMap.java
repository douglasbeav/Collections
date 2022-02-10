import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class MyHashMap {

    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Zaland");
        hm.put(2, "Bob");
        hm.put(3, "Soheil");

        System.out.println(hm);

        for(Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + "->" + m.getValue());
        }

        hm.replace(1, "Douglas");
        System.out.println(hm);

        hm.putIfAbsent(5, "Jack");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bill");
        map.put(2, "Søren");
        map.put(3, "Mappy");
        map.put(10, "Jackson");
        map.putAll(hm);

        System.out.println(map);

    }

}
