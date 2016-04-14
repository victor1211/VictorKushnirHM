package home2_3;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Home2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        if(a % 7 == 0){
            int b = a * a;
            System.out.println("A = " + b);
        }else{
            System.out.println("A = " + a);
        }
    }
}
