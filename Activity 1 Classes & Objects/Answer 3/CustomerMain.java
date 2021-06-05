import java.util.Scanner;
public class CustomerMain {
	public static void main(String args[]) {
		 Scanner s = new Scanner(System.in);
		 Customer obj = new Customer();
		 System.out.println("Enter the details:");
         obj.setStr(s.nextLine());
         obj.assign();
         System.out.println("Employee Details");
         System.out.println("Name:" + obj.getName());
         System.out.println("Address:" + obj.getAddress());
         System.out.println("Mobile:" + obj.getMobile());
	}
}