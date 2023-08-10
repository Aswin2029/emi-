import java.util.Scanner;
public class emi 
{
	public static void main(String[] args)
	{
		double am,dp,a,it,mo,em,A,gt,yr,itr;
		Scanner input =new Scanner(System.in);
		System.out.println("AMOUNT             ");
		am = input.nextDouble();
		System.out.println("DOWN PAYMENT        ");
		dp = input.nextDouble();
		System.out.println("TOTAL                 ");
		a = am - dp;
		System.out.println("YEAR             ");
		yr = input.nextDouble();
		System.out.println("INTEREST             ");
		it = input.nextDouble();
		System.out.println("TOTAL INTEREST             ");
		itr = a*it/100*yr;
		System.out.println("MONTH                ");
		mo = (yr*12)-1;
		System.out.println("INTEREST MONTH        "+it);
		A = itr/mo;
		System.out.println("EMI                  ");
		em = (a+itr)/mo;
		System.out.println("grand total          ");
		gt = a + itr ;
		
		
		
		
		System.out.println("======================================");
		  System.out.println("     EMI CALCULATOR      ");
		  System.out.println("====================================");
	      System.out.println("AMOUNT               "+am);
		  System.out.println("====================================");
		  System.out.println("DOWN PAYMENT         "+dp);
		  System.out.println("TOTAL                "+a);
		  System.out.println("YEAR                 "+yr);
		  System.out.println("INTEREST             "+it);
		  System.out.println("TOTAL INTEREST       "+itr);
		  System.out.println("MONTH                "+mo);
		  System.out.println("MONTHLY INTEREST     "+A);
		  System.out.println("====================================");
		  System.out.println("EMI                  "+em);
		  System.out.println("====================================");
		  System.out.println("====================================");
		  
		  
	}
	
	
	

}
