package task9;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter growth:");
        int a = sc.nextInt();
        double b = (a - 100) * 1.15;
        if(b > a){
            System.out.println("You need to lose weight");
        }if(b < 0){
            System.out.println("You need to get fat");
        }if(b == 0){
            System.out.println("You are great");
        }
    }
}
