/**
 * This Java program takes two float numbers as input from the user and calculates their product.
 */
import java.util.Scanner;

public class floatmult {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the 1st digit in decimal '.' ");
        float a = sc.nextFloat();
        System.out.println("Enter the 2nd digit in float");
        float b = sc.nextFloat();
        float mul = a*b;  //var name mul...
        
        System.out.println("The product of the two numbers is "+mul);
    }
    
}
