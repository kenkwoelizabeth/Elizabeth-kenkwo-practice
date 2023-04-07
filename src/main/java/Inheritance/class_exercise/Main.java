package Inheritance.class_exercise;

public class Main {
    public static void main(String arg[]) {
        Rothweiler rotweiler = new Rothweiler();

        // Using setters and getters
        rotweiler.setBark("Rothweiler");
        System.out.println(rotweiler.getBark());

        // declared a  String get run method
        System.out.println(rotweiler.getRun());

    }
}