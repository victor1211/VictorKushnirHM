package Home2_4;
import java.util.Scanner;
/**
 * Created by Victor on 14.04.2016.
 */
public class Home2_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");


        double a = sc.nextDouble();

        if(a >=0 && a <= 1){
            System.out.println("The number " + a + " it ranges from 0 to 1");
        }else{
            System.out.println("The number " + a + " Doesn't ranges from 0 to 1");
        }



    }

}
