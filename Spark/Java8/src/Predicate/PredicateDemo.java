package Predicate;

import java.util.function.Predicate;
public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> 5 < 10;
        System.out.println(predicate.test(5));
    }
}
