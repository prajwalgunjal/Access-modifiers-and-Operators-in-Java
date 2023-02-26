// Find 2nd Largest Number in an Array
package bridgelabz.com.array;
import java.util.Scanner;
public class day1_10 {
    public static void main(String[] args) {
    int temp;
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    for(int i=1;i<arr.length;i++)
    {
        System.out.println("Enter the elements:- ");
        int a = sc.nextInt();
        arr[i]=a;
    }

    for(int z =0;z<arr.length;z++)
    {
        for (int j=z+1;j<arr.length;j++)
        {
            if(arr[z]>arr[j])
            {
                temp = arr[z];
                arr[z]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int x=1;x< arr.length;x++) {
        System.out.print(arr[x]);
        System.out.println("");

    }
        System.out.println("second largest element is :- ");
        System.out.println(arr[arr.length-2]);
    }
}
