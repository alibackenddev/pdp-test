import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("a - ");
        double a = scanner.nextDouble();

        System.out.print("b - ");
        double b = scanner.nextDouble();

        SimpleCalculator.add(a, b);
        SimpleCalculator.subtract(a, b);
        SimpleCalculator.divide(a, b);
        SimpleCalculator.increase(a, b);
    }
}