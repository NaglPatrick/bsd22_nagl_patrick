package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();
    public double add(double number1, double number2){
        logger.debug("Addition with param1 = " + number1 + "; param2 = " + number2);
        return number1 + number2;
    }
    public double minus(double number1, double number2){
        logger.debug("Subtraction with param1 = " + number1 + "; param2 = " + number2);

        return number1 - number2;
    }
    public double divide(double number1, double number2){
        logger.debug("Division with param1 = " + number1 + "; param2 = " + number2);

        if (number2 == 0) {
            logger.error("There was a division by zero!");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }
    public double multiply(double number1, double number2){
        logger.debug("Multiplication with param1 = " + number1 + "; param2 = " + number2);

        return number1 * number2;
    }

    public double faculty(double number) {
        logger.debug("Faculty of param = " + number);

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
