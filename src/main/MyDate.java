package main;
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1978, 1, 1);
        DateTask date2 = new DateTask(1984, 9, 21);
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
       // display leapyears
       System.out.println("Leap Years:");
        for (int i = date1.getYear(); i <= date2.getYear(); i++) {
            if (isLeapYear(i)) {
                System.out.println(i);
            }
    }
}

public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}
}