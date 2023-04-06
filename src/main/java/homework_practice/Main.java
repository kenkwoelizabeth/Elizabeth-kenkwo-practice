package homework_practice;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("TV", 500);
        Product product2 = new Product("Laptop", 1000);


        Customer c1 = new Customer("Kris",
                "kris@gmail.com", new Product[]{product1, product2});
        System.out.println(c1.getCustomerInfo());
    }
}


