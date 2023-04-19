package lambda_practice;

public class Main {
    public static void main(String[] args) {
        //   B obj= new B();
        // obj.print(); //one way to call the cat method
        // printThing(obj); // another way to call the cat method

        // Implementing lambda
        //put the cat method in the printThing method removing the public void cat and putting an arrow
        printThing(
                () -> {
                    System.out.println("Moew");
                }
        );
        //or
        A lambdaPrint = () -> System.out.println("Moew");
        printThing(lambdaPrint);


    }


    // another way to write a method to implement the interface
    static void printThing(A thing) {
        thing.print();
    }

}
