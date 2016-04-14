package home2_5;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Home2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        if(a > b){
            int c = a - b;
            System.out.println("A - B = " + c);
        }if(a < b){
            int d = a + b;
            System.out.println("A + B = " + d);
        }

    }

}
