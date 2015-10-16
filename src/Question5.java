/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author whitb0039
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        //make new scanner

        System.out.println("Please enter your name:");
        //ask user to enter their name

        String userName = in.next();
        //input users name

        System.out.println("What was your first test out of?");
        //aske user what the first test was out of

        double testOneTotal = in.nextDouble();
        //input total marks of test one

        System.out.println("How many marks did you get?");
        //ask user how many marks they got

        double testOneCorrect = in.nextDouble();
        //input total number of marks correct

        System.out.println("What was your second test out of?");
        //aske user what the first test was out of

        double testTwoTotal = in.nextDouble();
        //input total marks of test one

        System.out.println("How many marks did you get?");
        //ask user how many marks they got

        double testTwoCorrect = in.nextDouble();
        //input total number of marks correct

        System.out.println("What was your third test out of?");
        //aske user what the first test was out of

        double testThreeTotal = in.nextDouble();
        //input total marks of test one

        System.out.println("How many marks did you get?");
        //ask user how many marks they got

        double testThreeCorrect = in.nextDouble();
        //input total number of marks correct

        System.out.println("What was your fourth test out of?");
        //aske user what the first test was out of

        double testFourTotal = in.nextDouble();
        //input total marks of test one

        System.out.println("How many marks did you get?");
        //ask user how many marks they got

        double testFourCorrect = in.nextDouble();
        //input total number of marks correct

        System.out.println("What was your fifth test out of?");
        //aske user what the first test was out of

        double testFiveTotal = in.nextDouble();
        //input total marks of test one

        System.out.println("How many marks did you get?");
        //ask user how many marks they got

        double testFiveCorrect = in.nextDouble();
        //input total number of marks correct

        double testOneMark = testOneCorrect/testOneTotal*100;
        //calculate test one percentage
        
        double testTwoMark = testTwoCorrect/testTwoTotal*100;
        //calculate test two percentage
        
        double testThreeMark = testThreeCorrect/testThreeTotal*100;
        //calculate test three percentage
        
        double testFourMark = testFourCorrect/testFourTotal*100;
        //calculate test four percentage
        
        double testFiveMark = testFiveCorrect/testFiveTotal*100;
        //calculate test five percentage
        
        double totalAverage = (testOneMark+testTwoMark+testThreeMark+testFourMark+testFiveMark)/5;
        //calculate total avergae of five tests
        
        System.out.println("Test scores for "+userName+":");
        //outout "Test scares for user:"
        
        System.out.println("");
        //make a space
        
        System.out.printf("Test one score: %.2f ",testOneMark);
        //output test one mark
        
        System.out.println("");
        //make a space
        
        System.out.printf("Test two score: %.2f ",testTwoMark);
        //output test two mark
        
        System.out.println("");
        //make a space
        
        System.out.printf("Test three score: %.2f ",testThreeMark);
        //output test three mark
        
        System.out.println("");
        //make a space
        
        System.out.printf("Test four score: %.2f ",testFourMark);
        //output test four mark
        
        System.out.println("");
        //make a space
        
        System.out.printf("Test five score: %.2f %",testFiveMark);
        //output test five mark
        
        System.out.println("");
        //make a space
        
        System.out.println("");
        //make a space
        
        System.out.printf("The total average of "+userName+"'s test scores: %.2f ",totalAverage);
        //output the total average for the user
        
        System.out.println("");
        //output a final space
        


    }
}
