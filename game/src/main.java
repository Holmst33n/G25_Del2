package game.src;
import java.util.*;
public class main {

    public static void main(String[] args) {

        Player player1 = new Player();      //creates object player1
        Player player2 = new Player();      //creates object player2
        Board board = new Board();          //creates object board
        player1.setTurnIndicator(true);     //sets turnIndicator of player1 to true
        Scanner buffer = new Scanner(System.in);    //creates a buffer used to press enter to play next turn
        String turn;
        System.out.println("Welcome to the game! Press Enter to play each turn.");

        do{         //this do while loop runs until a player hits 3000 coins
            if(player1.isTurnIndicator()){          //plays player1's turn
                turn = buffer.nextLine();
                board.playTurn();
                player1.setBalance(board.getThrowResult());      //updates balance of player1
                player1.setTurnIndicator(false);        //removes turnIndicator from player1

                if(board.isExtraTurn()){        //checks if player1 has an extra turn
                    player1.setTurnIndicator(true);
                    System.out.println("Player1 has earned an extra turn!");
                    board.setExtraTurn(false);
                }
                else{
                    player2.setTurnIndicator(true);     //hands over the turn to player2
                }

                if(player1.getBalance() < 0) player1.setBalance(0);     //ensures player1 balance can't be below zero

                System.out.println("Player1 balance: " + player1.getBalance());
                if(player1.getBalance() > 3000){        //checks if player 1 has won, then breaks out of do while
                    break;
                }
            }

            if(player2.isTurnIndicator()){          //plays player2's turn
                turn = buffer.nextLine();
                board.playTurn();
                player2.setBalance(board.getThrowResult());      //updates balance of player2
                player2.setTurnIndicator(false);        //removes turnIndicator from player2

                if(board.isExtraTurn()){        //checks if player2 has an extra turn
                    player2.setTurnIndicator(true);
                    System.out.println("Player2 has earned an extra turn!");
                    board.setExtraTurn(false);
                }
                else{
                    player1.setTurnIndicator(true);     //hands over the turn to player1
                }

                if(player2.getBalance() < 0) player2.setBalance(0);     //ensures player2 balance can't be below zero

                System.out.println("Player2 balance: " + player2.getBalance());
                if(player2.getBalance() > 3000){        //checks if player 2 has won, then breaks out of do while
                    break;
                }
            }
        }while(player1.getBalance() < 3000 && player2.getBalance() < 3000);

        if(player1.getBalance() > 3000) System.out.println("Player1 has won!");         //checks if player one has won
        else if(player2.getBalance() > 3000) System.out.println("Player2 has won!");    //checks if player two has won
    }
}
