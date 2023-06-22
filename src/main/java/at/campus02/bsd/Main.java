package at.campus02.bsd;

//import java.util.logging.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/** the Main class has the main method to call the methods from Calculator
 *
 * @author Patrick Nagl
 * */
public class Main {
    private static Logger logger = LogManager.getLogger();
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

        logger.error("its an error logger");
        logger.info("its an info logger");
    }
}