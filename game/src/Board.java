package game.src;

public class Board {

    private int throwResult;
    private boolean extraTurn = false;

    public Board() {throwResult = 0;}       //constructor

    public void playTurn() {

        DieCup cup = new DieCup();

        cup.throwDice();
        if(cup.getRollValue() == 2){     //Tower
            this.throwResult = 250;
            System.out.println("Player has hit Tower (+250)");
        }
        else if(cup.getRollValue() == 3){    //Crater
            this.throwResult = -100;
            System.out.println("Player has hit Crater (-100)");
        }
        else if(cup.getRollValue() == 4){    //Palace Gates
            this.throwResult = 100;
            System.out.println("Player has hit Palace Gates (+100)");
        }
        else if(cup.getRollValue() == 5){    //Cold Deserts
            this.throwResult = -20;
            System.out.println("Player has hit Cold Deserts (-20)");
        }
        else if(cup.getRollValue() == 6){    //Walled City
            this.throwResult = +180;
            System.out.println("Player has hit Walled City (+180)");
        }
        else if(cup.getRollValue() == 7){    //Monastery
            this.throwResult = 0;
            System.out.println("Player has hit Monastery (+0)");
        }
        else if(cup.getRollValue() == 8){    //Black Cave
            this.throwResult = -70;
            System.out.println("Player has hit Black Cave (-70)");
        }
        else if(cup.getRollValue() == 9){    //Huts in the mountain
            this.throwResult = +60;
            System.out.println("Player has hit Huts in the mountain (+60)");
        }
        else if(cup.getRollValue() == 10){   //The Werewall (werewolf-wall)
            this.throwResult = -80;
            this.extraTurn = true;
            System.out.println("Player has hit The Werewall (-80) (+ extra turn)");
        }
        else if(cup.getRollValue() == 11){   //The pit
            this.throwResult = -50;
            System.out.println("Player has hit The Pit (-50)");
        }
        else if(cup.getRollValue() == 12){   //Goldmine
            this.throwResult = +650;
            System.out.println("Player has hit Goldmine (+650)");
        }
    }

    public int getThrowResult() {       //gets throwResult
        return throwResult;
    }

    public boolean isExtraTurn() {return this.extraTurn;}    //returns extraTurn, to check if the player has an extra turn

    public void setExtraTurn(boolean a) {       //sets extraTurn
        this.extraTurn = a;
    }
}
