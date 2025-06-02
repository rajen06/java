package CollectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("raj");
        list.add("rohan");
        list.add("harry");
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(4);
        list1.add(4);
        System.out.println(list1);


    }
}
