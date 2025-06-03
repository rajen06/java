import java.util.*;

public class GarageService {
    private Map<String, Customer> customerMap;
    private List<Service> availableServices;

    GarageService(Map<String, Customer> customers, List<Service> availableServices) {
        this.customerMap = new HashMap<>();
        this.availableServices = new ArrayList<>();
    }


    public void addCustomer(String name, String phone, String carNumber, String model) {
        Car car = new Car(carNumber, model);
        Customer customer = new Customer(name, phone, car);
        customerMap.put(name, customer);
        System.out.println("Customer added successfully");
    }

    public void createInvoice(String carNumber) {
        if (!customerMap.containsKey(carNumber)) {
            System.out.println("Customer not found");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Customer customer = customerMap.get(carNumber);
        Invoice invoice = new Invoice(customer);
        System.out.println("Available services: ");
        for (int i = 0; i < availableServices.size(); i++) {
            System.out.println((i + 1) + ") " + availableServices.get(i).getName()+ " - $"+availableServices.get(i).getPrice());
        }

        while (true)
        {
            System.out.println("Enter service number to add");
            int choice = scanner.nextInt();
            if(choice == 0) break;
            if(choice >0 && choice < availableServices.size()) {
                invoice.addService(availableServices.get(choice-1));
                System.out.println("Service done");
            } else {
                System.out.println("Invalid choice");
            }
        }
        invoice.printInvoice();
    }
}
