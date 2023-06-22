package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * This class has methods to calculate basic math-functions
 *
 * @author Patrick Nagl
 */
public class Calculator {
    private static Logger logger = LogManager.getLogger();

    /**
     * This Method adds two numbers
     *
     * @param number1 first number
     * @param number2 second number to be added to first
     * @return gives the result of addition
     */
    public double add(double number1, double number2){
        logger.debug("Addition with param1 = " + number1 + "; param2 = " + number2);
        return number1 + number2;
    }

    /**
     * This Method subtracts two numbers
     *
     * @param number1 first number
     * @param number2 second number to subtract from first number
     * @return gives the result of the subtraction
     */
    public double minus(double number1, double number2){
        logger.debug("Subtraction with param1 = " + number1 + "; param2 = " + number2);

        return number1 - number2;
    }

    /**
     * This Method divides two numbers
     *
     * @param number1 first number
     * @param number2 second number to divide the first number with
     * @return gives the result of the division
     * @throws ArithmeticException if division by zero occurs
     */
    public double divide(double number1, double number2){
        logger.debug("Division with param1 = " + number1 + "; param2 = " + number2);

        if (number2 == 0) {
            logger.error("There was a division by zero!");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

    /**
     * This Method multiplies two numbers
     *
     * @param number1 first number
     * @param number2 second number
     * @return gives the result of the multiplication
     */
    public double multiply(double number1, double number2){
        logger.debug("Multiplication with param1 = " + number1 + "; param2 = " + number2);

        return number1 * number2;
    }

    /**
     * This Method calculates the faculty (x!) of a number
     *
     * @param number number u want the faculty of
     * @return gives the faculty of given number
     */
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
