class Textbook {

    private String title;
    private double price;
    private int edition;

    public Textbook(String t, double p, int e) {
        title = t;
        price = p;
        edition = e;
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
            if (edition >= book.getEdition())
                return true;
        return false;
    }
}
