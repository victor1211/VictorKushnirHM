package task4;

/**
 * Created by Victor on 13.04.2016.
 */
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed in km/h:");
        int a = sc.nextInt();
        System.out.print("Enter speed in m/s:");
        int b = sc.nextInt();
        a = a * 1000 / 3600;

        if(a > b){
            System.out.println("Speed in km/h more then in m/s");
        }else{
            System.out.println("Speed in m/c more then in km/h");
        }

    }
}
