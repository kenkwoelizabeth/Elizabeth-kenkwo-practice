package april_1st_another_solution;


import april_1st_another_solution.my_sub_package.Address;

public class MainHomeWork {
    public static void main(String[] args) {

        // product object
        Product product1 = new Product("TV", 500);
        Product product2 = new Product("Laptop", 1000);

        // Customer object
        Customer customer1 = new Customer("kris@gmail.com",
                new Product[]{product1, product2}, new CustomerName("Kris", "Mavin", "Mayes"));


        // Address object
        Address address1 = new Address(true, 14,
                "Main Street", "Augusta", "Georgia");
        Address address2 = new Address(false, 215, "Second street", "New York City", "New York");


        customer1.addAddress(address1);
        customer1.addAddress(address2);
        customer1.getCustomerInfo();


    }
}



