package Lambda;

import java.util.ArrayList;
@FunctionalInterface
interface  Sum {
    int add(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        Sum sum = (x,y) -> x+y;
        int result = sum.add(a,b);
        System.out.println(result);
    }

}
