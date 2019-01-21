/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #2
 * Write a program that reads an integer angle 
 * (which may be positive or negative) and normalizes it to a value 
 * between 0 and 359 degrees. Try it first with the % operator, 
 * then with floorMod.
 */
package java_ex2_normalizenumber;

import static java.lang.Math.floorMod;
import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Java_Ex2_NormalizeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read an integer value
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int value = scan.nextInt();
        
        int remainder = value % 360; // Normalize angle using % operator
        //int remainder = floorMod(value,360); // Normalize angle using floorMod
        
        int angle = 0;
        if(value >= 0)
            angle = remainder;
        if(value < 0)
            angle = 360 + remainder;
        System.out.printf("Angle: %d%n",angle);
    }
    
}
