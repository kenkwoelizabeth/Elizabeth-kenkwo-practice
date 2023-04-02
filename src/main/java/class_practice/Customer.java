package class_practice;

public class Customer {
    public String customerName;
     public String address;
    public String email;
    String customerInfo;
    public String[] purchasedProducts;

  public Customer(String customerName,String address,String email,String[] purchasedProducts ){
    this.customerName=customerName;
    this.address=address;
    this.email=email;
    this.purchasedProducts=purchasedProducts;

}
    public void getCustomerInfo() {
        System.out.printf("Customer Name: "+ customerName);
        System.out.printf("Customer Address: "+ address);
        System.out.printf("Customer Email: "+ email);
        System.out.printf("Customer Address: "+ address);
       System.out.printf("Purchased Product: "+ purchasedProducts);
        }
    }


