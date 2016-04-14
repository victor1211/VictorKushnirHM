package home2_2;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Home2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.print("Enter c:");
        int c = sc.nextInt();

        if (a < b & a < c) {
            System.out.println("min number is " + a);
        } else if (b < a & b < c) {
            System.out.println("min number is " + b);
        } else if (c < a & c < b) {
            System.out.println("min number is " + c);
        }

        if (a > b & a > c) {
            System.out.println("max number is " + a);
        } else if (b > a & b > c) {
            System.out.println("max number is " + b);
        } else if (c > a & c > b) {
            System.out.println("max number is " + c);
        }
    }
}
