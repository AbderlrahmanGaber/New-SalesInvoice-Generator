
package DesignInvoice;

public class ItemDetails {
    
    //==Fields==//
    private InvoiceTBL invoice;
    private String itemName;
    private int count;
    private double itemPrice;
    
    //==Constructors==//
    public ItemDetails(InvoiceTBL invoice, String itemName, double itemPrice, int count) {
        this.invoice = invoice;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
        
        
    }

    public ItemDetails( String itemName, double itemPrice, int count) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;

    }
    public ItemDetails(){}
    
    //==Getter & Setter==//
    
    public InvoiceTBL getInvoice(){
        return invoice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemnName) {
        this.itemName = itemnName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
      public double getTotal(){
        return count*itemPrice;
    }
            
            

    @Override
    public String toString() {
        return 	"ItemDetails{itemName=" + itemName  + ", itemPrice=" + itemPrice + ", count=" + count + '}';
    }

        
            
            
            
            
            
            
            
            
            
            
            
            
            
                 
            
}
