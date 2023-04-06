package homework_practice;

public class Customer {
    private String customerName;
    private String email;
    private Product[] purchasedProducts;


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

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Customer(String customerName, String email, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public String getCustomerInfo() {
        String result = "Customer Information \n  --------------- \nCustomer Name = " + customerName + "\n"
                + "Customer Email = " + email + "\n" + purchasedProducts[0].getProductName()
                + " = " + purchasedProducts[0].getPrice() + "\n" + purchasedProducts[1].getProductName()
                + " = " + purchasedProducts[1].getPrice();


        return result;
    }
}
