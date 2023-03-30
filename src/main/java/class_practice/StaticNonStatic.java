package class_practice;

public class StaticNonStatic {

    String type;
    // static method for the phone
    public static String displayPhoneType(String type) {
        return type ;
    }
    public static String displayPhoneModel(String model) {
        return model;
    }
  // Creating a noN-static(instance method)
    String phone;
    String model;
    public String displayPhoneType(){
        return type;
    }
    public String displayPhoneModel(){
        return model;
    }

        public static void main (String[]args){
// object for static method
        String staticPhone= StaticNonStatic.displayPhoneType("iphone") ;
        String staticModel= StaticNonStatic.displayPhoneModel("Pro Max");
            System.out.println("The name of the phone is " + staticPhone + " and the model is " + staticModel );


            StaticNonStatic sa= new StaticNonStatic();
            System.out.println("The name of the phone is " + sa.displayPhoneType("Samsung") + " and the model is " + sa.displayPhoneModel("S23") );


        }
    }
