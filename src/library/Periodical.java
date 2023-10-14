package src.library;

public class Periodical implements  IPrintInfo{


    private String type;
    private int code;

    private Periodical() {
    }


    public Periodical(String type, int code) {
        this.type = type;
        this.code = code;
    }

    public String getTYPE() {
        return type;
    }

    public void setTYPE(String type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public void print() {

        System.out.println("periodical type is " + type);
        System.out.println("periodical code is " + code);

    }
}
