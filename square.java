package phone;

import java.util.Scanner;

class calculate{
	public int sql(int a) {
		return a*a;
	}
}
public class square {
	public static void main(String[] args) {
		calculate cal=new calculate();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int b=sc.nextInt();
		System.out.println("Square of "+b+" is:" +cal.sql(b));
	}
}
