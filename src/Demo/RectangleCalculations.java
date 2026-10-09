package Demo;
import java.util.Scanner;
public class RectangleCalculations {
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the length of a Rectangle:");
    	
    	double length=sc.nextDouble();
    	System.out.print("Enter the width of a Rectangle:");
    	
    	double width=sc.nextDouble();
    	
    	double area=length*width;
    	double perimeter=2*(length*width);
    	
    	System.out.println("---Rectangle----");
    	System.out.println("Area of a Rectangle:"+area);
    	System.out.println("perimeter of a Rectangle:"+perimeter);
    	
    	sc.close();
    }
}