public class ProgrammingBook extends Book{
    private String language;

    public ProgrammingBook(String language) {
        this.language = language;
    }

    public ProgrammingBook(int bookCode, String name, int price, String author, String language) {
        super(bookCode, name, price, author);
        this.language = language;
    }

    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
