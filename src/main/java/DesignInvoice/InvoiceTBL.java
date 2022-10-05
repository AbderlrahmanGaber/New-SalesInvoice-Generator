
package DesignInvoice;


import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

//==Fields==//
public class InvoiceTBL {
    private int invoiceNum;
    private String customerName;
    private Date invoiceDate;
    private ArrayList<ItemDetails> invoiceItems;

//==constructor==//    
     public InvoiceTBL(int invoiceNum, String customerName, Date invoiceDate) {
        this.invoiceNum = invoiceNum;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;
    }

    public InvoiceTBL(int invoiceNum, String customerName, Date invoiceDate, ArrayList invoiceItems) {
        this.invoiceNum = invoiceNum;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;
        this.invoiceItems = invoiceItems;
    }

    public InvoiceTBL(){}

  
//==Getter and setter==//
    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public ArrayList<ItemDetails> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(ArrayList<ItemDetails> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

   
    @Override
    public String toString() {
        SimpleDateFormat sdf =new SimpleDateFormat("DD-MM-YYYY");
        String date =sdf.format(invoiceDate);
        return "InvoiceTBL{" + "invoiceNum=" + invoiceNum + ", invoiceDate=" + date +", customerName=" + customerName + ", date=" + date + ", invoiceLines=" + invoiceItems + '}';
    }

    public void getInvoiceItems(ArrayList<ItemDetails> items) {
    }

    
    
}
