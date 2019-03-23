package Domain;

public class Card {

    private String id, cnp, bdate, rdate;

    public Card(String id, String cnp, String bdate, String rdate) {

        this.id = id;
        this.cnp = cnp;
        this.bdate = bdate;
        this.rdate = rdate;

    }

    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", cnp='" + cnp + '\'' +
                ", bdate='" + bdate + '\'' +
                ", rdate=" + rdate + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }
}


