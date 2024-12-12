/*
Game FRQ
APCSA Final
Noah Munson

This class represents a level of a game simulation.
 */
import java.util.Random;

public class Level {
    private int points;

    public Level() {
        points = 1000;
    }
    public boolean goalReached() {
        return points >= 1000;
    }
    public int getPoints() {
        Random rand = new Random();
        points = rand.nextInt(0, 1000);
        return points;
    }
}
