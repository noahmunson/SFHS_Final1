/*
Game FRQ
APCSA Final
Noah Munson

This class represents a level of a game simulation.
 */
public class Level {
    private int points;

    public boolean goalReached() {
        return points >= 1000;
    }
    public int getPoints() {
        return points;
    }
}
