//  Java Program to print the elements of an array in reverse order
package bridgelabz.com.array;
import java.util.Scanner;
public class day1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i=1;i<arr.length;i++)
        {
            System.out.println("Enter the values of array:- ");
            int a=sc.nextInt();
            arr[i]=a;

        }

        System.out.print("array in straight order");


        for (int j=1;j<arr.length;j++)
        {
            System.out.print(arr[j]);
            System.out.println(" ");
        }

        System.out.println("array in reverse order");
        for (int k=arr.length-1;k>arr[0];k--)
        {
            System.out.print(arr[k]);
        }
    }
}
