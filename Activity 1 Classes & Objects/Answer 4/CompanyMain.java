import java.util.Scanner;
public class CompanyMain {
	public static void main(String[] args) {
				 Scanner s = new Scanner(System.in);
				 Company obj = new Company();
				 System.out.println("Enter the company name:");
		         obj.setName(s.nextLine());
		         System.out.println("Enter the employees:");
		         obj.setEmployees(s.nextLine());
		         System.out.println("Enter Teamlead:");
		         obj.setTeamlead(s.nextLine());
		         obj.checkLead();
		         if(obj.match==1) {
			         System.out.println("Name:" + obj.getName());
			         System.out.println("Employees:" + obj.getEmployees());
					System.out.println("Lead:" + obj.getTeamlead());
					}
				else {
						System.out.println("Invalid input");
					}
			}
}

