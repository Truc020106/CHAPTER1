public class InvoiceItem {
    private String Id;
    private String Desc;
    private int Qty;
    private double unitPrice;

    public InvoiceItem(String Id, String Desc, int Qty, double unitPrice) {
        this.Id = Id;
        this.Desc = Desc;
        this.Qty = Qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return (double) (Qty*unitPrice);
    }
}


