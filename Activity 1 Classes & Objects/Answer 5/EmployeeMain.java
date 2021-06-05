import java.util.Scanner;
public class EmployeeMain {
	public static void main(String args[]) {
		 Scanner s = new Scanner(System.in);
		 Employee obj = new Employee();
		 String ch;
		 System.out.println("Enter the Name:");
         obj.setName(s.nextLine());
         System.out.println("Enter the Address:");
         obj.setAddress(s.nextLine());
         System.out.println("Enter the Mobile:");
         obj.setMobile(s.nextLine());
         obj.Display();
         System.out.println("Verirfy or Update the details:");
         do {
        	  obj.Menu();
        	  ch = s.nextLine();
        	 switch(ch){
        		 case "1":
        			 System.out.println("Current name is: " + obj.getName());
        			 System.out.println("Enter the Name");
        			 obj.setName(s.nextLine()) ;
        			 break;
        		 case "2":
        			 System.out.println("Current address is: " + obj.getAddress());
        			 System.out.println("Enter the Address");
        			 obj.setAddress(s.nextLine());
        			 break;
        		 case "3":
        			 System.out.println("Current mobile is: " + obj.getMobile());
        			 System.out.println("Enter the Phone");
        			 obj.setMobile(s.nextLine());
        			 break;
        		 default: break;
        	 }
         }while(!ch.equals("4"));
        obj.Display();
         
	}
}