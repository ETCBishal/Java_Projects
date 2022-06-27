/*

Author : Bishal jaiswal
purpose : Practice program
Name : Guess the number Game
 
*/

import java.util.Scanner;
class Game{
    public int noOfGuesses = 0;
    public boolean isCorrectNumber = false;
    public int computerGuess;
    public int userGuess;
    
    public Game(){
        computerGuess = (int) (Math.random()*100);
    }

    public void takeUserInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Guess the number\n> ");
        int userNumber = userInput.nextInt();
        userGuess = userNumber
        ;
        if (userGuess>computerGuess) {
            System.out.println("Please guess the lesser number than this.");
        }
        else if (userGuess<computerGuess) {
            System.out.println("Please guess the greater number than this.");
        }
    }

    public void isCorrectNumber(){
        if (computerGuess == userGuess) {
            isCorrectNumber = true;
            if (noOfGuesses>1) {
                System.out.format("Congrats you guessed the number in %d guesses.\n",noOfGuesses);
            }
            else{
                System.out.format("Congrats you guessed the number is %d guess.\n",noOfGuesses);
            }
        }
        
    }

    public void setNoOfGuesses(){
        noOfGuesses+=1;

    }

    public int getNoOfGusses(){
        return noOfGuesses;
    }


}

public class gusessTheNumber{
    public static void main(String[] args) {
        Game guessGame = new Game();
        while (guessGame.isCorrectNumber!=true) {
            guessGame.takeUserInput();
            guessGame.isCorrectNumber();
            guessGame.setNoOfGuesses();
            System.out.println("No.of Guesses: "+guessGame.getNoOfGusses());
            
        }
        
    }
}