package Lambda1;

/* Деление на ноль, поэтому вылетает java.lang.ArithmeticException.
    1. Можно поймать ошибку и обработать её.
    2. Решить, выдавая в результате, допустим ноль. */

public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);

        try {
            int c = calculator.div1.apply(a, b);
            calculator.println.accept(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Деление на 0 запрещено, подумайте " +
                    "над числами и выполняемыми операциями!");
        }

        int d = calculator.div2.apply(a, b);
        calculator.println.accept(d);
    }
}
