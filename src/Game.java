/*
Noah Munson
 */

public class Game {
    private Level levelOne;
    private Level  levelTwo;
    private Level levelThree;
    private int ScoreSum = 0;
    private static boolean BonusRound;
    private int numGames;

    public Game() {
        numGames = 1;
        BonusRound = false;

    }
    public Game(boolean BonusRound, int numGames) {
        Game.BonusRound = BonusRound;
        this.numGames = numGames;
    }
    public static boolean isBonus() {
        return BonusRound;
    }
    public void play(int num) {

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
        return ScoreSum;
    }
}