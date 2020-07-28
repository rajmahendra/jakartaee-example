package jeee.common.java;

public class Book {
    private Integer bookId;
    private String bookName;
    private Integer publishedYear;
    private Float price;

    public Book(Integer bookId, String bookName, Integer publishedYear, Float price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publishedYear = publishedYear;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", publishedYear=" + publishedYear +
                ", price=" + price +
                '}';
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
