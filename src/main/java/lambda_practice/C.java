package lambda_practice;

@FunctionalInterface
public interface C {
    public void get(String name, char symbol);


    public static void main(String[] args) {
        String name = "Blondy";
        char symbol = '!';
        C sample = (n, s) -> {
            System.out.println(n + s);

        };
        sample.get(name, symbol);
    }

}