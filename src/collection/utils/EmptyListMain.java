package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        LinkedList<Object> list2 = new LinkedList<>();

        List<Object> list3 = Collections.emptyList();
        List<Object> list4 = List.of();

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());
    }
}
