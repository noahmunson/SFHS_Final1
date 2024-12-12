/*
Noah Munson
 */

public class Game {
    private Level levelOne = new Level();
    private Level  levelTwo = new Level();
    private Level levelThree = new Level();
    private int ScoreSum = 0;
    private static boolean BonusRound = false;
    private int numGames;
    private static int gameNum;
    private int greatestScore = 0;


    public Game() {
        numGames = 1;
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

    public int playManyTimes() {
        for(gameNum = 1; gameNum <= numGames; gameNum++) {
            Game game = new Game();
            if (game.getScore() > greatestScore) {
                greatestScore = game.getScore();
            }
        }
        return greatestScore;
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