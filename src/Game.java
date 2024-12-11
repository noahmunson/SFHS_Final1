/*
Noah Munson
 */

public class Game {
    private Level levelOne;
    private Level  levelTwo;
    private Level levelThree;
    private int ScoreSum = 0;
    private static boolean BonusRound = false;
    private int numGames;
    private static int gameNum;
    private int greatestScore = 0;


    public Game() {
        numGames = 1;
        gameNum = 1;
        BonusRound = false;

    }
    public Game(int numGames) {
        this.numGames = numGames;
        gameNum = 1;
    }
    public static boolean isBonus() {
        if(gameNum > 1) {
            BonusRound = true;
            return BonusRound;
        }
        return BonusRound;
    }
    public void play() {
        Game [] xGames = new Game[numGames];
        for(gameNum = 1; gameNum <= numGames; gameNum++) {
            xGames[gameNum] = new Game();
            if (xGames[gameNum].getScore() > greatestScore) {
                greatestScore = xGames[gameNum].getScore();
            }
        }
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