// Java Program to print the largest element in an array
package bridgelabz.com.array;
import java.util.Scanner;
public class day1_3 {
    public static void main(String[] args) {
        int[] arr = new int[5];// array declaration
        // add elements
        Scanner sc = new Scanner(System.in);

        for (int i =1;i<arr.length;i++) {
            System.out.println("Enter the values :- ");
            int a = sc.nextInt();
            arr[i]= a;
        }

        for (int j= 1;j<arr.length;j++)
        {
            System.out.print(arr[j]);
        }
        int b = arr[1];
        for (int k=2;k<arr.length;k++)
        {
            if(b<arr[k])
            {
                b=arr[k];
            }
        }
        System.out.println("maximum value is :- " +b);


    }
}
