package game.src;

public class Player {

    private int balance = 0;
    private boolean turnIndicator;

    public Player() {       //constructor
        this.turnIndicator = false;
    }

    public int getBalance() {
        return balance;
    }       //getter

    public void setBalance(int balance) {       //setter
        this.balance = balance;
    }

    public void setTurnIndicator(boolean turnIndicator) {       //sets turnIndicator to either true or false by setting a to 1 or 0
        this.turnIndicator = turnIndicator;
    }

    public boolean isTurnIndicator() {     //gets turnIndicator
        return turnIndicator;
    }
}
