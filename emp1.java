package employee1;

class employee21 {
	int salary;
	String Name;
	public int getSalary() {
		salary=35000;
		return salary;
	}
	public String getName() {
		setName();
		return Name;
	}
	public void setName() {
		Name="Mahesh";
	}
}
public class emp1{
	public static void main(String[] args) {
		employee21 emp=new employee21();
		int slr=emp.getSalary();
		String name=emp.getName();
		System.out.println("Name: "+name);
		System.out.println("salary: "+slr);
		
	}
}
