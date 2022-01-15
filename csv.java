package read;

import java.io.BufferedReader;
import java.io.FileReader;

public class csv {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("src\\city.csv"));
			String s;
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			br.close();
		}catch(Exception ex){
			return;			
		}
	}
}
