/*
2022 FRQ by: Aaron Mizen
Book CLass
*/
public class Book {

    //Variables used to store the information of a book
    private String title;
    private double price;

    //Constructor for the Book Class
    public Book(String bookTitle, double bookPrice){
        title = bookTitle;
        price = bookPrice;
    }

    //Method that returns the value of title of an object
    public String getTitle(){
        return title;
    }

    //Method that returns the title and price of an object
    public String getBookInfo(){
        return title + " - " + price;
    }
}

