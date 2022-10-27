//-----------------------------------------------------------------
//  Parts of this code comes from Lewis/Loftus, Java software solutions
//-----------------------------------------------------------------

package game.src;

public class Account {
    private int balance;

    //-----------------------------------------------------------------
    //  Sets up the account by defining initial balance.
    //-----------------------------------------------------------------
    public Account () {
        balance = 0;
    }

    //-----------------------------------------------------------------
    //  Deposits the specified amount into the account. Returns the
    //  new balance.
    //-----------------------------------------------------------------
    public int deposit (int amount) {

        if (amount < 1){ // Guard condition to prevent negative deposits
            amount = 0;
            System.out.println("Error: Not possible to deposit negative founds");
        }
        balance = balance + amount;
        return balance;
    }

    //-----------------------------------------------------------------
    //  Withdraws the specified amount from the account. Returns the new balance.
    //-----------------------------------------------------------------
    public int withdraw (int amount) {

        if (amount < 1){ // Guard condition to prevent negative deposits
            amount = 0;
            System.out.println("Error: Not possible to withdraw negative founds");
        }

        if (amount > balance){ // Guard condition to prevent withdrawing an amount greater than the Account balance
            amount = 0;
            System.out.println("Error: Insufficient funds");
        }

        balance = balance - amount;
        if (balance < 0) {
            balance = 0;
        }

        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns the current balance of the account.
    //-----------------------------------------------------------------
    public int getBalance () {
        return balance;
    }

}
