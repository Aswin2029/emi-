import java.util.Scanner;
public class even {
	public static void main (String[] args){
		int n, even = 0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number : ");
		n= sc.nextInt();
		for(i = 1; i <= n; i++){
			if(i % 2 == 0){
				even = even + i;
				}
			}
		System.out.println("\n The sum of numbers upto"+ n +" = " + even);
	}

}
