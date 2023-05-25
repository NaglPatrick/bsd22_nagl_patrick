package at.campus02.bsd;

public class Calculator {

    public double add(double number1, double number2){
        return number1 + number2;
    }
    public double minus(double number1, double number2){
        return number1 - number2;
    }
    public double divide(double number1, double number2){
        return number1 / number2;
    }
    public double multiply(double number1, double number2){
        return number1 * number2;
    }

    public double faculty(double number) {
        double result = number;
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return result;
        }
        return result * faculty(number - 1);
    }
}
