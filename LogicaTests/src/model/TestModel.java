package model;

public class TestModel {
	
	private String firstname;
	private String lastname;
	
	public int cube(int a) {
		return (int) Math.pow(a, 3);
		
	}
	
	//getter-setter for fname and lname
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
