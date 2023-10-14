package src.library;

public class Book implements IPrintInfo {

    private String authorName;
    private int code;
    private String borrowingDate;
    private String version;
    private int totalPage;
    private boolean state;

    private int borrowBy;

    private Book() {

    }

    public Book(String authorName, int code, String version, int totalPage, boolean state) {
        this.authorName = authorName;
        this.code = code;
        this.version = version;
        this.totalPage = totalPage;
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(String borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBorrowBy() {
        return borrowBy;
    }

    public void setBorrowBy(int borrowBy) {
        this.borrowBy = borrowBy;
    }

    @Override
    public void print() {

        System.out.println("author Name is " + authorName);
        System.out.println("book code is " + code);
        System.out.println("book state is " + state);
        System.out.println("number of pages is " + totalPage);
        System.out.println("book version is " + version);
        if (borrowingDate != null) {
            System.out.println("Date of Borrowing is " + borrowingDate);
            System.out.println("id of  of Borrower is " + borrowBy);

        }
    }
}
