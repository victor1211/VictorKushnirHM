package task3;

import java.util.Scanner;

/**
 * Created by Victor on 13.04.2016.
 */
public class Task3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter i:");
        int i = sc.nextInt();
        int a = i%10, b = (i / 10 ) % 10, c = i / 100;
        System.out.println("The same number");
        if((a == b) & (a == c) & (b == c)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}


