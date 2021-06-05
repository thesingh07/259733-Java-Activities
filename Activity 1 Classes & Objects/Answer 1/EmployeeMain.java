import java.util.Scanner;
public class EmployeeMain {
	public static void main(String args[]) {
		 Scanner s = new Scanner(System.in);
		 Employee obj = new Employee();
		 System.out.println("Enter the Name:");
         obj.setName(s.next());
         System.out.println("Enter the Address:");
         obj.setAddress(s.next());
         System.out.println("Enter the Mobile:");
         obj.setMobile(s.next());
         System.out.println("Employee Details");
         System.out.println("Name:" + obj.getName());
         System.out.println("Address:" + obj.getAddress());
         System.out.println("Mobile:" + obj.getMobile());
	}
}