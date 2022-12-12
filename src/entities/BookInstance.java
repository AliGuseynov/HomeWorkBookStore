package entities;

public class BookInstance {
    int serialNumber;
    BookInstanceType bookInstanceType;
    Store store;
    Book book;

    public BookInstance() {
    }

    public BookInstance(int serialNumber, BookInstanceType bookInstanceType, Store store,Book book) {
        this.serialNumber = serialNumber;
        this.bookInstanceType = bookInstanceType;
        this.store = store;
        this.book=book;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BookInstanceType getBookInstanceType() {
        return bookInstanceType;
    }

    public void setBookInstanceType(BookInstanceType bookInstanceType) {
        this.bookInstanceType = bookInstanceType;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book= book;
    }
}
