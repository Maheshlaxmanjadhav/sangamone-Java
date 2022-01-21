package location;

import java.util.Scanner;

public class pincode {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pincode to find the location:");
		int a=sc.nextInt();
		if(a==762104) {
			String name="Daringbadi, orissa";
			System.out.println("The location name for the pincode is:"+name);
		}else
			System.out.println("Invalid pincode");
	}
}
