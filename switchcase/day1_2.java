// Write a Program to print the month name for the given number
package bridgelabz.com.switchcase;
import java.util.Scanner;
public class day1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int a = sc.nextInt();
           switch(a)
           {
               case 1: {
                   System.out.println("jan");
                   break;
               }
               case 2: {
                   System.out.println("feb");
                   break;
               }
               case 3: {
                   System.out.println("march");
                   break;
               }
               case 4:
               {
                   System.out.println("april");
                   break;
               }
               case 5:
               {
                   System.out.println("may");
                   break;
               }
               case 6:
               {
                   System.out.println("june");
                   break;
               }
               case 7:
               {
                   System.out.println("july");
                   break;
               }
               case 8:
               {
                   System.out.println("aug");
                   break;
               }
               case 9:
               {
                   System.out.println("sept");
                   break;
               }
               case 10:
               {
                   System.out.println("oct");
                   break;
               }
               case 11:
               {
                   System.out.println("november");
                   break;
               }
               case 12:
               {
                   System.out.println("december");
                   break;
               }
               default:
               {
                   System.out.println("Please Enter Valid number");
               }
           }
    }

}
