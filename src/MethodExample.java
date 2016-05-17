
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pearr2740
 */
public class MethodExample {

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void sayHello(String name) {
        System.out.println("Hello" + name);
        sayHello("Ryan Pearson");
    }
    // returns the distance between (x1, x2, y1, y2)

    public static double distance(int x1, int y1, int x2, int y2) {
        double ans = Math.sqrt((x2 - x1) * ((x2 - x1)) + (y2 - y1) * (y2 - y1));
        return ans;
    }

    public static void toBinary(int num) {
        // string to store answer
        StringBuilder ans = new StringBuilder("");
        //storing the quotient and remainder
        int q = num;
        int r = 0;
        //while quotiant is not 0
        while (q != 0) {
            //store the remiander 
            //when dividing by 2
            r = q % 2;
            //divide quotiant
            q = q / 2;
            //apende the remainder
            ans.append(r);

        }
        //write answer backwards
        ans.reverse();
        //output 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sayHello();
        sayHello("Ryan, 5");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the point,(x1,y1) on seperate lines");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.println("Please enter the point,(x2,y2) on seperate lines");
        int secondx = input.nextInt();
        int secondy = input.nextInt();
        //use my distance method
        double distance = distance(x1, y1, secondx, secondy);
        System.out.println("The distance between those points is" + distance);
        toBinary(2635);
    }
}
