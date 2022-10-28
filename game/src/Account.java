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
        balance = 1000;
    }

    //-----------------------------------------------------------------
    //  Deposits the specified amount into the account. Returns the
    //  new balance.
    //-----------------------------------------------------------------
    public int deposit (int amount) {
        balance = balance + amount;
        return balance;
    }

    //-----------------------------------------------------------------
    //  Withdraws the specified amount from the account. Returns the new balance.
    //-----------------------------------------------------------------
    public int withdraw (int amount) {

        balance = balance + amount;
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
