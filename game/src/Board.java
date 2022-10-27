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
            System.out.println("You came by the wizards tower, and he hands you 250 coins because he thought you looked goofy.");
        }
        else if(cup.getRollValue() == 3){    //Crater
            this.throwResult = -100;
            System.out.println("You have fallen into the Crater and have to pay the ladderman 100 coins to get out.");
        }
        else if(cup.getRollValue() == 4){    //Palace Gates
            this.throwResult = 100;
            System.out.println("You enter the palace gates, and the king thought you were a jester and paid you 100 coins for your entertainment.");
        }
        else if(cup.getRollValue() == 5){    //Cold Deserts
            this.throwResult = -20;
            System.out.println("You nearly froze to death in the Cold Deserts and bought warm clothes and a cup of hot chocolate for 20 coins.");
        }
        else if(cup.getRollValue() == 6){    //Walled City
            this.throwResult = +180;
            System.out.println("You entered the Walled City and spent a few nights posting for guard duty, and you earned 180 coins.");
        }
        else if(cup.getRollValue() == 7){    //Monastery
            this.throwResult = 0;
            System.out.println("You walked into the Monastery and back out... you gained nothing.");
        }
        else if(cup.getRollValue() == 8){    //Black Cave
            this.throwResult = -70;
            System.out.println("You went into a Black Cave and 70 coins were robbed from you.");
        }
        else if(cup.getRollValue() == 9){    //Huts in the mountain
            this.throwResult = +60;
            System.out.println("You met an old man at the Huts in the mountain. He paid you 60 coins to fix his roof.");
        }
        else if(cup.getRollValue() == 10){   //The Werewall (werewolf-wall)
            this.throwResult = -80;
            this.extraTurn = true;
            System.out.println("You went to The Werewall, and a werewolf bit your leg. You paid 80 coins for medical treatment.");
        }
        else if(cup.getRollValue() == 11){   //The pit
            this.throwResult = -50;
            System.out.println("Your leg got stuck in a pit. A dwarf amputates it for 50 coins.");
        }
        else if(cup.getRollValue() == 12){   //Goldmine
            this.throwResult = +650;
            System.out.println("You walk into the Goldmine. First thing you see is a huge gold nugget. You sell it for 650 coins.");
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
