/*
Noah Munson
 */

public class Game {
    private Level levelOne;
    private Level  levelTwo;
    private Level levelThree;
    private int ScoreSum = 0;

    public Game() {

    }
    public boolean isBonus() {

    }
    public void play() {

    }
    public int getScore() {
        if (levelOne.goalReached()) {
            ScoreSum += levelOne.getPoints();
        } else if (levelTwo.goalReached()) {
            ScoreSum += levelTwo.getPoints();
        } else if (levelThree.goalReached()) {
            ScoreSum += levelThree.getPoints();
        } else if (Game.isBonus()) {
            ScoreSum *= 3;
        }
    }
    public int playManyTimes(int num) {
        return 0;
    }
}