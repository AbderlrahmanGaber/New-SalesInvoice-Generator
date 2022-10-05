
package ViewInvoice;


import DesignInvoice.InvoiceTBL;
import DesignInvoice.ItemDetails;
import InvoiceControl.Controller;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import static java.lang.Integer.parseInt;


public class Frame extends javax.swing.JFrame {

    
    public static ArrayList<InvoiceTBL> invoices;

    public static void AddRowToJTable(Object[] object) {
    }

   
    public Frame() {
        
      controller=new Controller(this);
        initComponents();
     
    }

    public static JLabel getInvoiceTotallbl() {
        return invoiceTotallbl;
    }
    public static void setInvoiceTotallbl(JLabel invoiceTotallbl) {
        Frame.invoiceTotallbl = invoiceTotallbl;
    }


    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTBL = new javax.swing.JTable();
        createInv = new javax.swing.JButton();
        createInv.addActionListener(controller);
        deleteInv = new javax.swing.JButton();
        deleteInv.addActionListener(controller);
        labelinvoivenum = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invoiveNumlbl = new javax.swing.JLabel();
        invoiceDatelbl = new javax.swing.JLabel();
        customerNamelbl = new javax.swing.JLabel();
        invoiceTotallbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTBL = new javax.swing.JTable();
        savebtn = new javax.swing.JButton();
        savebtn.addActionListener(controller);
        cancelbtn = new javax.swing.JButton();
        cancelbtn.addActionListener(controller);
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        loadMenuItem.addActionListener(controller);
        saveMenuItem = new javax.swing.JMenuItem();
        saveMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        invoiceTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(invoiceTBL);

        createInv.setText("Create New Invoice");
        createInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvActionPerformed(evt);
            }
        });

        deleteInv.setText("Delete Invoice");

        labelinvoivenum.setText("Invoice Num.");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        invoiveNumlbl.setText(".");

        invoiceDatelbl.setText(".");

        customerNamelbl.setText(".");

        invoiceTotallbl.setText(".");

        itemTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price", "Count", "Item Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itemTBL);
        if (itemTBL.getColumnModel().getColumnCount() > 0) {
            itemTBL.getColumnModel().getColumn(0).setResizable(false);
            itemTBL.getColumnModel().getColumn(1).setResizable(false);
            itemTBL.getColumnModel().getColumn(2).setResizable(false);
            itemTBL.getColumnModel().getColumn(3).setResizable(false);
        }

        savebtn.setText("Add New Item");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel Item");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        jLabel9.setText("InvoiceTable");

        jMenu1.setText("File");

        loadMenuItem.setText("Load Files");
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenuItem);

        saveMenuItem.setText("Save Files");
        jMenu1.add(saveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(createInv)
                        .addGap(38, 38, 38)
                        .addComponent(deleteInv))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelinvoivenum)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(invoiveNumlbl)
                                    .addComponent(invoiceDatelbl)
                                    .addComponent(customerNamelbl)
                                    .addComponent(invoiceTotallbl)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(savebtn)
                        .addGap(103, 103, 103)
                        .addComponent(cancelbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelinvoivenum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiveNumlbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceDatelbl)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerNamelbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invoiceTotallbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createInv)
                    .addComponent(deleteInv)
                    .addComponent(savebtn)
                    .addComponent(cancelbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt)
    {
    }                                            

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

    private void createInvActionPerformed(java.awt.event.ActionEvent evt) {                                          
       NewInvoiceCreation createInvoice =new NewInvoiceCreation();
       createInvoice.setVisible(true);
        
      
    }                                         
 
    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        NewItemCreation createItem = new NewItemCreation();
       createItem.setVisible(true);
       
    }                                       

    private void invoiceTBLMouseClicked(java.awt.event.MouseEvent evt) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        int selectedInvoice = Frame.invoiceTBL.getSelectedRow();
        ArrayList<ItemDetails> invoiceItems;
        selectedInvoice = parseInt(Frame.invoiceTBL.getValueAt(selectedInvoice,0).toString());
        System.out.println("selectedInvoice = " + selectedInvoice);

        for (InvoiceTBL invoice : Frame.invoices) {

            if (invoice.getInvoiceNum() == selectedInvoice) {

                Frame.invoiveNumlbl.setText(String.valueOf(invoice.getInvoiceNum()));
                Frame.invoiceDatelbl.setText(sdf.format(invoice.getInvoiceDate()));
                Frame.customerNamelbl.setText(invoice.getCustomerName());
                double total = 0.0;
                if (invoice.getInvoiceItems() != null) {
                    for (ItemDetails item : invoice.getInvoiceItems()) {
                        total += item.getItemPrice() * item.getCount();
                    }

                    Frame.invoiceTotallbl.setText(String.valueOf(total));
                    invoiceItems = invoice.getInvoiceItems();
                    System.out.println("invoiceItems----------"+invoiceItems);
                    Object[][] table2Data = getInvoiceItemsTableData(invoiceItems);
                    Frame.itemTBL.setModel(new DefaultTableModel(table2Data,
                            new String[]{"No.","Item Name", "Item Price", "Count", "Item Total"}));
                 }else {
                    Frame.invoiceTotallbl.setText(String.valueOf(total));

                    Frame.itemTBL.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][]{

                            },
                            new String[]{
                                    "No.","Item Name", "Item Price", "Count", "Item Total"
                            }
                    ));

                    Frame.itemTBL.setModel(new DefaultTableModel(new Object[][]{},
                            new String[]{"Item Name", "Item Price", "Count", "Item Total"}));

                }

            }
        }
    }
    private Object[][] getInvoiceItemsTableData(ArrayList<ItemDetails> items) {
        Object[][] tableData = new Object[items.size()][5];
        System.out.println(items);
    for (int i = 0; i < items.size(); i++) {
        System.out.println("testooo"+items.get(i).getInvoice());
        if(items.get(i).getInvoice() == null){
            tableData[i][0] = parseInt(Frame.invoiveNumlbl.getText());
        }else {
            tableData[i][0] = items.get(i).getInvoice().getInvoiceNum();
        }
        tableData[i][1] = items.get(i).getItemName();
        tableData[i][2] = items.get(i).getItemPrice();
        tableData[i][3] = items.get(i).getCount();
        double itemTotal = items.get(i).getItemPrice() * items.get(i).getCount();
        tableData[i][4] = itemTotal;

    }

        return tableData;
    }

    // Helper Method
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



    public static void ADDRowToJTable(Object[] dataRow){
      DefaultTableModel model=(DefaultTableModel) itemTBL.getModel();
      model.addRow(dataRow);
    
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton createInv;
    public static javax.swing.JLabel customerNamelbl;
    private javax.swing.JButton deleteInv;
    public static javax.swing.JLabel invoiceDatelbl;
    public static javax.swing.JTable invoiceTBL;
    public static javax.swing.JLabel invoiceTotallbl;
    public static javax.swing.JLabel invoiveNumlbl;
    public static javax.swing.JTable itemTBL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelinvoivenum;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JButton savebtn;
    // End of variables declaration                   
    private Controller controller;

    public JTable getInvoiceTBL() {
        return invoiceTBL;
    }

    public static void setInvoiceTBL(JTable invoiceTBL) {
        Frame.invoiceTBL = invoiceTBL;
    }
    

         public static void ADDRowToJTable2(Object[] dataRow){
      DefaultTableModel model=(DefaultTableModel) invoiceTBL.getModel();
      model.addRow(dataRow);}

   

}




