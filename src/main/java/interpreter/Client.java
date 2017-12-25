package interpreter;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("12+42");
        System.out.println(calculator.calculate());
    }
}
