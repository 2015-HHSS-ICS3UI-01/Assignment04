/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author singk4158
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Scanner input = new Scanner(System.in);
 
 
   	//ask user there name
 
   	System.out.println("What is your name");
 
   	//allow user input there name
 
        String name = input.next();
 
        // Ask user what the first test out of
 
   	System.out.println("What was the first test out of ");
 
   	//allow user to enter the test total
 
   	double test1 = input.nextInt();
 
   	// ask user there score on the first test
 
   	System.out.println("what was your score");
 
   	//user enters there score on the first test
 
   	double score1 = input.nextInt();
 
        //ask user what there socre was on the the second test
 
   	System.out.println("what was the second test out of");
 
   	//user enters the test total
 
   	double test2 = input.nextInt();
 
   	//ask user what there score was
 
   	System.out.println("whats was your score ");
 
   	//user enters their score
 
   	double score2 = input.nextInt();

        //ask user what there 3rd test was out of
 
   	System.out.println("what was the third test out of ");
 
   	//user enters there test total
 
   	double test3 = input.nextInt();
 
   	// ask user what there score was
 
   	System.out.println("what was your score ");
 
   	// allow user to input score
 
   	double score3 = input.nextInt();
 
        //ask user what the forth test was out of
 
   	System.out.println("what was the forth test out of ");
 
   	//allow user to enter test total
 
   	double test4 = input.nextInt();
 
        //ask user what there score was

   	System.out.println("What was your score ");
 
   	//allow user to enter score
 
   	double score4 = input.nextInt();
 
        //ask user what the 5th test was out of
 
   	System.out.println("What was the fifth test out of");
 
   	//allow user to to enters test amount
 
   	double test5 = input.nextInt();
 
   	//ask user what there score was
 
   	System.out.println("What was your score");
 
   	//allow user to enter score
 
   	double score5 = input.nextInt();
 
        //calculate percent mark for first test
 
   	double mark1 = score1 / test1 * 100;
 
   	//calculate percent mark for second test
 
   	double mark2 = score2 / test2 * 100;
 
   	//calculate percent mark for third test
 
   	double mark3 = score3 / test3 * 100;
 
   	//calculate percent mark for forth test
 
   	double mark4 = score4 / score4 * 100;
 
   	//calculate percent mark for fifth test
 
   	double mark5 = score5 / test5 * 100;
 
   	//calculate total average of test by adding all the marks and dividing that number by 5
 
   	double Average = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
 
        // print marks ass well as name of user
 
   	System.out.println("marks for " + name);
 
   	//print mark for test 1
 
   	System.out.println(" test1 " + mark1 + " %");
 
   	//print mark for second test
 
   	System.out.println(" test2 " + mark2 + " % ");
 
   	// print mark for third test
 
   	System.out.println(" test3 " + mark3 + " % ");
 
   	//print mark for forth test
 
   	System.out.println(" test4 " + mark4 + " % ");
 
   	// print mark for 5th test
 
   	System.out.println(" test5 " + mark5 + " % ");
 
   	// tell user there average for the 5 tests
 
   	System.out.println(name + " your Average is " + Average + " % ");
 

  
  }
}
 




   
    
    
    
    
    
    
    
    

