
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dm = 0;                                    //Store Name
        System.out.println("Number of daytime minutes?");  //Asks to print name
        Scanner input = new Scanner(System.in);        //Create Scanner
        dm = input.nextInt();
        double em = 0;                                    //Store Name
        System.out.println("Number of evening minutes?");  //Asks to print name
        em = input.nextInt();
        double wm = 0;                                    //Store Name
        System.out.println("Number of weekend minutes?");  //Asks to print name
        wm = input.nextInt();
        double adm = dm - 100;
        if (adm < 0) {
            adm = 0;
        }
        double plana = wm * 0.2 + em * 0.15 + adm * 0.25;
        System.out.println("Plan A:" + plana + "$");
        adm = dm - 250;
        if (adm < 0) {
            adm = 0;
        }
        double planb = wm * 0.25 + em * 0.35 + adm * 0.45;
        System.out.println("Plan B:" + planb + "$");
        if (plana > planb) {
            System.out.println("Plan B is cheaper.");
        }
        if (plana < planb) {
            System.out.println("Plan A is cheaper.");
        }
        if (plana == planb) {
            System.out.println("Plan A and Plan B have equal price");
        }
    }
}
