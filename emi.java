import java.util.Scanner;
public class emi 
{
	public static void main(String[] args)
	{
		double am,dp,a,it,mo,em,A,yr,gt;
		Scanner input =new Scanner(System.in);
		System.out.println("AMOUNT             ");
		am = input.nextDouble();
		System.out.println("DOWN PAYMENT        ");
		dp = input.nextDouble();
		System.out.println("TOTAL                 ");
		a = am - dp;
		System.out.println("INTEREST             ");
		it = a * 4/100*3;
		System.out.println("MONTH                ");
		mo = input.nextDouble();
		System.out.println("INTEREST MONTH        "+it);
		A = it/mo;
		System.out.println("EMI                  ");
		em = (a+it)/mo;
		System.out.println("grand total          ");
		gt = a + it ;
		
		
		
		
		System.out.println("======================================");
		  System.out.println("     EMI CALCULATOR      ");
		  System.out.println("====================================");
	      System.out.println("AMOUNT               "+am);
		  System.out.println("====================================");
		  System.out.println("DOWN PAYMENT         "+dp);
		  System.out.println("TOTAL                "+a);
		  System.out.println("INTEREST             "+it);
		  System.out.println("MONTH                "+mo);
		  System.out.println("INTEREST MONTH       "+A);
		  System.out.println("====================================");
		  System.out.println("EMI                  "+em);
		  System.out.println("====================================");
		  System.out.println("GRAND TOTAL          "+gt);
		  System.out.println("====================================");
		  System.out.println("====================================");
		  
		  
	}
	
	
	

}
