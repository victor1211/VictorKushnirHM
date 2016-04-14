package home2_6;
/**
 * Created by Victor on 15.04.2016.
 **/
import java.util.Scanner;

public class Home2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int c = a + b;
        if(c >= 11 & c <= 19){
            System.out.println("C = " + c);
        }

    }
}
