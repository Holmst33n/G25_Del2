public class Die {

    //--------------------------------------------------------------------------------------
    // Understående kode er hentet i Java Software Solutions, Ninth edition, Lewis & Loftus
    //--------------------------------------------------------------------------------------

    private final int MAX = 6; //Maximum faceValue on the die.
    private int faceValue; //The faceValue of the die.

    //The constructor to initialize the face value.
    public Die() {
        faceValue = 1;
    }

    //Method that "rolls" the dice; returns a number (faceValue) between 1 and 6.
    public int roll() {
        faceValue = (int)(Math.random()*MAX)+1;

        return faceValue;
    }

    //Method that returns the faceValue of the die.
    public int getFaceValue() {
        return faceValue;
    }

    //Method to set the faceValue of the die. We probably won't use this.
    public void setFaceValue(int value) {
        faceValue = value;
    }

    //Method that returns the faceValue of the die as a String. Will be used to show the faceValue of the dice.
    public String toString() {
        String result = Integer.toString(faceValue);

        return result; //returns the result as a String so we can print it.
    }
}
