//  Write a Program to reverse the integer number eg. Input n=231 reverse is 132
package bridgelabz.com.whileloop;
import java.util.Scanner;
public class day1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int a = sc.nextInt();
        int rev = 0;
        while(a!=0)
        {
            int last = a%10;
            rev = rev*10+last;
            a=a/10;
        }
        System.out.println(rev);
    }
}
