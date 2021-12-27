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
public class PayrollMain {

    
    public static void main(String[] args) {
        // Membuat method Employee
            Employee[] emp = new Employee[9];
            
            // Staff
            emp[0] = new Staff(123, "Allen", "Paita", "M", "2/23/59", 50);
            emp[1] = new Staff(456, "Zapita", "Steven", "F", "7/12/64", 35);
            emp[2] = new Staff(789, "Rios", "Enrique", "F", "6/2/70", 40);
            // Faculty
            emp[3] = new Faculty(243,  "Jhonson", "Anne", "F", "4/27/62", Faculty.Level.FU, new Education("PhD", "Enginering", 3)) ;
            emp[4] = new Faculty(791, "Bouris", "William", "F", "3/14/75", Faculty.Level.AO, new Education("PhD" , "English", 1));
            emp[5] = new Faculty(623, "Andrade", "Christoper", "F", "5/22/80", Faculty.Level.AS, new Education("MS", "Computer science", 0));
            // Part-time
            emp[6] = new PartTime(455, "Guzman", "Augusto", "F", "8/10/77", 35, 30);
            emp[7] = new PartTime(678, "Depiro", "Martin", "F", "9/15/87", 30, 15);
            emp[8] = new PartTime(945, "Aldaco", "Marque", "M", "11/24/88", 20, 35);
  
            double totalSalaryOfAll=0;
            double totalSalaryOfPartime=0;

            // a. Print out all employee information
            System.out.println("Program Payroll Kelompok 13 UAS PBO\n\n");
            System.out.println("Informasi Seluruh Karyawan\n");
            
            for(int i = 0; i < emp.length; i++) {
                if (i<= emp.length){
                        System.out.println(emp[i].toString());
                    System.out.println();
                }
            }
           
            for(int i = 0; i < emp.length; i++) {
                    
                if (i==0){
                        System.out.println("Staff\n");
                }
                else if(i==3){
                        System.out.println("Faculty\n");
                }
                else if(i==6){
                        System.out.println("Part-Time\n");
                }
                
                System.out.println(emp[i].toString());
                    System.out.println();
                    totalSalaryOfAll+=emp[i].monthlyEarning();
                    
                    if (emp[i] instanceof PartTime){
                            totalSalaryOfPartime+=emp[i].monthlyEarning();
                    }
                }
            
            //b. Print Out Part-Time Staff Salary Detail
                System.out.println("Total gaji Per Bulan Seluruh Staff Part-Time : $"  + totalSalaryOfPartime +"\n");
                
            //c. Print Out All Employees Salary Detail
                System.out.println("Total gaji Per Bulan Seluruh karyawan : $"  + totalSalaryOfAll +"\n");
            }
    }
    
