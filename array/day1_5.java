// Java Program to print the elements of an array present on an even position
package bridgelabz.com.array;
import java.util.Scanner;
public class day1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 1 ; i<arr.length;i++)
        {
            System.out.println("Enter the values of array:- ");
            int a = sc.nextInt();
            arr[i]=a;
        }
        for (int j = 1;j<arr.length;j++)
        {
            if (j%2==0) {
                System.out.print(arr[j]);
            }
        }
    }
}
