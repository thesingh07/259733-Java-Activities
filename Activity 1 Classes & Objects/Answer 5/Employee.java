import java.util.Scanner;
public class Employee {
	Scanner s = new Scanner(System.in);
	private String name;
	private String address;
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void Display() {
		System.out.println("Employee Details");
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Mobile:" + mobile);
	}
	public void Menu() {
		System.out.println("Menu");
		System.out.println("1. Update Employee Name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee Mobile");
		System.out.println("4. All information Correct/Exit");
	}
}
