//  Java Program to print the elements of an array
package bridgelabz.com.array;
import java.util.Scanner;
public class day1_1 {
    public static void main(String[] args) {
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);
    for (int i = 1 ;i< arr.length;i++)
    {
        System.out.println("Enter the values");
        int a = sc.nextInt();
        arr[i]=a;
    }

    for (int j = 1;j<arr.length;j++)
    {
        System.out.print(arr[j] + " ");

    }
    }
}
