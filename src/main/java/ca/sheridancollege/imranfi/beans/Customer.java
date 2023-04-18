// this is Customer bean used to store attributes of each customer.
package ca.sheridancollege.imranfi.beans;


public class Customer{
	private String fName;
	private String lName;
	private String email;
	private String  phoneNo;
	
	public Customer() {
		super();
	}
	public Customer(String fName, String lName, String email, String phoneNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}
	
}