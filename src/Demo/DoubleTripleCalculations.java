package Demo;
import java.util.Scanner;

public class DoubleTripleCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        double number = scanner.nextDouble();
        
        // Formulas
        double doubledValue = number * 2;
        double tripledValue = number * 3;
        
        System.out.println("--- Multiplication Results ---");
        System.out.printf("Original Number: %.2f\n", number);
        System.out.printf("Doubled Value (x2): %.2f\n", doubledValue);
        System.out.printf("Tripled Value (x3): %.2f\n", tripledValue);
        
        scanner.close();
    }
}