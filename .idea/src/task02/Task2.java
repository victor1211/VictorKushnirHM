package task2;

/**
 * Created by Victor on 13.04.2016.
 */
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.print("Enter c:");
        int c = sc.nextInt();

        if(a > 0){
            System.out.println("a ="+(int)Math.pow(a, 3));
        }else {
            System.out.println("a = 0");
        }
        if(b > 0){
            System.out.println("b ="+(int)Math.pow(b, 3));
        }else{
            System.out.println("b = 0");
        }
        if(c > 0){
            System.out.println("c ="+(int)Math.pow(c, 3));
        }else{
            System.out.println("c = 0");
        }


    }
}
