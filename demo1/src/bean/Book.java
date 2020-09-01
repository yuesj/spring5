package bean;

/**
 * @author yuesj
 * @date 2020/6/5
 */
public class Book {

    private String bname;
    private String bauthor;
    private String address;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBname() {
        return bname;

    }

    public String getBauthor() {
        return bauthor;
    }
}
