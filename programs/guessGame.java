import java.util.Scanner;

class Ggame{
	Ggame(){
		int a=(int)(Math.random()*(100-1+1)+1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess Your number between 1 and 100");
		int num=sc.nextInt();
		boolean found=false;
		while(!found) {
		if(num>a) {
			System.out.println("Too big, Try again");
	        num=sc.nextInt();
		}
		else if(num<a) {
			System.out.println("Too small, Try again");
			num=sc.nextInt();
		}
		else if(num==a) {
			System.out.println("congratulation");
			System.out.println("Guess number: "+num+"\nComputer Number: "+a);
			found=true;
		}
		}
		
	}
}
public class guessGame {
	public static void main(String[] args) {
		Ggame g=new Ggame();
	}
}