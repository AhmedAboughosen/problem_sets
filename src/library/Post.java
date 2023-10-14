package src.library;

public class Post {
    private int id;
    private String address;
    private String publisher;

    private Post() {

    }

    public Post(int id, String address, String publisher) {
        this.id = id;
        this.address = address;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
