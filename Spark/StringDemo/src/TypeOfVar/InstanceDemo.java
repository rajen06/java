package TypeOfVar;

public class InstanceDemo {
    String name = "Divya";
    public static void main(String[] args) {
        InstanceDemo obj1 = new InstanceDemo();
        System.out.println(obj1.name);
        obj1.name = "Rakesh";
        System.out.println(obj1.name);

        InstanceDemo obj2 = new InstanceDemo();
        System.out.println(obj2.name);
    }
}
