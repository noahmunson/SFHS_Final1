class Textbook {

    private String title;
    private double price;
    private int edition;

    public Textbook(String title, double price, int edition) {
        this.title = title;
        this.price = price;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getEdition() {
        return edition;
    }

    public String getBookInfo() {
        return title + "-" + price + "-" + edition;
    }

    public boolean canSubstituteFor(Textbook book) {
        if (title.equals(book.getTitle()))
            return edition >= book.getEdition();
        return false;
    }
}
