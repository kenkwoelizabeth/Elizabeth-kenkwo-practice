package lambda_practice;

public class B implements A {
    public String name;
    public int age;

    // must override the method in A
    @Override
    public void print() {
        System.out.println("Moew");
    }


}
