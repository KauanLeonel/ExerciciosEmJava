package Lista3.Ex04;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Data {
    private int day;
    private int mounth;
    private int year;

    public Data() {
        JOptionPane.showMessageDialog(null, LocalDate.now());
    }

    public Data(int day, int mounth, int year) {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    public void ToString() {
        String dateString = "";
        dateString = this.day + "/" + this.mounth + "/"+ this.year;
        System.out.println(dateString);
    }

    public void Increase(){
        this.day++;
        //FAZER A VALIDAÇÃO DO MÊS E ANO E BLÁ BLÁ BLÁ
    }

    public int Same(String Date1, String Date2){
        if (Date1 == Date2) return 0 ;
        else{
            return 1;
        }
    }

    // #region Getters and Setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    // #endregion
}
