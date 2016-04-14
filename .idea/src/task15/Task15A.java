package task15;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Task15A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of circle:");
        double a = sc.nextInt();
        System.out.println("Enter the area of square:");
        double b = sc.nextInt();
        double r = Math.sqrt(a / 3.14);
        double s = Math.sqrt(b);
        if(r < s){
            System.out.println("Fit a circle into a square");
        }else{
            System.out.println("Error");
        }

    }
}
