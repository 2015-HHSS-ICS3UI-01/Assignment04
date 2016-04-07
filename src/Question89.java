
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Question89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int placement = 1;

        while (true) {
            System.out.println("Player 1: Please roll the  6 sided dice and enter their combined sum: ");
            int outcome = input.nextInt();
            placement = (placement + outcome);

            if (outcome >= 2 && outcome <= 12) {
                if (placement <= 100) {
                    System.out.println("You are currently on square... " + placement);
                }
            }

            if (placement == 9) {
                System.out.println("You have climed a ladder, you are currently on square 34");
                placement = 34;
            }

            if (placement == 40) {
                System.out.println("You have climbed a ladder, you are currently on square 64");
                placement = 64;
            }

            if (placement == 67) {
                System.out.println("You have climbed a ladder, you are currently on square 86");
                placement = 86;
            }

            if (placement == 54) {
                System.out.println("You have slid on a snake, you are currently on square 19");
                placement = 19;
            }

            if (placement == 90) {
                System.out.println("You have slid on a snake, you are currently on square 48");
                placement = 48;
            }

            if (placement == 99) {
                System.out.println("You have slid on a snake, you are currently on square 77");
                placement = 77;
            }

            if (outcome <= 1) {
                System.out.println("Player 1 Quits! Player 2 WINS by default");
                break;
            }

            if (outcome >= 13) {
                System.out.println("Player 1 Quits! Player 2 WINS by default");
                break;
            }

            if (placement == 100) {
                System.out.println("Congratulations, PLAYER 1 WINS!");
                break;
            }

            System.out.println("Player 2: Please roll the  6 sided dice and enter their combined sum: ");
            int outcome2 = input.nextInt();
            placement = (placement + outcome2);

            if (outcome2 >= 2 && outcome2 <= 12) {
                if (placement <= 100) {
                    System.out.println("You are currently on square... " + placement);

                    if (outcome <= 1) {
                        System.out.println("Player 1 Quits! Player 2 WINS by default");
                        break;
                    }

                    if (outcome >= 13) {
                        System.out.println("Player 1 Quits! Player 2 WINS by default");
                        break;
                    }

                    if (placement == 9) {
                        System.out.println("You have climed a ladder, you are currently on square 34");
                        placement = 34;
                    }

                    if (placement == 40) {
                        System.out.println("You have climbed a ladder, you are currently on square 64");
                        placement = 64;
                    }

                    if (placement == 67) {
                        System.out.println("You have climbed a ladder, you are currently on square 86");
                        placement = 86;
                    }

                    if (placement == 54) {
                        System.out.println("You have slid on a snake, you are currently on square 19");
                        placement = 19;
                    }

                    if (placement == 90) {
                        System.out.println("You have slid on a snake, you are currently on square 48");
                        placement = 48;
                    }

                    if (placement == 99) {
                        System.out.println("You have slid on a snake, you are currently on square 77");
                        placement = 77;
                    }

                    if (outcome <= 1) {
                        System.out.println("Player 1 Quits! Player 2 WINS by default");
                        break;
                    }

                    if (outcome >= 13) {
                        System.out.println("Player 1 Quits! Player 2 WINS by default");
                        break;
                    }

                    if (placement == 100) {
                        System.out.println("Congratulations, PLAYER 2 WINS!");
                        break;
                    }
                }
            }
        }
    }
}
