
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;                                   //Store Name
        String place = "first";
        System.out.println("Please print your name:");  //Asks to print name
        Scanner input = new Scanner(System.in);        //Create Scanner
        name = input.nextLine();                       //Whatever is printed is saved as name
        int a = 0;
        double test1 = 0;
        double test2 = 0;
        double test3 = 0;
        double test4 = 0;
        double test5 = 0;
        while (a < 5) {
            System.out.println("What was your " + place + " test out of?");
            double testtotal = input.nextInt();
            System.out.println("How many marks did you get?");
            double testmark = input.nextInt();
            double percent = (testmark / testtotal) * 100;
            a = a + 1;
            if (a == 1) {
                test1 = percent;
                place = "second";
            }
            if (a == 2) {
                test2 = percent;
                place = "third";
            }
            if (a == 3) {
                test3 = percent;
                place = "fourth";
            }
            if (a == 4) {
                test4 = percent;
                place = "fifth";
            }
            if (a == 5) {
                test5 = percent;
            }
        }
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + test1 + "%");
        System.out.println("Test 2: " + test2 + "%");
        System.out.println("Test 3: " + test3 + "%");
        System.out.println("Test 4: " + test4 + "%");
        System.out.println("Test 5: " + test5 + "%");
        double average = (test1 + test2 + test3 + test4 + test5) / 5;
        System.out.println("Average: " + average + "%");
    }
}
