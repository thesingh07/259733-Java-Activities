
public class Customer {
	private String name;
	private String address;
	private String mobile;
	public  String str;
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
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
	public void assign() {
		String[] str1= str.split(",");
		for(int i=0;i<3;i++) {
			name=str1[0];
			address=str1[1];
			mobile=str1[2];
			
		}
	}
}
