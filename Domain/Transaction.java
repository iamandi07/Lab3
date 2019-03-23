package Domain;

import java.util.Objects;

public class Transaction {

    private String id, icc, date, hour, cid;                                                                  //cid, car id; icc, client id cart
    private int piecesum;
    private double sumservice;
    private boolean clientcard, warranty;

    public Transaction(String id, String icc, String date, String hour, String cid, int piecesum, double sumservice, boolean clientcard, boolean warranty) {

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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction transaction = (Transaction) o;
        return id.equals(transaction.id);

    }

    public int hashCode() {
        return Objects.hash(id, icc, date, hour, cid, piecesum, sumservice, clientcard, warranty);
    }

    @Override
    public String toString() {
        return "Cake{" +
                "id='" + id + '\'' +
                ", icc='" + icc + '\'' +
                ", date='" + date + '\'' +
                ", hour=" + hour +
                ", cid=" + cid +
                ", piecesum=" + piecesum +
                ", sumservice=" + sumservice +
                ", clientcard=" + clientcard +
                ", warranty=" + warranty +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcc() {
        return icc;
    }

    public void setIcc(String icc) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
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
