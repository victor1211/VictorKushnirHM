package task8;
import java.util.Scanner;
/**
 * Created by Victor on 13.04.2016.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a price of product = ");
        int a = sc.nextInt();
        if(a > 1000){
            double b = (int) a-(a * 0.1);
            System.out.println("The product price is" + " " +b);
        }else{
            System.out.println("The product price is" + " " +a);
        }
    }
}
