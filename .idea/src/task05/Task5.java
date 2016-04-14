package task5;

import java.util.Scanner;

/**
 * Created by Victor on 13.04.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();


        if(a == b | a == c | b == c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
       }


    }
}


