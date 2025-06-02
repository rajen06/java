public class TestException {
    public static void main(String[] args) {
        System.out.println("before exception");
        int ans = divide(10, 0);
        System.out.println("divided by 10 : " + ans);
        try{
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("after exception");
            System.out.println("hi");
        }

        System.out.println("after exception handling");

    }

    protected static int divide(int a, int b) {
        try {
            return a/b;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        } finally {
            System.out.println("finally");
        }
    }
}
