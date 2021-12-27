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
public class Education {
    String degree, major;
    int research;

    public Education(String degree, String major, int research){
        this.degree=degree;
        this.major=major;
        this.research=research;
    }

    public Education(){
        
    }
    
    public void setDegree(String degree){
        this.degree=degree;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public void setResearch(int research){
        this.research=research;
    }

    public String getDegree(){
        return degree;
    }
    public String getMajor(){
        return major;
    }
    public int getResearch(){
        return research;
    }

    public String toString(){
        String str = "Gelar :" +getDegree();
        str += "\nBidang Keahlian :" +getMajor();
        str += "\nJumlah Penelitian :" +getResearch();

        return str;
    }

}

