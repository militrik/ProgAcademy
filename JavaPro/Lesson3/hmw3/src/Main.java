import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        List<Customer> customerList = new ArrayList<>(List.of(
                new Customer("Alex", "Brown", 21, Customer.Gender.MALE, 56),
                new Customer("Nona", "Yellow", 18, Customer.Gender.FEMALE, 78),
                new Customer("Gerbert", "White", 55, Customer.Gender.MALE, 32),
                new Customer("Lusia", "Green", 35, Customer.Gender.FEMALE, 89),
                new Customer("Buba", "Blue", 29, Customer.Gender.OTHER, 45),
                new Customer("Boba", "Indigo", 29, Customer.Gender.OTHER, 21),
                new Customer("Mike", "Black", 38, Customer.Gender.MALE, 14),
                new Customer("Rita", "Red", 60, Customer.Gender.FEMALE, 88),
                new Customer("Alex", "Violet", 20, Customer.Gender.FEMALE, 32)
        ));

        customerList.forEach(customer -> System.out.println(customer.toString()));
        System.out.println();

        // Serialize Customers
        List<CustomerContainer> customerContainers = new ArrayList<>();
        for (Customer customer : customerList
        ) {
            customerContainers.add(new CustomerContainer().serialize(customer));
        }
        // DeSerialize Customers
        List<Customer> customerListRenew = new ArrayList<>();
        for (CustomerContainer customerContainer : customerContainers
        ) {
            customerListRenew.add(customerContainer.deserialize());
        }
        customerListRenew.forEach(customer -> System.out.println(customer.toString()));

    }
}
