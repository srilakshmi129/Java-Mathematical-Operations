package Demo;
import java.util.Scanner;
public class DiscountCalculations {
   public static void  main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.print("Enter the marked Price:");
	   double mp=sc.nextDouble();
	   
	   System.out.print("Enter the disccount price:");
	   double discount=sc.nextDouble();
	   
	   double discountAmount=(discount/100)*mp;
	   double originalPrice=mp-discount;
	   
	   System.out.println("--Discount--");
	   System.out.println("Marked price:"+mp);
	   System.out.println("Discount Amount:"+discountAmount);
	   System.out.println("Original Price:"+originalPrice);
	   
	   sc.close();
   }
}
