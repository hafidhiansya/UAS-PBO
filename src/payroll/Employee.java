/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Asus
 */

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String sex;
	private String date;
	private int ID;
	
	public Employee() {
			firstName = "";
			lastName = "";
			sex = "";
			date = "";
			ID = 0;
	}
	
	public Employee(int id, String fName, String lName, String sexx, String birthDate) {
			firstName = fName;
			lastName = lName;
			ID = id;
			sex = sexx;
			date = birthDate;	
	}
	@Override
	public String toString() {
			return String.format("ID : %s\nNama Karyawan: %s %s\nJenis Kelamin : %s\nTanggal Lahir : %s", ID, firstName, lastName, sex, date);
	}
	
	//metode setter
	public void setID(int id) {
			ID = id;
	}

	public void setFirstName(String firstName) {
			this.firstName = firstName;
	}
	
	
	public void setLastName(String lastName) {
			this.lastName = lastName;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setDate(String date) {
		this.date = date;
	}

	/* Getter methods */
	
	public int getID() {
			return ID;
	}
	
	public String getFirstName() {
			return firstName;
	}
	
	public String getLastName() {
			return lastName;
	}

	public String getSex() {
		return sex;
	}

	public String getDate() {
		return date;
	}
	 // Abstract method untuk returns the monthly earning.
	 
	public abstract double monthlyEarning();
}
