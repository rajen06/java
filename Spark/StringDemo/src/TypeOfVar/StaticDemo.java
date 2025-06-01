package TypeOfVar;

public class StaticDemo {

    static String name= "Divya";
    public static void main(String[] args) {
//        StaticDemo obj1 = new StaticDemo();
//        System.out.println(obj1.name);
//        obj1.name="David";
//        System.out.println(obj1.name);
//
//
//        StaticDemo obj2 = new StaticDemo();
//        System.out.println(obj2.name);

        //Static
        System.out.println(StaticDemo.name);
        name = "David";
        System.out.println(name);

    }
}
