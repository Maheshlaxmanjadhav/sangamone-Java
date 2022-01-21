package phone;

import java.util.Scanner;

class calculate1{
	public int sql(int a) {
		int c=(int) Math.sqrt(a);
		return(c);
	}
}
public class squartRoot {
	public static void main(String[] args) {
		calculate1 cal=new calculate1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int b=sc.nextInt();
		System.out.println("Square root of "+b+" is:" +cal.sql(b));
	}
}
