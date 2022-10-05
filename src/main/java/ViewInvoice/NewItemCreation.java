package ViewInvoice;

import DesignInvoice.InvoiceTBL;
import DesignInvoice.ItemDetails;
import DesignInvoice.fileOperations;
import InvoiceControl.Controller;

import static java.lang.Integer.parseInt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class NewItemCreation extends javax.swing.JFrame {

    public String itemName;
    public double itemPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    public int Count;

    public NewItemCreation() {
        controller = new Controller(this);

        initComponents();

    }

    public NewItemCreation(Object object, boolean b) {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        addbtn.addActionListener(controller);
        cancelbtn = new javax.swing.JButton();
        cancelbtn.addActionListener(controller);

        setTitle("New Item");

        jLabel1.setText("Item Name");

        jLabel2.setText("Item Price");

        jLabel3.setText("count");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        addbtn.setText("Create");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed

//        int number = Integer.parseInt(jTextField2.getText()) * Integer.parseInt(jTextField3.getText());

    int number = Integer.parseInt(jTextField2.getText())*Integer.parseInt(jTextField3.getText());
     //double total = 0.0;

        Frame.invoiceTotallbl.setText(String.valueOf(number));

        Frame.ADDRowToJTable(new Object[]{
                jTextField1.getText(),
            jTextField2.getText(),
            jTextField3.getText(),
            number,});

        Frame.invoiceTotallbl.setText(String.valueOf(number));
        int returnedRow = 0;
        System.out.println("get selected row"+Frame.invoiceTBL.getSelectedRow());
        if(Frame.invoiceTBL.getSelectedRow() == -1) {
             returnedRow = getRowIndexesOfValue(parseInt(Frame.invoiveNumlbl.getText()));
        }else{
//            int selectedInvoice = Frame.invoiceTBL.getSelectedRow();
            returnedRow = Frame.invoiceTBL.getSelectedRow();
        }

        if(controller.invoices.size()>0) {
            if (!controller.invoices.stream().anyMatch(c -> c.getInvoiceNum() == parseInt(Frame.invoiveNumlbl.getText()))) {

                int x = controller.invoices.get(returnedRow-1).getInvoiceNum();
                System.out.println("rkmelInvoice" + x);
                if (x != parseInt(Frame.invoiveNumlbl.getText())) {
                    controller.invoiceItems = new ArrayList<>();
                }
            }
        }
        ItemDetails newPlayer = new ItemDetails();
        newPlayer.setItemName(jTextField1.getText());
        newPlayer.setItemPrice(parseInt(jTextField2.getText()));
        newPlayer.setCount(parseInt(jTextField3.getText()));

            if (!controller.invoiceItems.contains(newPlayer)) {
                controller.invoiceItems.add(newPlayer);
            }

//        ItemDetails it = new ItemDetails(jTextField1.getText(),Double.parseDouble(jTextField2.getText()),parseInt(jTextField3.getText()));
//        System.out.println("invoiceItems.size()"+controller.invoiceItems.size());
//        controller.invoiceItems.add(controller.invoiceItems.size(),it);
        double total = 0.0;

        for (int count = 0; count < Frame.itemTBL.getRowCount(); count++) {
            total += Double.parseDouble(Frame.itemTBL.getValueAt(count, 3).toString());

        }


        System.out.println("here returnedRow " + returnedRow);

        Frame.invoiceTotallbl.setText(String.valueOf(total));
        Frame.invoiceTBL.setValueAt(total, returnedRow, 3);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date1;
        try {
            date1=new SimpleDateFormat("dd-MM-yyyy").parse(Frame.invoiceDatelbl.getText());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
//        Date date = sdf.parse(Frame.invoiceDatelbl.getText());
        InvoiceTBL newInvoice = new InvoiceTBL();
        newInvoice.setInvoiceNum(parseInt(Frame.invoiveNumlbl.getText()));
        newInvoice.setCustomerName(Frame.customerNamelbl.getText());
        newInvoice.setInvoiceDate(date1);


//        for(int i=0;i<controller.invoices.size();i++){
//            System.out.println("invoicces count0"+ newInvoice.getInvoiceNum());
//            System.out.println("into invoice0 "+controller.invoices.equals(newInvoice));
//        }
//        if(!controller.invoices.equals(newInvoice)){
//            System.out.println("hana ------------------"+controller.invoices);
              if(controller.invoices.size() == 0){
                  newInvoice.setInvoiceItems(controller.invoiceItems);
                  controller.invoices.add(newInvoice);
              } else{
                  if(!controller.invoices.stream().anyMatch(c->c.getInvoiceNum() == parseInt(Frame.invoiveNumlbl.getText()))){

                      newInvoice.setInvoiceItems(controller.invoiceItems);
                      System.out.println("new invoces "+newInvoice);
                      controller.invoices.add(newInvoice);
                  }
              }
              //append to frames
        try {
            if (Frame.invoices == null || Frame.invoices .isEmpty()) {
                System.out.println("hhhhhhh----------");
                Frame.invoices = new ArrayList<>();
            }
            if (controller.invoices.size() > 0){
                for (int i = 0; i < controller.invoices.size(); i++) {
                    Frame.invoices.add(new InvoiceTBL(controller.invoices.get(i).getInvoiceNum(), controller.invoices.get(i).getCustomerName(), controller.invoices.get(i).getInvoiceDate(), controller.invoices.get(i).getInvoiceItems()));
                }
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        Object[][] table1Data = getInvoiceTableData(Frame.invoices);
        System.out.println("controller.invoces "+controller.invoices);


        cancelbtnActionPerformed(evt);

                
    }//GEN-LAST:event_addbtnActionPerformed
    private Object[][] getInvoiceTableData(ArrayList<InvoiceTBL> invoices) {

        Object[][] tableData = new Object[invoices.size()][4];
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        for (int i = 0; i < invoices.size(); i++) {
            tableData[i][0] = invoices.get(i).getInvoiceNum();
            tableData[i][1] = sdf.format(invoices.get(i).getInvoiceDate());
            tableData[i][2] = invoices.get(i).getCustomerName();
            double total = 0.0;
            if (invoices.get(i).getInvoiceItems() != null) {
                for (ItemDetails item : invoices.get(i).getInvoiceItems()) {
                    total += item.getItemPrice() * item.getCount();
                }
            }

            tableData[i][3] = total;

        }

        return tableData;
    }
    private int getRowIndexesOfValue(int value) {

        int rowNumbers = 0;

        for (int rowCount = 0; rowCount < Frame.invoiceTBL.getRowCount(); rowCount++) {
            for (int columnCount = 0; columnCount < Frame.invoiceTBL.getColumnCount(); columnCount++) {
                if (Frame.invoiceTBL.getValueAt(rowCount, columnCount).equals(value)) {
                    rowNumbers = rowCount;
                    break;
                }
            }
        }
        return rowNumbers;
    }

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_cancelbtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewItemCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
 private Controller controller;

}
