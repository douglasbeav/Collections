import java.util.ArrayList;

public class MyArraListTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Douglas"); // ----> O(1) constant
//        for (int i = 0; i < list.size(); i++) { // ----> O(n) linear
//            list.add("a"); // ----> O(1)
//        }
        list.remove(0);
    }

}
