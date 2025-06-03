package Functions;

import java.util.function.Function;

//interface FunctionD {
//     int apply(int x);
//}
public class FunctionDemo   {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x * x;
        System.out.println(f.apply(5));

    }
}
