package game.src;

public class DieCup {

    private int rollValue;

    public DieCup() {
        rollValue = 0;
    }

    public static void throwDice();
        Die.roll();
        this.rollValue = Die.getFaceValue();
        Die.roll();
        this.rollValue = this.rollValue + Die.getFaceValue(); // we plus the to dies together

    public int getRollValue() {
        return rollValue;
    } // We get the total rollvalue

}
}


