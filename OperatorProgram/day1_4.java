// Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
package bridgelabz.com.OperatorProgram;
import java.util.Scanner;
public class day1_4 {
    public static void main(String[] args) {
        int x,y;
        double dis;
        Scanner sc=new Scanner(System.in);
	    System.out.println("enter x1 point");
        x=sc.nextInt();
        System.out.println("enter y1 point");
        y=sc.nextInt();
        double ed = Math.pow((x*x+y*y),0.5);
        System.out.println(ed);
}
}
