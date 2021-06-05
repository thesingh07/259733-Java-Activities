import java.util.Scanner;
public class InningsMain {
	public static void main(String[] args) {
				 Scanner s = new Scanner(System.in);
				 Innings obj = new Innings();
				 System.out.println("Enter the Team Name:");
		         obj.setTeamname(s.next());
		         System.out.println("Enter session:");
		         obj.setInningsname(s.next());
		         System.out.println("Enter runs:");
		         obj.setRuns(s.nextInt());
		         obj.displayInningsDetails();
			}
	}
