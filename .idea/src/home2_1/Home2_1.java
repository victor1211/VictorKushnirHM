package home2_1;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Home2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an hour from 1 to 24:");
        int a = sc.nextInt();
        if(a > 9 & a < 18){
            System.out.println("I am working");
        }else{
            System.out.println("I am free");
        }
    }
}
