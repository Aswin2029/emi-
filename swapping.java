
public class swapping {
	public static void main(String args[])
  {
	int x=200 , y=100;
	
	System.out.println("Before swaping");
	System.out.println(" x = " + x);
	System.out.println(" y =" + y);
	
	x= x * y;
	y=x/y;
	x=x/y;		
			
	
	System.out.println("After swaping");
	System.out.println(" x = " + x);
	System.out.println(" y = " + y);
  }

}
 