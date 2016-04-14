package task7;
import java.util.Scanner;
/**
 * Created by Victor on 13.04.2016.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month:");
        int a = sc.nextInt();
        if((a == 1) | (a == 2) | (a == 3)){
            System.out.println("You choose winter");
        }if((a == 4) | (a == 5) | (a == 6)){
            System.out.println("You choose spring");
        }if((a == 7) | (a == 8) | (a == 9)){
            System.out.println("You choose summer");
        }if((a == 10) | (a == 11) | (a == 12)){
            System.out.println("You choose winter");
        }if(a > 12){
            System.out.println("Error");
        }
    }
}
