import java.util.Scanner;

public class guess {
	public static void main (String args[])
	{
	  int a,b,c,d,e;
	  Scanner input=new Scanner(System.in);
	  System.out.println("enter any number between 1 to 10");
	  a=input.nextInt();
	  System.out.println("let a="+a);
	  b=a*2;
	  System.out.println(a+"*2="+b);
	  c=b*5;
	  System.out.println(b+"*5="+c);
	  d=c/a;
	  System.out.println(c+"/"+a+"="+d);
	  e=d-7;
	  System.out.println(d+"-7="+e);
	  System.out.println("The ans will be"+e);
	  System.out.println("which number you entered..the ans will always return 3 itself");
	  
	};

}
 