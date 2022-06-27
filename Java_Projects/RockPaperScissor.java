/*
Author : Bishal jaiswal
Purpose : PP [ Practice Problem ] -> loops and conditionals
*/

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner askMove = new Scanner(System.in);

        int myScore = 0;
        int opponentScore = 0;
        int chance = 6;

        while (chance > 0) {
            System.out.println("\nEnter rock, paper, scissor and type [quit] to exit");
            String myMove = askMove.nextLine();

            // check for exit
            if (myMove.equals("quit") || (myMove.equals("exit"))) {
                break;
            }

            // check for valid move
            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissor")) {
                System.out.println("Invalid move!");

            }
            // opponent move
            int rand = (int) (Math.random() * 3);
            String opponentMove = "";
            if (rand == 0) {
                opponentMove = "rock";

            } else if (rand == 1) {
                opponentMove = "paper";

            } else {
                opponentMove = "scissor";
            }

            // Check the win,lost and tie
            if (myMove.equals(opponentMove)) {
                System.out.println("\nYou both move same! TIE...");

            } else if ((myMove.equals("paper") && opponentMove.equals("rock"))
                    || (myMove.equals("scissor") && opponentMove.equals("paper"))
                    || (myMove.equals("rock") && opponentMove.equals("scissor"))) {
                myScore++;
                System.out.println("\nYou win");
                System.out.println("\nYour score: " + myScore + "\nOpponentScore: " + opponentScore);
                System.out.println("\nYou: " + myMove + "\nOpponent: " + opponentMove);

            } else {
                opponentScore++;
                System.out.println("You: " + myMove + "\nOpponent: " + opponentMove);
                System.out.println("\nYour score: " + myScore + "\nOpponentScore: " + opponentScore);
                System.out.println("You lost!");
            }
            chance--;
            System.out.println(chance + " chance is left out of 6 chances.");
        }
        if (myScore > opponentScore) {
            System.out.println("\n\n\t\t*** Final Score ***");
            System.out.println("\n\t\tYour score: " + myScore + "\n\t\tOpponentScore: " + opponentScore);
            System.out.println("\n\t\tYou own the Match :D");
        } else if (myScore < opponentScore) {
            System.out.println("\n\n\t\t*** Final Score ***");
            System.out.println("\n\t\tYour score: " + myScore + "\n\t\tOpponentScore: " + opponentScore);
            System.out.println("\n\t\tOpponent own the Match.");
        } else {
            System.out.println("\n\n\t\t*** Final Score ***");
            System.out.println("\n\t\tYour score: " + myScore + "\n\t\tOpponentScore: " + opponentScore);
            System.out.println("\n\t\tTie");
        }

        System.out.println("\nThank you for playing :)");
        askMove.close();
    }
}