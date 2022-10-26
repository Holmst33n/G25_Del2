package game.src;

public class Board {

    private int throwResult;
    private boolean extraTurn = false;

    public Board() {}

    public static void playTurn() {

        DieCup.throwDice();
        if(DieCup.getRollValue() == 2){     //Tower
            this.throwResult = 250;
        }
        else if(DieCup.getRollValue() == 3){    //Crater
            this.throwResult = -100;
        }
        else if(DieCup.getRollValue() == 4){    //Palace Gates
            this.throwResult = 100;
        }
        else if(DieCup.getRollValue() == 5){    //Cold Deserts
            this.throwResult = -20;
        }
        else if(DieCup.getRollValue() == 6){    //Walled City
            this.throwResult = +180;
        }
        else if(DieCup.getRollValue() == 7){    //Monastery
            this.throwResult = 0;
        }
        else if(DieCup.getRollValue() == 8){    //Black Cave
            this.throwResult = -70;
        }
        else if(DieCup.getRollValue() == 9){    //Huts in the mountain
            this.throwResult = +60;
        }
        else if(DieCup.getRollValue() == 10){   //The Werewall (werewolf-wall)
            this.throwResult = -80;
            this.extraTurn = true;
        }
        else if(DieCup.getRollValue() == 11){   //The pit
            this.throwResult = -50;
        }
        else if(DieCup.getRollValue() == 12){   //Goldmine
            this.throwResult = +650;
        }
    }

    public boolean isExtraTurn() {
        return extraTurn;
    }
}
