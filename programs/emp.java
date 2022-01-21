package employee;

public class emp {
	int id;
	int salary;
	String Name;
	public void Display() {
		System.out.println("Id: "+id);
		System.out.println("name:"+Name);
		System.out.println("Salary:"+salary);
	}
	public void Init() {
		id=1;
		salary=35000;
		Name="mahesh";
	}
	public static void main(String[] args) {
		emp a=new emp();
		a.Init();
		a.Display();
	}

}