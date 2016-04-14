package task6;

import java.util.Scanner;

/**
 * Created by Victor on 13.04.2016.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed:");
        int a = sc.nextInt();
        System.out.print("Enter distance:");
        int b = sc.nextInt();
        int t = b / a;
        System.out.println("You arrive in:"+t+"h");

    }
}
