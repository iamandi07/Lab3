package Domain;

public class Card {

    private int id, cnp, bdate, rdate;
    private String model, fname, lname;

    public Card(int id, int cnp, int bdate, int rdate, String model, String fname, String lname) {

        this.id = id;
        this.cnp = cnp;
        this.bdate = bdate;
        this.rdate = rdate;
        this.model = model;
        this.fname = fname;
        this.lname = lname;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public int getBdate() {
        return bdate;
    }

    public void setBdate(int bdate) {
        this.bdate = bdate;
    }

    public int getRdate() {
        return rdate;
    }

    public void setRdate(int rdate) {
        this.rdate = rdate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
