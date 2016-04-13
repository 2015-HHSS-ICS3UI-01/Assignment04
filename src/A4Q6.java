/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author singk4158
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //CREATE NEW SCANNER
 
 
   	Scanner input = new Scanner(System.in);
 
   	//ask user smount of daytime minutes
 
   	System.out.println("Number of daytime minutes ");
 
   	//allow user to enter number of daytime minutes
 
   	double daytime = input.nextDouble();
 
   	//ask user amount of evening  minutes
 
   	System.out.println("Number of Evening minutes");
 
   	//allow user to enter amount of evening minutes
 
   	double evening = input.nextDouble();
 
   	// ask user to enter amount of weekend minutes
 
   	System.out.println("Number of weekend minutes");
 
   	//allow user to enter weekend minutes
 
   	double weekend = input.nextDouble();
 
        // set the daytime min to 100 if they are are less than 100
 
   	if (daytime < 100) {
 
       	daytime = 100;
 
   	}
        
        //calcualate total Cost of plan A

   	double planA = (daytime - 100) * 0.25 + evening * 0.15 + weekend * 0.20;
 
   	//calculate total for plan B
 
   	// if the day time minutes are less than 250 set daytime min to 250
 
   	if (daytime < 250) {
 
       	daytime = 250;
 
   	}
 
   	//round the cost of plan a to two decimal places
 
   	planA = Math.round(planA * 100) / 100.0;
 
        //calculate total cost for plan b
 
   	double planB = (daytime - 250) * 0.45 + evening * 0.35 + weekend * 0.25;
 
   	// let user know what plan a cost
 
   	System.out.println("Plan A costs " + planA);
 
   	//let user kno what plan b cost
 
   	System.out.println("Plan B costs " + planB);
 
   	//if plan a is more than plan b, then tell user plan b is cheaper
 
        // round cost of plan B to two decimals places
 
   	planB = Math.round(planB * 100) / 100.0;
 
        if (planA > planB) {
 
       	System.out.println("Plan B is cheaper");
 
       	//plan b is more than plan a then let user know plan a is cheaper
 
   	} else if (planB > planA) {
 
       	System.out.println("Plan A is cheaper");
 
        } //if pln a and plan b are the same price,let user know both plans are the same price
 
   	else if (planA == planB) {
 
       	System.out.println("Plan A and Plan B are the same price");
 



 
   	}
    }
 }
   

