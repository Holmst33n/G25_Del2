package game.src;

public class Board {

    private int throwResult;
    private boolean extraTurn = false;

    public Board() {throwResult = 0;}

    public void playTurn() {

        DieCup cup = new DieCup();

        cup.throwDice();
        if(cup.getRollValue() == 2){     //Tower
            this.throwResult = 250;
        }
        else if(cup.getRollValue() == 3){    //Crater
            this.throwResult = -100;
        }
        else if(cup.getRollValue() == 4){    //Palace Gates
            this.throwResult = 100;
        }
        else if(cup.getRollValue() == 5){    //Cold Deserts
            this.throwResult = -20;
        }
        else if(cup.getRollValue() == 6){    //Walled City
            this.throwResult = +180;
        }
        else if(cup.getRollValue() == 7){    //Monastery
            this.throwResult = 0;
        }
        else if(cup.getRollValue() == 8){    //Black Cave
            this.throwResult = -70;
        }
        else if(cup.getRollValue() == 9){    //Huts in the mountain
            this.throwResult = +60;
        }
        else if(cup.getRollValue() == 10){   //The Werewall (werewolf-wall)
            this.throwResult = -80;
            this.extraTurn = true;
        }
        else if(cup.getRollValue() == 11){   //The pit
            this.throwResult = -50;
        }
        else if(cup.getRollValue() == 12){   //Goldmine
            this.throwResult = +650;
        }
    }

    public int getThrowResult() {
        return throwResult;
    }

    public boolean isExtraTurn() {return this.extraTurn;}    //returns extraTurn, to check if the player has an extra turn

    public void setExtraTurn(boolean a) {
        this.extraTurn = a;
    }
}
