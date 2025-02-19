package etc;

import java.util.ArrayList;
import java.util.List;

public class NestedArrayLoop {
    public static void main(String[] args) {
        ArrayList<Object> data = new ArrayList<>();

        ArrayList<Object> data1 = new ArrayList<>();
        data1.add("data1-0");
        data1.add("data1-1");
        data.add(data1);

        ArrayList<Object> data2 = new ArrayList<>();
        data2.add("data2-0");
        data2.add("data2-1");
        data.add(data2);

        for (int i = 0; i < data.size(); i++) {
            System.out.println("데이터[" + i + "]");

            Object item = data.get(i);
            if(item instanceof List){ //
                List<?> innerList = (List<?>) item;
                for (int j = 0; j < innerList.size(); j++) {
                    System.out.println("  데이터" + (i + 1) + "[" + j + "] = " + innerList.get(j));
                }
            }
        }
    }
}
