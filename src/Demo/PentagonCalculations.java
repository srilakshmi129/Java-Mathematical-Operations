package Demo;
import java.util.Scanner;
public class PentagonCalculations {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.print("Enter the side of a Pentagon:");
	   double side=sc.nextDouble();
	   
	   double perimeter=5*side;
	   double area=0.25*Math.sqrt(5*(5+2 *Math.sqrt(5)))*Math.pow(side, 2);
	   
	   System.out.println("--Pentagon--");
	   System.out.println("Area of a Pentagon:"+ area);
	   System.out.println("Perimeter of a Pentagon:"+ perimeter);
	   
	   sc.close();
   }
}