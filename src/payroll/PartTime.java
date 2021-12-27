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
public class PartTime extends Staff {
	
	private double hoursWeekly;
	
	public PartTime() {
			hoursWeekly = 0;
	}
	
	public PartTime(int id, String fName, String lName, String sexx, String birthDate, double rate,  double weeklyHours) {
			super(id, fName, lName, sexx, birthDate, rate);
			hoursWeekly = weeklyHours;
	}

	// get method
	public double getHoursWeekly() {
		return hoursWeekly;
	}

	//set method
	public void setHoursWeekly(double hoursWeekly) {
		this.hoursWeekly = hoursWeekly;
	}

	@Override
	public String toString() {
			String str = "ID : " + getID() + "\n";
			str += "Nama Karyawan : " + getFirstName() + " " + getLastName() + "\n";
			str += "Jenis Kelamin : " + getSex() ;
			str += "\nTanggal lahir : " + getDate();
			str += "\nGaji per jam : " + getHourlyRate();
			str += "\nJam kerja dalam seminggu : " + getHoursWeekly();
			return str;
	}
}
