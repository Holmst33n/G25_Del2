package game.src;

public class Player {

    private int balance;
    private boolean turnIndicator;

    public Player() {       //constructor
        this.turnIndicator = false;
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }       //getter

    public void setBalance(int balance) {       //setter
        this.balance = balance;
    }

    public void setTurnIndicator(boolean turnIndicator) {       //sets turnIndicator to either true or false
        this.turnIndicator = turnIndicator;
    }

    public boolean isTurnIndicator() {     //gets turnIndicator
        return turnIndicator;
    }
}
