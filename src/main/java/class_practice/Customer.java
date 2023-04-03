package class_practice;

public class Customer {
    public String customerName;
     public String address;
    public String email;
    String customerInfo;
    String Address[] ;
    public Product[] purchasedProducts;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(String customerName, String address, String email, Product[] purchasedProducts ){
    this.customerName=customerName;
    this.address=address;
    this.email=email;
    this.purchasedProducts=purchasedProducts;


}

    public void getCustomerInfo() {
        System.out.printf("Customer Name: "+ customerName +"\n");
        System.out.printf("Customer Address: "+ address+"\n");
        System.out.printf("Customer Email: "+ email+"\n");
        System.out.printf("Customer Address: "+ address+"\n");
        for (Product productList: purchasedProducts){
            System.out.println(productList.getProductName() + " $" + productList.getPrice());
        }

    }}


