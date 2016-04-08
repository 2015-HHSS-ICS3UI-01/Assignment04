
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String name;
 

        Scanner input = new Scanner(System.in);

        System.out.println("Hello student, please print your name.");
        name = input.nextLine();

        System.out.println("Hello " + name + " what was your first test out of?");
        double a = input.nextDouble();
        System.out.println("What did you get on the test?");
        double b = input.nextDouble();
        double ab = b / a * 100;

        System.out.println("What was your second test out of?");
        double c = input.nextDouble();
        System.out.println("What did you get on the test?");
        double d = input.nextDouble();
        double dc = d / c * 100;

        System.out.println("What was your third test out of?");
        double e = input.nextDouble();
        System.out.println("What did you get on the test?");
        double f = input.nextDouble();
        double ef = f / e * 100;

        System.out.println("What was your fourth test out of?");
        double g = input.nextInt();
        System.out.println("What mark did you get on the test?");
        double h = input.nextInt();
        double gh = h / g * 100;

        System.out.println("What was your fifth test out of?");
        double i = input.nextDouble();
        System.out.println("What did you get on the test?");
        double j = input.nextDouble();
        double ij = j / i * 100;

        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + ab + "%");
        System.out.println("Test 2: " + dc + "%");
        System.out.println("Test 3: " + ef + "%");
        System.out.println("Test 4: " + gh + "%");
        System.out.println("Test 5: " + ij + "%");
        
        double avg = (ab + dc + ef + gh + ij) / 5;
        
        System.out.println("Test Average: " + avg + "%");
        
    }
}
