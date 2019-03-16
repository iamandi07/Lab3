package Domain;

public class Transaction {

    private int id, icc, piecesum, date, hour;                                                                  //cid, car id; icc, client id cart
    private double sumservice;
    private boolean clientcard, warranty;
    private String cid;

    public Transaction(int id, int icc, int piecesum, int date, int hour, double sumservice, boolean clientcard, boolean warranty, String cid) {

        this.id = id;
        this.icc = icc;
        this.piecesum = piecesum;
        this.sumservice = sumservice;
        this.date = date;
        this.hour = hour;
        this.clientcard = clientcard;
        this.warranty = warranty;
        this.cid = cid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIcc() {
        return icc;
    }

    public void setIcc(int icc) {
        this.icc = icc;
    }

    public int getPiecesum() {
        return piecesum;
    }

    public void setPiecesum(int piecesum) {
        this.piecesum = piecesum;
    }

    public double getSumservice() {
        return sumservice;
    }

    public void setSumservice(double sumservice) {
        this.sumservice = sumservice;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isClientcard() {
        return clientcard;
    }

    public void setClientcard(boolean clientcard) {
        this.clientcard = clientcard;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

}
