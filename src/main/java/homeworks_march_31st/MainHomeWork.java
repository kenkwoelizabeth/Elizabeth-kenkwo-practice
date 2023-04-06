package homeworks_march_31st;


import homeworks_march_31st.Customer;
import homeworks_march_31st.Product;

public class MainHomeWork {
    public static void main(String[] args) {
        Product product1 = new Product("TV", 500);
        Product product2 = new Product("Laptop", 1000);


        Customer c1 = new Customer("Kris",
                "kris@gmail.com", "65 blvd Street", new Product[]{product1, product2});
        c1.getCustomerInfo();
    }
}
