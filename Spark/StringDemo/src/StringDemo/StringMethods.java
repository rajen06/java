package StringDemo;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "abc xyz";
        System.out.println(s1.length());

        //concat
        String s2 = "abc";
        String s3 = "xyz";
        String s4 = s2 + " " + s3;

        //String to char
        String s5 = "abc";
        char[] arr = s1.toCharArray();
        System.out.println(Arrays.toString(arr));

        //charAt
        String s6 = "Leela";
        System.out.println(s2.charAt(0));
    }
}
