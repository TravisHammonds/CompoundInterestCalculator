//Travis Hammonds
//Testing the building of a calculator program

import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class calculator {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the principal");
		double p = myObj.nextDouble();
		
		System.out.println("Enter the interest rate");
		double r = myObj.nextDouble();
		
		System.out.println("Enter the number of times to be compounded each year");
		double n = myObj.nextDouble();
		
		System.out.println("Enter the time in years to hold");
		int t = myObj.nextInt();
		
		System.out.println("Enter the regular payment amount");
		double PMT = myObj.nextDouble();
		
		myObj.close();
		
		calculateCompoundInterest(p,r,n,t,PMT);
		
	}
	public static void calculateCompoundInterest(double p, double r, double n, int t, double PMT) {
		double A = Math.pow(1+r/n,n*t);
		double B = p*A;
		
		BigDecimal C = new BigDecimal(B);
		C= C.setScale(2, RoundingMode.HALF_UP);
		
		double D = PMT*(((Math.pow(1+r/n, n*t)-1)/(r/n)));
		BigDecimal E = new BigDecimal(D);
		E = E.setScale(2, RoundingMode.HALF_UP);
		
		BigDecimal sum = C.add(E);
		System.out.println("$"+sum);
	}
}
