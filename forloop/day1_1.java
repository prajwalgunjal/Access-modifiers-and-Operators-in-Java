// Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
package bridgelabz.com.forloop;
import java.util.Scanner;
public class day1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int sum =0;

        for (int i=1;i<=a;i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
