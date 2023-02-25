// Write a Program to reverse the integer number eg. Input n=231 reverse is 132
package bridgelabz.com.forloop;
import java.util.Scanner;
public class day1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int reverse = 0;

        for (;a!=0;a=a/10)
        {
            int last = a%10;
            reverse = reverse * 10 + last;
        }
        System.out.println("reversed number is " +reverse);
    }
}
