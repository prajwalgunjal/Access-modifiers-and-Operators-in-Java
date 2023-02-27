//Write a program to demonstrate static variables, methods, and blocks.
package bridgelabz.com;
import java.util.Scanner;
public class day1_6 {
    // static varible declaration
    static int a=10;
    static int b=20;

    static int c=22;
    static int d=5000;
// Ststic method declaration
    static void display(){
        System.out.println("this is static method ");
        System.out.println("this is static varibales");
        System.out.println(day1_6.c);
        System.out.println(day1_6.d);
    }

    public static void main(String[] args) {
// static method calling
        day1_6.display();
        // static varible calling
        System.out.println("static value of a is :- " +day1_6.a);
        System.out.println("Static value of b is :- " +day1_6.b);
    }
}
