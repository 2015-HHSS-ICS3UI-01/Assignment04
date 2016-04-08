
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int location = 1;
        int location2 = 1;
        boolean done = false;

        //Player 1
        while (true) {
            System.out.println("Player 1, enter sum of dice.");
            int dice = input.nextInt();
            location = location + dice;

            //Exceeding/equal/invalid numbers
            if (location > 100) {
                System.out.println("Player 1, sorry, you exceeded 100 squares. You are now at the 80th square.");
                if (location >= 100) {
                    location = 80;
                }
            }
            if (location == 100) {
                System.out.println("Player 1, congratulations! You have won!");
                break;
            }
            if (dice < 2) {
                System.out.println("Player 1, you Quit! Player 2, you have won!");
                break;
            }
            if (dice >= 13) {
                System.out.println("Player 1, your input is wrong. Please try again next turn.");
                location = location - dice;
            } else if (dice == 0) {
                System.out.println("Player 1, you Quit! Player 2, you have won!");
                break;
            }

            if (location == 100) {
                done = true;
            } else {
                System.out.println("Player 1, you are now on square " + location + ".");

                //Encounters with snakes and ladder
                if (location == 54) {
                    location = 19;
                    System.out.println("Player 1, you've been eaten by a snake! Yikes! You've descended to square 19.");
                } else if (location == 90) {
                    location = 48;
                    System.out.println("Player 1, you've been eaten by a snake! Yikes! You've descended to square 48.");
                } else if (location == 99) {
                    location = 77;
                    System.out.println("Player 1, you've been eaten by a snake! Yikes! You've descended to square 77.");
                }
                if (location == 9) {
                    location = 34;
                    System.out.println("Player 1, you've climbed a ladder! You have landed on square 34.");
                } else if (location == 40) {
                    location = 64;
                    System.out.println("Player 1, you've climbed a ladder! You have landed on square 64.");
                } else if (location == 67) {
                    location = 86;
                    System.out.println("Player 1, you've climbed a ladder! You have landed on square 86.");
                }

                //Player 2
                System.out.println("Player 2, enter sum of dice.");
                int dice2 = input.nextInt();
                location2 = location2 + dice2;

                //Exceeding/equal/invalid numbers
                if (location2 > 100) {
                    System.out.println("Player 2, sorry, you exceeded 100 squares. You are now at the 80th square.");
                    if (location2 >= 100) {
                        location2 = 80;
                    }
                }
                if (location2 == 100) {
                    System.out.println("Player 2, congratulations! You have won!");
                    break;
                }

                if (dice2 < 2) {
                    System.out.println("Player 2, you Quit! Player 1, you have won!");
                    break;
                }
                if (dice2 >= 13) {
                    System.out.println("Player 2, your input is wrong. Please try again next turn.");
                    location2 = location2 - dice2;
                } else if (dice2 == 0) {
                    System.out.println("Player 2, you Quit! Player 1, you have won!");
                    break;
                }
                if (location == 100) {
                    done = true;
                } else {
                    System.out.println("Player 2, you are now on square " + location2 + ".");

                    //Encounters with snakes and ladder
                    if (location2 == 54) {
                        location2 = 19;
                        System.out.println("Player 2, you've been eaten by a snake! Yikes! You've descended to square 19.");
                    } else if (location2 == 90) {
                        location2 = 48;
                        System.out.println("Player 2, you've been eaten by a snake! Yikes! You've descended to square 48.");
                    } else if (location2 == 99) {
                        location2 = 77;
                        System.out.println("Player 2, you've been eaten by a snake! Yikes! You've descended to square 77.");
                    }
                    if (location2 == 9) {
                        location2 = 34;
                        System.out.println("Player 2, you've climbed a ladder! You have landed on square 34.");
                    } else if (location2 == 40) {
                        location2 = 64;
                        System.out.println("Player 2, you've climbed a ladder! You have landed on square 64.");
                    } else if (location2 == 67) {
                        location2 = 86;
                        System.out.println("Player 2, you've climbed a ladder! You have landed on square 86.");
                    }
                }
            }
        }
    }
}
