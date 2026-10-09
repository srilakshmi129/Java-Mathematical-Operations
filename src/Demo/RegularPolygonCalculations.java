package Demo;
import java.util.Scanner;
public class RegularPolygonCalculations {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter the sides of a Regular Ploygon:");
	   double side=sc.nextDouble();
	   
	   System.out.println("Enter the length of a side");
	   double sideLength=sc.nextDouble();
	   
	   double perimeter=side*sideLength;
	   double area=(side*Math.pow(sideLength,2))/(4*Math.tan(Math.PI)/side);
	   
	   System.out.println("--REGULAR POLYGON----");
	   System.out.println("Area of Regular Polgon:" + area);
	   System.out.println("Perimeter of regular Poygon"+perimeter);
	   
	   sc.close();
	   
   }
}