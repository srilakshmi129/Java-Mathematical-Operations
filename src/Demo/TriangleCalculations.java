package Demo;
import java.util.Scanner;
public class TriangleCalculations {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.print("Enetr base of a Triangle:");
    	double base=sc.nextDouble();
    	
    	System.out.print("Enter the side2 of a Triangle:");
    	double side2=sc.nextDouble();
    	
    	System.out.print("Enetr side3 of a Triangle:");
    	double side3=sc.nextDouble();
    	
    	System.out.print("Enter the height ofa triangle:");
    	double height=sc.nextDouble();
    	
    	double area=0.5*base*height;
    	double perimeter=base+side2+side3;
    	
    	System.out.println("--Triangle---");
    	System.out.println("Area of a triangle:"+area);
    	System.out.println("Perimeter of a triangle"+perimeter);
    	
    	sc.close();
    }
}