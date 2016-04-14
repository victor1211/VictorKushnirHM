package task13;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        int d = a + b + c;
        if(d > 0){
            System.out.println("A = " +a * 2 +" " + "B = " +b * 2 +" " + "C = " +c * 2);
        }else {
            System.out.println("A = " +0 +" " + "B = " +0 +" " + "C = " +0);
        }
    }
}
