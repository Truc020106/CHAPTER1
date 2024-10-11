//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    InvoiceItem invoiceItem = new InvoiceItem("A101" , "Pen red", 999, 0.99);
        System.out.println("id is: "+invoiceItem.getId()+"\ndesc is: "+invoiceItem.getDesc()+"\nqty is: "+invoiceItem.getQty()+"\nunitPrice is: "+invoiceItem.getUnitPrice()+"\nThe total is: "+ invoiceItem.getTotal());
    }
}