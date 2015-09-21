/**
 * This class calculates total loan amount
 * and calculates monthly payment
 */
package Main;
import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;
/**
 * @author Quentin Dubroff
 */
public class Tuition {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the initial tuition cost?");
		double initialTuition = input.nextDouble();
		
		/** 
		 *Enter all percentages as decimals. i.e. 1% increase = 0.01
		 */
		System.out.println("What is the percentage increase of tuition?");
		double percentInc = input.nextDouble();
		
		System.out.println("What is the repayment APR?");
		double APR = input.nextDouble();
		/**
		 * * Enter loan term in years
		 */
		System.out.println("What is the repayment term in years?");
		double term = input.nextDouble();

		double a = initialTuition;
		double b = percentInc+1;
		double tuitionCost = a+Math.pow(a, b)+Math.pow(a, b*b)+Math.pow(a, b*b*b);
		System.out.printf("The total tuition cost is %.2f%n" , tuitionCost);
		
		double r = APR/12;
		double monthlyPayment = tuitionCost*r/(1-Math.pow(1+r,-1*term*12));
		System.out.printf("Your monthly payment will be %.2f", monthlyPayment);
	}
}
