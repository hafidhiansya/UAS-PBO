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
public class Staff extends Employee {
	/**
	 * Hourly rate of staff
	 */
	private double hourlyRate;
	
	public Staff() {
			hourlyRate = 0;
	}

	public Staff(int id, String fName, String lName, String sexx, String birthDate, double rate) {
			// Call super class constructor
			super(id, fName, lName, sexx, birthDate);
			
			// Set hourly rate
			hourlyRate = rate;
	}
	
	/**
	 * @return get method
	 */
	public double getHourlyRate() {
			return hourlyRate;
	}
	
	public void setHourlyRate(double hourlyRate) {
			this.hourlyRate = hourlyRate;
	}

	@Override
	public double monthlyEarning() {
			return hourlyRate;
	}
	
	@Override
	public String toString() {
			return String.format("%s\nRate gaji per jam : %s", super.toString(), monthlyEarning());
	}
	
}
