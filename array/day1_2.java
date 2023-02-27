// Java Program to find the frequency of each element in the array
package bridgelabz.com.array;
import java.util.Scanner;
public class day1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i <array.length; i++){
            int a = sc.nextInt();
            array[i]=a;
        }
        int[] visitedArray = new int[5];
        int visited = -1;
        for (int i=0;i<array.length;i++) {
            if (visitedArray[i] != visited) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        visitedArray[j] = visited;
                    }
                }
                visitedArray[i] = count;
            }
        }
        System.out.println("*******************");
        System.out.println("Elements : Frequency");
        for(int i =0;i<visitedArray.length;i++) {
            if(visitedArray[i]!=visited)
            {
                System.out.println("      " +array[i] +"      "+ visitedArray[i]);
            }
        }
    }
}
