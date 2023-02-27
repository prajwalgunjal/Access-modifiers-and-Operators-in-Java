// Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
package bridgelabz.com.OperatorProgram;
import java.util.Scanner;
public class day1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month:- ");
        int n = sc.nextInt();
        System.out.println("Enter date:-");
        int m = sc.nextInt();
        if(n==3)
        {
            if(m>21){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        if (n==4 || n ==5) {
            if (m>0 && m<31){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        if (n ==6)
        {
            if(m < 21)
            {
                System.out.println("True");
            }
            else {
                System.out.println("false");
            }
        }
    }
}
