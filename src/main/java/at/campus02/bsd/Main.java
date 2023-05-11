package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double res1 = calc.add(1, 2);
        double res2 = calc.minus(1, 2);
        double res3 = calc.divide(1, 2);
        double res4 = calc.multiply(1, 2);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}