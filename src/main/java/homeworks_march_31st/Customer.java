package homeworks_march_31st;

public class Customer {
    private String customerName;
    private String email;
    private String address;
    private Product[] purchasedProducts;

// setters and getters for the declared variable

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

// constructor for the customer class

    public Customer(String customerName, String email, String address, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
        this.address = address;


    }

    // method to get customer information
    public void getCustomerInfo() {
        System.out.printf("Customer Name: " + customerName + "\n");
        System.out.printf("Customer Email: " + email + "\n");
        System.out.printf("Customer Address: " + address + "\n");

        for (Product productList : purchasedProducts) {
            System.out.println(productList.getProductName() + " = $" + productList.getPrice());
        }

    }
}


