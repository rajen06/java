import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private Customer customer;
    private List<Service> serviceList;
    private double totalAmount;

    Invoice(Customer customer) {
        this.customer = customer;
        this.serviceList = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addService(Service service) {
        serviceList.add(service);
        totalAmount += service.getPrice();
    }

    public void printInvoice() {
        System.out.println("------Invoice------");
        System.out.println("Customer: "+customer.getName()+ " | Phone: "+customer.getPhone());
        System.out.println("Car: "+customer.getCar().getModel()+ " | Number:"+customer.getCar().getCarNumber());
        System.out.println("Services List: ");
        for(Service service : serviceList) {
            System.out.println("# "+service.getName()+ ": $"+service.getPrice());
        }

        System.out.println("Total Amount: "+totalAmount);

    }
}