package main;

public class DateTask {

 private int year;
 private int month;
 private int day;

 DateTask(int year,int month,int day){
    this.day = day;
    this.month = month;
    this.year = year;
 }
 public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

public int getMonth() {
    return month;
}

public void setMonth(int month) {
    this.month = month;
}

public int getDay() {
    return day;
}

public void setDay(int day) {
    this.day = day;
}

public String toString(){
    return String.format("%02d/%02d/%04d", day, month, year);
 }
 public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

}
}