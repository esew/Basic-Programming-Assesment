
package RPSGame;

import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        Scanner myScannerInt = new Scanner(System.in);
        
        while (true) {
            int numOfRound;
            System.out.println("Enter the number of rounds you want to play: ");
            numOfRound = myScannerInt.nextInt();
            if (numOfRound < 0 || numOfRound > 10) {
                System.out.println("ERROR!!! You can only play 1 - 10 rounds");
                break; // quits program
        }
            
            int tiesCount = 0;
            int userWinsCount = 0;
            int computerWinsCount = 0;
            
            for (int i = 0; i < numOfRound; i++) {
                System.out.println("Round " + (i + 1));
            String[] rockPaperScissors = {"Rock", "Paper", "Scissors"};
            String computerMove = rockPaperScissors[new Random().nextInt(rockPaperScissors.length)];
            
            String playerMove;
            
            while (true) {
                System.out.println("Enter your move: Rock, Paper, or Scissors");
                playerMove = myScanner.nextLine();
                if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not playable.");
            }
            System.out.println("Your opponent played: " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
                tiesCount++;
            }
            else if (playerMove.equals("Rock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You lose!");
                    computerWinsCount++;
               
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("You win!");
                    userWinsCount++;
                }
            }
            
            else if (playerMove.equals("Paper")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("You win!");
                    userWinsCount++;
                
                } else if(computerMove.equals("Scissors")) {
                    System.out.println("You lose!");
                    computerWinsCount++;
                }
            }
            
            else if (playerMove.equals("Scissors")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You win!");
                    userWinsCount++;
                
                } else if (computerMove.equals("Rock")) {
                    System.out.println("You lose!");
                    computerWinsCount++;
                }
            }
            }
            
            System.out.println("Total number of ties: " + tiesCount);
            System.out.println("Total number of user wins: " + userWinsCount);
            System.out.println("Total number of computer wins: " + computerWinsCount);
            
            if (userWinsCount > computerWinsCount) {
                System.out.println("Congrats! You Won!");
            } else if (computerWinsCount > userWinsCount) {
                System.out.println("The computer wins! You'll get em next time!");
            } else 
                System.out.println("It was a tie! Looks like you HAVE to play again!");
            
            System.out.println("Would you like to play again? Yes or No");
            String playAgain = myScanner.nextLine();
            
            if (!playAgain.equals("Yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        myScanner.close();
        myScannerInt.close();
    }
}
