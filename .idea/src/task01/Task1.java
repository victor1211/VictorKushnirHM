package task1;

import java.util.Scanner;

/**
 * Created by Victor on 14.04.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.print("Enter c:");
        int c = sc.nextInt();


        if(a == Math.sqrt(a * a + c * c)){
            System.out.println("triangle is rectangular");
        }
        if(b == Math.sqrt(a * a + c * c)){
            System.out.println("triangle is rectangular");
        }
        if(c == Math.sqrt(a * a + b * b)){
            System.out.println("triangle is rectangular");
        }else{
            System.out.println("Error");
        }


    }
}
