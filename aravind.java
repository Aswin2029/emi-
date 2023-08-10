import java.util.Scanner;
public class aravind 
{
	public static void main(String[] args)
	{
		String s,e;
		double h,gst,j,g,f,N,U,K,A,B,C,r;
		Scanner input =new Scanner(System.in);
		 System.out.println("enter sl no:");
		 s = input.next();
		 System.out.println("NAME  :");
		 e = input.next();
		 System.out.println("QTY   :");
		 f = input.nextDouble();
		 System.out.println("PRICE :");
		 g = input.nextDouble();
		 h=f*g;
		 System.out.println("Enter CGST(%) :");
		 N = input.nextDouble();
		 System.out.println("Enter IGST(%) :");
		 U = input.nextDouble();
		 System.out.println("Enter SGST(%) :");
		 K = input.nextDouble();
		 A = h*N/100;
		 B = h*U/100;
		 C = h*K/100;
		 gst=h*N/100 +h*U/100 +h*K/100;
		 System.out.println("Discount   :");
		 r = input.nextDouble();
		 j = (gst+h)-r;
	  
	  System.out.println("                     D 9 nine");
	  System.out.println("                      KOTTAYI");
	  System.out.println("              PHONE NO.:8848018123 ");
      System.out.println("==========================================");
	  System.out.println("BILL NO.:23345               DATE:8/08/23");
	  System.out.println("==========================================");
	  System.out.println("SL NO.               :              "+s);
	  System.out.println("NAME                 :              "+e);
	  System.out.println("QTY                  :              "+f);
	  System.out.println("PRICE                :              "+g);
	  System.out.println("==========================================");
	  System.out.println("TOTAL                :              "+h);
	  System.out.println("==========================================");
	  System.out.println("CGST(5%)             :              "+A);
	  System.out.println("IGST(4%)             :              "+B);
	  System.out.println("SGST(2%)             :              "+C);
	  System.out.println("==========================================");
	  System.out.println("GST                  :              "+gst);
	  System.out.println("Discount             :              "+r);
	  System.out.println("==========================================");
	  System.out.println("GRAND TOTAL          :              "+j);
	  System.out.println("==========================================");
	  System.out.println("           THANK YOU VISIT AGAIN");
	  System.out.println("==========================================");
	  
	  }
	  }