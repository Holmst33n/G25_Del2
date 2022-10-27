package test.src;

import game.src.Die;
import org.junit.jupiter.api.Assertions;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void roll() {

        int[] faceValues = {0, 0, 0, 0, 0, 0};      //array used to check faceValues are equally distributed

        for(int i = 0; i < 100000; i++){            //for loop, runs 100.000 times to check if the die works as intended
            Die die = new Die();
            boolean expectedResult = true;
            boolean actualResult = true;
            die.roll();
            if (die.getFaceValue() > 6 || die.getFaceValue() < 1) {         //checks if the die ever hits below 1 or above 6
                actualResult = false;
                System.out.println("Die has hit below 1 or above 6");
            }
            //If statements adding the faceValues to the array so we can see if the faceValues are evenly distributed
            if(die.getFaceValue() == 1) faceValues[0]++;
            else if(die.getFaceValue() == 2) faceValues[1]++;
            else if(die.getFaceValue() == 3) faceValues[2]++;
            else if(die.getFaceValue() == 4) faceValues[3]++;
            else if(die.getFaceValue() == 5) faceValues[4]++;
            else if(die.getFaceValue() == 6) faceValues[5]++;

            Assertions.assertEquals(expectedResult, actualResult);      //checks if the die ever hits below 1 or above 6 (unnecessary as we have a similar function above)
        }
        System.out.println("Over 6 or under 1 test went well");
        System.out.println("The distribution of faceValues (1-6): " + Arrays.toString(faceValues));
    }

    @org.junit.jupiter.api.Test
    void getFaceValue() {       //checks if our setFaceValue and getFaceValue methods work as intended
        Die die = new Die();
        int expectedResult = 2;
        int actualResult = 0;
        die.setFaceValue(2);
        actualResult = die.getFaceValue();

        Assertions.assertEquals(expectedResult, actualResult);
        if(expectedResult == actualResult) System.out.println("setFaceValue() and getFaceValue() both work as intended");
    }

    @org.junit.jupiter.api.Test
    void setFaceValue() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}