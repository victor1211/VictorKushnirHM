package task12;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter wind character:");
        int a = sc.nextInt();
        if(a >= 1 & a <= 4){
            System.out.println("The wind in weak");
        }if(a >= 5 & a <= 10){
            System.out.println("The wind is moderate");
        }if(a >= 11 & a <= 18){
            System.out.println("The wind in strong");
        }if(a >= 19){
            System.out.println("The wind is hurricane");
        }
    }
}
