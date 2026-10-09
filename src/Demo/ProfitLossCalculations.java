package Demo;
import java.util.Scanner;
public class ProfitLossCalculations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Cost price:");
		double cp=sc.nextDouble();
		
		System.out.println("Enter the Selling Price:");
		double sp=sc.nextDouble();
		
		System.out.println("--Loss/Profit Analysis---");
		if(sp>cp) {
			double profit=sp-cp;
			double percentage=(profit/cp)*100;
			System.out.println("Gain Profit:"+profit);
			System.out.println("Percentage:"+percentage);
		}
		else if(cp>sp){
			double loss=cp-sp;
			double percentage=(loss/cp)*100;
			System.out.println("Loss:"+loss);
			System.out.println("percentage:"+percentage);
		}
		else {
			System.out.println("No rasults are found");
		}
		sc.close();
	}

}