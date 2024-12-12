/*
2022 FRQ By: Aaron Mizen
A subclass of the book class
used to compare the information of other textbooks created with this class
*/
class Textbook {

    //Variables used for the information of the textbook
    private String title;
    private double price;
    private int edition;

    // Constructor For Textbook Class
    public Textbook(String title, double price, int edition) {
        this.title = title;
        this.price = price;
        this.edition = edition;
    }

    //Method that returns the title of an object
    public String getTitle() {
        return title;
    }

    //Method that returns the Price of an object
    public double getPrice() {
        return price;
    }

    //Method that returns the Edition of an object
    public int getEdition() {
        return edition;
    }

    //Method that returns the title, price, and edition of a Textbook
    public String getBookInfo() {
        return title + "-" + price + "-" + edition;
    }

    //Method that returns true if an textbook has the same title and is a higher edition
    // if not returns false
    public boolean canSubstituteFor(Textbook book) {
        if (title.equals(book.getTitle()))
            return edition >= book.getEdition();
        return false;
    }
}
