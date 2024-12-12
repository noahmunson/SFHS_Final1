import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String title;
        double price;
        int edition;
        int numGames;

        System.out.println("What is the title?");
        title = keyboard.nextLine();
        System.out.println("What is the price?");
        price = keyboard.nextDouble();
        System.out.println("What is the Edition");
        edition = keyboard.nextInt();


        Textbook bio2015 = new Textbook(title, price, edition);

        System.out.println(bio2015.getBookInfo());

        System.out.println("What is the title?");
        title = keyboard.nextLine();
        System.out.println("What is the price?");
        price = keyboard.nextDouble();
        System.out.println("What is the Edition");
        edition = keyboard.nextInt();

        Textbook bio2019 = new Textbook(title, price, edition);

        System.out.println(bio2019.getBookInfo());

        System.out.println("How many games do you want to play?");
        numGames = keyboard.nextInt();
        Game init = new Game(numGames);
        System.out.println("High Score: " + init.playManyTimes());
    }
}