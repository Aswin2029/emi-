import java.util.Scanner;
public class atm {
	public static void main (String[] args)
	{
		String userid,password,a,b,ENTER;
		double k,AMOUNT,WIDTHRAW,balance;
		Scanner input = new Scanner(System.in);
		System.out.println("userid  :");
		userid = input.next();
		System.out.println("password:  ");
		password = input.next();
		a = "Aswin";
		b = "Raju";
		if (userid.equals(a) && password.equals(b))
		{
				System.out.println("1.Saving Acc");
				System.out.println("2.Current Acc");
				System.out.println("3.Balance Enquiry");
				ENTER = input.next();  
				k = 9000;
				System.out.println("ENTER THE AMOUNT");
				AMOUNT = input.nextInt();
				if (AMOUNT>k){
					System.out.println("INSUFFICIENT BALANCE");
					System.out.println("AVAILABLE BALANCE"+k);}
				else {System.out.println("wdthraw successfully"); 
				balance = k - AMOUNT ;
				System.out.println("BALANCE AMOUNT"+balance);
				}
		}
     else 
		{
			System.out.println("INVALID USER NAME AND PASSWORD");
		}
		
  }
}	


