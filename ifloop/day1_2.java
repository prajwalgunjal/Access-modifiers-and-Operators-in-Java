// Read a Number 1,10,100,1000 and display unit, ten hundred
package bridgelabz.com.ifloop;
import java.util.Scanner;
public class day1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int a = sc.nextInt();
        if(a==10)
        {
            System.out.println("You entered ten unit");
        }
        else if (a==100) {
            System.out.println("you entered hundred unit ");
        }
        else if (a==1000) {
            System.out.println("you entered thousand unit ");
        }
        else if (a == 1) {
            System.out.println("you entered one unit ");
        }
        else {
            System.out.println("invalid input......!!!!!");
        }
    }
}
