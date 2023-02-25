// Write a Program to find Palindrome Number
package bridgelabz.com.forloop;
import java.util.Scanner;
public class day1_3 {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        temp =a;
        int reverse = 0;
        for (; a != 0; a = a / 10) {
            int last = a % 10;
            reverse = reverse * 10 + last;
        }
        System.out.println("reversed number is " + reverse);
        if(temp==reverse)
        {
            System.out.println("palimdrome");
        }
        else {
            System.out.println("not palimdrome ");
        }
    }
}

