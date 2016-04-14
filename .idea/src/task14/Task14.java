package task14;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter i:");
        int i = sc.nextInt();
        int a = i % 10, b = (i / 10 ) % 10, c = (i / 100) % 10, d = (i / 1000) % 10, e = (i / 10000) % 10, f = (i / 100000) % 10;

        if((a + b + c) == (d + e + f)){
            System.out.println("Lucky number");
        }else{
            System.out.println("No lucky number");
        }
    }
}
