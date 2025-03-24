package collection.set.javaset;

import java.util.List;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(List.of(30, 20, 10, 10));
        for (Integer s : set) {
            System.out.println("s = " + s);

        }
    }
}
