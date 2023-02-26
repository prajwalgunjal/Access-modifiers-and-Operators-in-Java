// Java Program to sort the elements of an array in ascending order
package bridgelabz.com.array;
import java.util.Scanner;
public class day1_9 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=1 ;i<arr.length;i++)
        {
            System.out.println("Enter the value of array :- ");
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.println("original array");
        System.out.println("*************************");
        for (int j =1;j<arr.length;j++)
        {
            System.out.print(arr[j]);
        }
        System.out.println(" ");
        //sorting
        System.out.println("Aftrer sorting ........");
        System.out.println("**************************");
        int temp=0;
        for (int k = 1 ;k<arr.length;k++)
        {
            for (int z=k+1;z<arr.length;z++)
            {
                if(arr[k] > arr[z])
                {
                    temp=arr[k];
                    arr[k]=arr[z];
                    arr[z]=temp;
                }
            }
        }
        for (int p= 1;p<arr.length;p++)
        {
            System.out.print(arr[p]+ " ");
        }
    }
}