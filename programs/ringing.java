package phone;

import java.util.Scanner;

class ring {
	public void ringing1() {
		System.out.println("Your Phone is ringing");
	}
	public void vibrating() {
		System.out.println("Your Phone is vibrating");
	}
}
public class ringing{
	public static void main(String[] args) {
		ring rg=new ring();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ringing 2.vibrating");
		System.out.println("Enter your Choice in words");
		String str=sc.nextLine();
		System.out.println("entered string is:"+str);
		if(str.equals("ringing")) {
			rg.ringing1();}
		else if(str.equals("vibrating")) {
			rg.vibrating();}
		else {
		 System.out.println("Enter correct choice");
		 }
	}
}