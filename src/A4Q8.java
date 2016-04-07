
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int count = 1;
        while (count < 100) {
            System.out.println("Enter sum of dice:");
            int sum = input.nextInt();
            if (sum < 2 || sum > 12) {
                System.out.println("You quit!");
                input.close();
            }
            if (sum >= 2 && sum <= 12) {
                count = count + sum;
                if (count == 9) {
                    count = 34;
                }
                if (count == 40) {
                    count = 64;
                }
                if (count == 54) {
                    count = 19;
                }
                if (count == 67) {
                    count = 86;
                }
                if (count == 90) {
                    count = 48;
                }
                if (count == 99) {
                    count = 77;
                }
                if (count > 100) {
                    count = count - sum;
                }



                System.out.println("You are now on square " + count);
                if (count == 100) {
                    System.out.println("You win!");
                }


            }


        }

    }
}
