package Demo;
import java.util.Scanner;
public class SquareCalculations {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.print("Enter the side of a Square:");
	   double side=sc.nextDouble();
	    
	   double area=side*side;
	   double perimeter=4*side;
	   
	   System.out.println("---Square---");
	   System.out.println("Area of Square:"+area);
	   System.out.println("Perimeter of a Square:"+perimeter);
	   
	   sc.close();
   }
}