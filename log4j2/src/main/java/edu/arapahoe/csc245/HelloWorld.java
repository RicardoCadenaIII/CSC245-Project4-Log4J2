// Ricardo Cadena III
// CSC245 Secure Software Development
// Professor Douglas Lundin

package edu.arapahoe.csc245;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

    private static final Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main(String[] args) {

            // logs name of class for event origin
            logger.info(String.format("Name of Class: HelloWorld"));

        // Declares array and its length
        int[] data = new int[100];
            // logs array declaration
            logger.info(String.format("Array is declared with 100 open indexes"));

        // Initialize array
        for (int i = 0; i < 100; i++) {
            // inserts int Math.random()*10,000 in array position i
            data[i] = (int) (Math.random() * 10000);
        }
            // logs array initialization
            logger.info(String.format("Array is initialized with random number in indexes 0-99"));

        // Creates scanner for user input
        Scanner input = new Scanner(System.in);

        // asks user input for index
        System.out.print("Enter an index: ");
        int index = input.nextInt();
            // logs user input for index
            logger.info(String.format("User input requested for array index " + index));

        try {
            System.out.println("The element is " + data[index]);
            // logs data index for user input
            logger.info(String.format("At array index " + index + ", value is " + data[index]));
        }
        catch (Exception ex) {
            System.out.println("Out of Bounds");
            // logs user input is outside of array index bounds
            logger.debug(String.format("User requested array index " + index + " which is outside of array index bounds 0-99"));
        }

        /*

        logger.debug("Hello from Log4j 2");

        logger.debug("Example of a DEBUG {}", () -> 1);
        logger.fatal("Example of a FATAL {}", () -> 2);
        logger.error("Example of a ERROR {}", () -> 3);
        logger.warn("Example of a WARN {}", () -> 4);
        logger.info("Example of a INFO {}", () -> 5);
        logger.trace("Example of a TRACE {}", () -> 6);

         */

//        while (true)//test rolling file
//            logger.debug("hello {}", () -> getNumber());

    }

    static int getNumber() {
        return 5;
    }

}
