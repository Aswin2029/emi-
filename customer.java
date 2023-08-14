import java.util.Scanner;
public class customer {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to bsnl customer care ");
		System.out.println("enter the mobile number : ");
		System.out.println("1 report an issue : ");
		System.out.println("2 know about previous request ");
		System.out.println("3 exit");
		int customer = input.nextInt() ;
		switch (customer) {
		  case 1:
		    System.out.println("please wait while connecting to our server : ");
		    break;
		  case 2:
		    System.out.println("enter the request id");
		    int requestId = input.nextInt();
		    System.out.println("fetching information for request id : "+requestId);
		    break;
		  case 3:
			System.out.println("Thankyou for contacting us.");
			break;
			default:
			System.out.println("please select a valid number.");
		}
	}
	      
	}
