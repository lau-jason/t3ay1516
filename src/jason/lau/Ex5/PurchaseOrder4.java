package jason.lau.Ex5;

import jason.lau.Ex3.Items;

/**
 * Created by Jason on 6/7/2016.
 */
public class PurchaseOrder4 {
    float ponum;
    int [] quan;
    String [] uom;

    Items [] cases;

    public PurchaseOrder4(float ponum, int[] quan, String[] uom, Items [] cases) {
        this.ponum = ponum;
        this.quan = quan;
        this.uom = uom;
        this.cases = cases;
    }

    public String Date = "July 1, 2016";

    public float getPonum() {
        return ponum;
    }

    public void setPonum(float ponum) {
        this.ponum = ponum;
    }

    public int[] getQuan() {
        return quan;
    }

    public void setQuan(int[] quan) {
        this.quan = quan;
    }

    public String[] getUom() {
        return uom;
    }

    public void setUom(String[] uom) {
        this.uom = uom;
    }

    public Items[] getCases() {
        return cases;
    }

    public void setCases(Items[] cases) {
        this.cases = cases;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}