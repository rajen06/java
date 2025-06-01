class Student {
    int rollNo = 10;
    String name = "John";
    String address = "123 Main St";
    String city = "New York";
    String state = "NY";
    String zip = "10001";
    String country = "USA";
    String phone = "123-456-7890";
    String email = "john@example.com";

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }

    public void display() {
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(address);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zip);
        System.out.println(country);
        System.out.println(phone);
        System.out.println(email);
    }


}