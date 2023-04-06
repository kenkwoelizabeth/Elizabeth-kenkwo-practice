package april_1st;


import april_1st.my_sub_package.Address;

public class MainHomeWork {
    public static void main(String[] args) {

        // product object
        Product product1 = new Product("TV", 500);
        Product product2 = new Product("Laptop", 1000);

        // Address object
        Address address1 = new Address(true, "14",
                "Main Street", "Augusta", "Georgia");


        // Customer object
        Customer customer1 = new Customer("Kris",
                "kris@gmail.com", new Address[]{address1},
                new Product[]{product1, product2});

        customer1.getCustomerInfo();

        String customerInfo1 = customer1.getCustomerInfo();
        customer1.addAddress(address1);
        System.out.println(customerInfo1);
    }
}
