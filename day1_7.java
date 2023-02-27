// Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
//The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is not a Leap Year and 2000 is a Leap Year.
package bridgelabz.com;
import java.util.Scanner;
public class day1_7 {
    public static void main(String[] args) {
        boolean leap = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int a = sc.nextInt();
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap=false;
        if (leap)
        {
            System.out.println("it is leap year");
        }
        else
            System.out.println("not leap year");
    }
}