// Java Program to print the duplicate elements of an array
package bridgelabz.com.array;
import java.util.Scanner;
public class day1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=1;i<arr.length;i++)
        {
            System.out.println("Enter the elements of array:- ");
            int a = sc.nextInt();
            arr[i]=a;
        }
        for (int j =1;j<arr.length;j++)
        {
            System.out.print(arr[j]);
        }

        System.out.println(" ");

        for(int x=1;x<arr.length-1;x++)
        {
            for (int y=x+1;y<arr.length;++y)
            {
                if(arr[x]==arr[y])
                {
                    System.out.println(arr[x]+ " is the duplicate element");
                    break;
                }
            }
        }
    }
}
