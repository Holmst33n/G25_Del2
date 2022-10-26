package game.src;

public class Board {

    private boolean turnIndicator;
    private int throwResult;

    public Board() {turnIndicator = false;}

    public static void playTurn() {

        DieCup.throwDice();
        if(DieCup.getRollValue() == 2){
            throwResult = 250;
        }
        else if(DieCup.getRollValue() == 3){
            throwResult = -100;
        }
        else if(DieCup.getRollValue() == 4){
            throwResult = 100;
        }
        else if(DieCup.getRollValue() == 5){
            throwResult = -20;
        }
        else if(DieCup.getRollValue() == 6){
            throwResult = +180;
        }
        else if(DieCup.getRollValue() == 7){
            throwResult = 0;
        }
        else if(DieCup.getRollValue() == 8){
            throwResult = -70;
        }
        else if(DieCup.getRollValue() == 9{
            throwResult = +60;
        }

    }


}
