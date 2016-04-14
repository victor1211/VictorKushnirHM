package task10;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = 0.5;
        System.out.println("1 minute cost:"+d+"grn");
        System.out.print("Enter a day of the week:");
        int a = sc.nextInt();
        System.out.print("Enter the number of minutes:");
        float b = sc.nextInt();
        if((a == 6) | (a == 7)){
            double c = (int) (b * d) - ((b * d) * 0.2);
            System.out.println("Price for talking:"+c);
        }else{
            System.out.println("Price for talking:"+(b * d));
        }
    }
}
