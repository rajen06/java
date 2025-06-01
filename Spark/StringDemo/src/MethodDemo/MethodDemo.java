package MethodDemo;

public class MethodDemo {
    public static void main(String[] args) {
        print();
        int s = print2();
        System.out.println("s=" + s);
        print3("Some");
        print3("Some", 23);
        int sum = print4(10, 10);
        System.out.println("sum=" + sum);
    }

    public static void print() {
        System.out.println("Hello bro");
    }

    public static int print2() {
        return 2;
    }


    public static void print3(String name) {
        System.out.println("Hello " + name);
    }

    public static void print3(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("Age " + age);
    }

    public static int print4(int num1, int num2) {
        return num1 + num2;
    }

}
