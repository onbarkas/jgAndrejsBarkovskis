package bucky_intermediate.lesson4;

import java.util.ArrayList;
import java.util.List;

public class collections {
    public static void main(String[] args) {
        String[] kitchen = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        for (String x: kitchen)
            list1.add(x);

        String [] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();
        for (String y: moreThings)
            list2.add(y);

        for (int i = 0; i < list1.size();i++){
            System.out.println(list1.get(i));
        }

        System.out.println();

        for (int i = 0; i < list2.size();i++){
            System.out.println(list2.get(i));
        }
    }
}
