package task11;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money:");
        int a = sc.nextInt();
        if(a % 10 == 1){
            System.out.println(+a+" "+"Kopeika");
        }if(a % 10 <= 4 & a % 10 >= 2){
            System.out.println(+a+" "+"Kopeiki");
        }if((a % 10 <= 9 & a % 10 >= 5) | a % 10 == 0){
            System.out.println(+a+" "+"Kopeek");
        }
    }
}
