
public class Company {
	private String name;
	private String employees;
	private String teamlead;
	public int match = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	public void checkLead() {
		String[] str1= employees.split(",");
		int len = str1.length;
		for(int i=0;i<len;i++) {
			if(teamlead.equalsIgnoreCase(str1[i])) {
				match=1;
			}
		}
		
	}
}
