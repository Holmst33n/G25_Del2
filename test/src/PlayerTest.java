package game.src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getBalance() {

        Player player1 = new Player();
        player1.setBalance(100);
        System.out.println(player1.getBalance());
        player1.setBalance(-100);
        System.out.println(player1.getBalance());
        player1.setBalance(-2*100);
        System.out.println(player1.getBalance());

    }

    @Test
    void setBalance() {
    }
}