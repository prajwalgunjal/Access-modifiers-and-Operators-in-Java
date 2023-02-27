// Write a Program to reverse the integer number eg. Input n=231 reverse is 132
package bridgelabz.com.forloop;
import java.util.Scanner;
public class day1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int reverse = 0;

        for (;a!=0;a=a/10)  //231 //23 //
        {
            int last = a%10;// 231  1  3 2
            reverse = reverse * 10 + last; // 132
        }
        System.out.println("reversed number is " +reverse);
    }
}
