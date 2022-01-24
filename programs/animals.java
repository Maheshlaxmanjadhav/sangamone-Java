class animal{
	public void tail() {
		System.out.println("I have a trail");
	}
	public void bark() {
		System.out.println("I will bark");
	}
}

class dog extends animal{
	public void color() {
		System.out.println("my color is black");
	}
}


public class animals {
	public static void main(String[] args) {
		dog d=new dog();
		d.color();
		d.tail();
		d.bark();
	}
}
