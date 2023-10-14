package src.library;

public class Borrower implements IPrintInfo {

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private boolean isActive;

    private Book[] books;

    private Borrower() {

    }

    public Borrower(int id, String firstName, String lastName, String phoneNumber, boolean isActive, Book[] books) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public void print() {

        System.out.println("borrower first name is " + firstName);
        System.out.println("borrower lastName name is " + lastName);
        System.out.println("borrower phone number is " + phoneNumber);
        System.out.println("state of borrower is " + isActive);
        System.out.println("number of borrowed book is " + books.length);
        System.out.println("--------------------");
        System.out.println("books");
        System.out.println("--------------------");

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book number +(" + (i + 1) + " )");

            if (books[i] != null)
                books[i].print();
        }
    }

}
