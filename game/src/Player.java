package game.src;

public class Player {

    private boolean turnIndicator;

    public Player() {       //constructor
        this.turnIndicator = false;
        Account account = new Account();
    }

    public int getBalance() {       //getter
        return account.getBalance();
    }

    public void setBalance(int balance) {       //setter
        if(balance > 0){
            account.withdraw(balance);
        }
        else if(balance < 0){
            account.deposit(balance);
        }
    }

    public void setTurnIndicator(boolean turnIndicator) {       //sets turnIndicator to either true or false
        this.turnIndicator = turnIndicator;
    }

    public boolean isTurnIndicator() {     //gets turnIndicator
        return turnIndicator;
    }
}
