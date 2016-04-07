
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int count = 1;
        int count2 = 1;
        while (count < 100 && count2 < 100) {
            System.out.println("Player 1 enter sum of dice:");
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
                    System.out.println("Player 1 wins!");
                    
                }
                if(count < 100){
                System.out.println("Player 2 enter sum of dice:");
                int sum2 = input.nextInt();
                if (sum2 < 2 || sum2 > 12) {
                    System.out.println("You quit!");
                    input.close();
                }
                if (sum2 >= 2 && sum2 <= 12) {
                    count2 = count2 + sum2;
                    if (count2 == 9) {
                        count2 = 34;
                    }
                    if (count2 == 40) {
                        count2 = 64;
                    }
                    if (count2 == 54) {
                        count2 = 19;
                    }
                    if (count2 == 67) {
                        count2 = 86;
                    }
                    if (count2 == 90) {
                        count2 = 48;
                    }
                    if (count2 == 99) {
                        count2 = 77;
                    }
                    if (count2 > 100) {
                        count2 = count2 - sum2;
                    }
                    System.out.println("You are now on square " + count2);


                    if (count2 == 100) {
                        System.out.println("Player 2 wins!");
                    }
                }
                }


            }

        }
    }
}