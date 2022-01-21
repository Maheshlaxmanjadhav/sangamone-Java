package phone;

import java.util.Scanner;

class switchring {
	public void ringing1() {
		System.out.println("Your Phone is ringing");
	}
	public void vibrating() {
		System.out.println("Your Phone is vibrating");
	}
}
public class ringswitch {
	public static void main(String[] args) {
		ring rg=new ring();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ringing 2.vibrating");
		System.out.println("Enter your Choice");
		int a=sc.nextInt();
		switch(a){
			case 1:rg.ringing1();break;
			case 2:rg.vibrating();break;
			default:System.out.println("Enter correct choice");	
		}
}
}
