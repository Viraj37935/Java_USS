package Encapsulation;

public class Encapsulation_First {

	public static void main(String[] args) {
		
		Car C = new Car();
		
		C.setModel(788515);
		C.setCarName("Safari");
		C.setCompany("Tata");
		
		C.showrrom();
		System.out.println(C.getName());
		System.out.println(C.getCompany());
		System.out.println(C.getId());

	}

}

class Car{
	
	int count = 0; 
	private int C_ModelNum;
	String C_Name;
	String C_Company;
	
	public Car() {
		//System.out.println(C_ModelNum);
		count++;
		System.out.println("Object Created..... ");
		System.out.println("Object Number: "+ count);
	}
	
	public void setModel(int Num) {
		
		this.C_ModelNum=Num;
	}
	
	public void setCarName(String name) {
		
		this.C_Name=name;
	}
	
	public void setCompany(String name) {
		
		this.C_Company=name;
	}
	
	public String getName() {
		
		return this.C_Name;
	}
	
	public String getCompany()
	{
		return this.C_Company;
	}
	
	public int getId()
	{
		return this.C_ModelNum;
	}
	
	public void showrrom() {
		
		System.out.println("Just Buy Your Dream");
	}
	
}
