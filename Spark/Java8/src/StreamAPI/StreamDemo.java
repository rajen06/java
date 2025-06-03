package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30, 40,50));
        System.out.println(list);
//        Stream s = list.stream();
        List<Integer> filterData =list.stream().filter(num -> num > 20).collect(Collectors.toList());
        System.out.println(filterData);

        List<Integer> mapData = list.stream().map(num -> num / 2).collect(Collectors.toList());
        System.out.println(mapData);

        Stream<Integer> s1 = Stream.of(1,2,3,4,5);
         Object[] array = s1.toArray();
        System.out.println(Arrays.toString(array));
        for (Object a:array)
        {
            System.out.println(a);
        }


        Stream<Integer> s2 = Stream.of(1,2,3,4,5);
        long countData = s2.count();
        System.out.println(countData);

        Stream<Integer> s3 = Stream.of(1,2,3,4,5);
//        s3.forEach(System.out::println);
        s3.forEach(ele -> System.out.println(ele+" "));

        Stream<Integer> s4 = Stream.of(1,2,3,4,5);
        Optional<Integer> minData = s4.min((a, b)->a.compareTo(b));
        System.out.println("min  : "+minData.get());

        Stream<Integer> s5 = Stream.of(1,2,3,4,5);
        Optional<Integer> maxData = s5.max((a, b)->a.compareTo(b));
        System.out.println("max  : "+maxData.get());
    }

}
