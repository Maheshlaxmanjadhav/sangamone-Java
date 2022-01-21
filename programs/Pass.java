package password1;

import java.util.Random;

public class Pass {
	public static void main(String[] args) {
	String capital= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  String small= "abcdefghijklmnopqrstuvwxyz";
	  String num= "0123456789";
	  String special= "$%&@!()?";
	  String combine=capital+small+num+special;
	  Random r=new Random();
	  char[] pass=new char[10];
	  for(int i=0;i<10;i++) {
		  for(int j=0;j<10;j++) {
			  pass[j]=combine.charAt(r.nextInt(combine.length()));
		  }
	  System.out.println(pass);
	  }
}
}
