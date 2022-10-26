package game.src;

public class DieCup {

    private int rollValue;

    public DieCup() {
        rollValue = 0;
    }

    public static void throwDice();
        Die die1 = new Die();
        Die die2 = new Die();
        Die1.roll();
        Die2.roll();
        this.rollValue = Die1.getFaceValue() + Die2.getFaceValue(); // we plus the to dies together

    public int getRollValue() {
        return rollValue;
    } // We get the total rollvalue

}
}


