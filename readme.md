#  This is simple calculator

### This method for testing of SimpleCalculator class  
```java
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
```

### Code of SimpleCalculator class
```java
public class SimpleCalculator {
    public static void add(double a, double b){
        System.out.println("a + b = " + a + b);
    }
    public static void subtract(double a, double b){
        System.out.println("a - b = " + (a - b));
    }
    public static void divide(double a, double b){
        System.out.println("a / b = " + a / b);
    }
    
    public static void increase(double a, double b){
        System.out.println("a * b = " + a * b);
    }
}
```