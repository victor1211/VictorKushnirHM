package task15;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Task15B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of circle:");
        double a = sc.nextInt();
        System.out.println("Enter the area of square:");
        double b = sc.nextInt();
        double r = Math.sqrt(a / 3.14);
        double s = Math.sqrt(2 * b);

        if(s < r){
            System.out.println("Fit a square into a circle");
        }else{
            System.out.println("Error");
        }

    }
}
