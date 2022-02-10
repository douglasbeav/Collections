import java.util.*;

public class MySet {

    public static void main(String[] args) {

//        HashSet
//        Set<String> students = new HashSet<String>();

//        LinkedHashSet
//        Set<String> students = new LinkedHashSet<String>();
//
//        TreeSet
//        Set<String> students = new TreeSet<String>();
//
//        students.add("Zaland");
//        students.add("Daniil");
//        students.add("Kim");
//
//        System.out.println(students);
//
//        students.add("Zaland");

//        Contains
//        if(students.contains("Billy-Bob")) {
//            System.out.println("Set contains Billy-Bob");
//        }
//
//        if(students.contains("Emil")) {
//            System.out.println("Set contains Emil");
//        }

//        Intersections
//        Set<String> students2 = new TreeSet<String>();
//
//        students2.add("Andrea");
//        students2.add("Monica");
//        students2.add("Fernanda");
//        students2.add("Andreas");
//        students2.add("Zaland");
//
//        Set<String> intersection = new HashSet<String>(students);
//        System.out.println(intersection);
//        see what is the same between the sets
//        intersection.retainAll(students2);
//        System.out.println(intersection);

//        see difference between the sets
//        Set<String> difference = new HashSet<String>(students2);
//        difference.removeAll(students);
//        System.out.println(difference);



        Set<Integer> nums = new LinkedHashSet<Integer>();
        nums.add(4);
        nums.add(9);
        nums.add(-5);
        nums.add(7);
        nums.add(22);

        System.out.println(nums);

    }

}
