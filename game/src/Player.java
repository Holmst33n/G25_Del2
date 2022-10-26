package game.src;

public class Player {

    private int balance = 0;
    private boolean turnIndicator;

    public Player() {       //constructor
        turnIndicator = false;
    }

    public int getBalance() {
        return balance;
    }       //getter

    public void setBalance(int balance) {       //setter
        this.balance = balance;
    }

    public void setTurnIndicator(int a) {       //sets turnIndicator to either true or false by setting a to 1 or 0
        if(a == 1) {
            turnIndicator = true;
        }
        else if (a == 0) {
            turnIndicator = false;
        }
    }

    public boolean getTurnIndicator() {     //gets turnIndicator
        return turnIndicator;
    }
}
