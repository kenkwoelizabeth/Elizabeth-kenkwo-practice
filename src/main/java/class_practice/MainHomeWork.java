package class_practice;

public class MainHomeWork {
    public static void main(String[] args) {
    Product p1=new Product("TV", 500);
    Product p2=new Product("Laptop", 1000);

    Customer c1=new Customer("Kris","61 blvd",
           "kris@gmail.com", new Product[]{p1, p2});
            c1.getCustomerInfo();
    }
}
