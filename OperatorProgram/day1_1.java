// Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c

package bridgelabz.com.OperatorProgram;
import java.sql.SQLOutput;
import java.util.Scanner;
public class day1_1 {

    public static void one(int a, int b,int c)
    {
        System.out.println("a+b*c");
        int ans = a+b*c;
        System.out.println(ans);
    }
    public static void two(int a ,int b,int c)
    {
        //c+a/b
        System.out.println("c+a/b");
        int ans = c+a/b;
        System.out.println(ans);
    }
    public static void three(int a , int b, int c)
    {
        System.out.println("a%b+c");
        int ans = a%b+c;
        System.out.println(ans);
    }
    public static void four(int a , int b, int c)
    {
        System.out.println("a*b+c");
        int ans = a*b+c;
        System.out.println(ans);
    }
    public static int choice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose which operation you want to perform:- ");
        System.out.println(" 1 : a+b*c");
        System.out.println(" 2 : c+a/b");
        System.out.println(" 3 : a%b+c");
        System.out.println(" 4 : a*b+c");
        System.out.println("ENter your choice");

        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A:-");
        int a = sc.nextInt();
        System.out.println("Enter value of B:-");
        int b = sc.nextInt();
        System.out.println("Enter value of C:-");
        int c = sc.nextInt();

        int choice = choice();

        switch(choice)
        {
            case 1:
            {
                one(a,b,c);
                break;
            }
            case 2:
            {
                two(a,b,c);
                break;
            }
            case 3:
            {
                three(a,b,c);
                break;
            }
            case 4:
            {
                four(a,b,c);
                break;
            }
            default:
            {
                System.out.println("please Enter valid Choice ");
            }
        }

    }
}
