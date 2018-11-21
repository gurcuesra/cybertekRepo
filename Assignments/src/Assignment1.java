/*
 * Write a JAVA program to calculate the tax:
 * 
 * income ≤ 150,000,000 tax ratio %25
 * income ≤ 300,000,000 tax ratio %30
 * income ≤ 600,000,000 tax ratio %35
 * income ≤ 1,200,000,000 tax ratio %40
 * income > 1,200,000,000 tax ratio %50
 * 
 * Create needed variables and print the tax 
 */
public class Assignment1 {

	public static void main(String[] args) {
		double income = 120e6;
		double taxRatio;
		
		if(income<=150e6 && income>0) {
			taxRatio = income*25/100;
			System.out.println("Tax is: "+(int)(taxRatio));
			
		}else if(income<=300e6 && income>150e6) {
			taxRatio = income*30/100;
			System.out.println("Tax is: "+(int)(taxRatio));
			
		}else if(income<=600e6 && income>300e6) {
			taxRatio = income*35/100;
			System.out.println("Tax is: "+(int)(taxRatio));
			
		}else if(income<=1200e6 && income>600e6) {
			taxRatio = income*40/100;
			System.out.println("Tax is: "+(int)(taxRatio));
			
		}else if(income>1200e6) {
			taxRatio = income*50/100;
			System.out.println("Tax is: "+(int)(taxRatio));
			
		}else {
			System.out.println("Please write valid income!");
		}
		

	}

}
