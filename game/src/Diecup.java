package game.src;

import java.sql.SQLOutput;

public class DieCup {

    private int rollValue;

    public DieCup() {
        rollValue = 0;
    }

    public static void throwDice();
        Die.roll();
        this.rollValue = Die.getFaceValue();
        Die.roll();
        this.rollValue = this.rollValue + Die.getFaceValue();

    public int getRollValue() {
        return rollValue;
    }
}
