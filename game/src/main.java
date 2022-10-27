package game.src;
import java.util.*;
public class main {

    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        Board board = new Board();

        player1.setTurnIndicator(true);

        do{
            board.playTurn();
            if(player1.isTurnIndicator()){
                player1.setBalance(player1.getBalance() + board.getThrowResult());
                player1.setTurnIndicator(false);
                System.out.println("Player1 has earned " + board.getThrowResult());
                if(board.isExtraTurn()){
                    player1.setTurnIndicator(true);
                    System.out.println("Player1 has earned an extra turn!");
                    board.setExtraTurn(false);
                }
                else{
                    player2.setTurnIndicator(true);
                }
                System.out.println("Player1 balance: " + player1.getBalance());
            }
            board.playTurn();
            if(player2.isTurnIndicator()){
                player2.setBalance(player2.getBalance() + board.getThrowResult());
                player2.setTurnIndicator(false);
                System.out.println("Player2 has earned " + board.getThrowResult());
                if(board.isExtraTurn()){
                    player2.setTurnIndicator(true);
                    System.out.println("Player2 has earned an extra turn!");
                    board.setExtraTurn(false);
                }
                else{
                    player1.setTurnIndicator(true);
                }
                System.out.println("Player2 balance: " + player2.getBalance());
            }


        }while(player1.getBalance() < 3000 && player2.getBalance() < 3000);

        if(player1.getBalance() > 3000) System.out.println("Player1 has won!");
        else if(player2.getBalance() > 3000) System.out.println("Player2 has won!");
    }

}
