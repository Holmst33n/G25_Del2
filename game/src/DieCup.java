package game.src;

public class DieCup {

    private int rollValue;

    public DieCup() {
        rollValue = 0;
    }

    public void throwDice() {
        Die die1 = new Die();
        Die die2 = new Die();
        die1.roll();
        die2.roll();
        this.rollValue = die1.getFaceValue() + die2.getFaceValue(); // we plus the to dies together
    }
    public int getRollValue() {
        return this.rollValue;
    } // We get the total rollvalue

}



