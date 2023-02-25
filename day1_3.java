// Write a program to check two strings are equal or not.
package bridgelabz.com;
public class day1_3 {
    public static void main(String[] args) {
    String s1 = "India";
    String s2 = "india";
    if(s1 == s2)
    {
        System.out.println("String is not equal ");
    }
    else {
        System.out.println("String is equal");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
    }
}
