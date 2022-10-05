package InvoiceControl;

import DesignInvoice.InvoiceTBL;
import DesignInvoice.ItemDetails;
import DesignInvoice.fileOperations;
import ViewInvoice.Frame;
import ViewInvoice.NewInvoiceCreation;
import ViewInvoice.NewItemCreation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

import static java.lang.Integer.parseInt;

public class Controller implements ActionListener {

    private Frame frame;
    private NewInvoiceCreation invoiceDialog;
    private NewItemCreation itemDialog;
    public static ArrayList<ItemDetails> invoiceItems = new ArrayList<>();
    public static ArrayList<InvoiceTBL> invoices = new ArrayList<>();
    public Controller() {

    }

    public Controller(Frame frame) {
        this.frame = frame;
    }

    public Controller(NewInvoiceCreation invoiceDialog) {
        this.invoiceDialog = invoiceDialog;

    }

    public Controller(NewItemCreation itemDialog) {
        this.itemDialog = itemDialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Load Files":
                loadFiles();
                break;
            case "Save Files":
                saveFiles();
                break;
            case "Create New Invoice":
                createNewInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "Add New Item":
                createItem();
                break;
            case "Cancel Item":
                cancelItem();
                break;
        }

    }

    private void loadFiles() {

        String invoicesFilePath = null;
        String itemsFilePath = null;

        JFileChooser fc1 = new JFileChooser();
        if (fc1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            invoicesFilePath = fc1.getSelectedFile().getPath();
            boolean suffix = invoicesFilePath.endsWith("csv");
            if (!suffix) {
                System.out.println("Files must be CSV file only");
                return;
            }
            System.out.println("Invoices CSV File is selected");
            System.out.println("******************************************");
        }

        JFileChooser fc2 = new JFileChooser();
        if (fc2.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            itemsFilePath = fc2.getSelectedFile().getPath();
            boolean suffix = itemsFilePath.endsWith("csv");
            if (!suffix) {
                System.out.println("Files must be CSV file only");
                return;
            }
            System.out.println("Invoice's items CSV file is selected");
            System.out.println("******************************************");
        }

        if (invoicesFilePath != null && itemsFilePath != null) {
            Frame.invoices = new ArrayList<>();
            System.out.println("Frame invoices============"+Frame.invoices);
            Frame.invoices = fileOperations.readFile(invoicesFilePath, itemsFilePath);

            System.out.println("Frame-------"+Frame.invoices.size());
            Object[][] table1Data = getInvoiceTableData(Frame.invoices);
            Frame.invoiceTBL.setModel(new DefaultTableModel(table1Data,
                    new String[]{"No.", "Date", "Customer", "Total"}));

            for (InvoiceTBL invoice : Frame.invoices) {
                System.out.println(invoice);
                this.invoices = new ArrayList<>();
                if (Frame.invoices.size() > 0){
                    for (int i = 0; i < Frame.invoices.size(); i++) {
                        int in = Frame.invoices.get(i).getInvoiceNum();
                        if(!this.invoices.stream().anyMatch(c->c.getInvoiceNum() == in)) {
                            this.invoices.add(new InvoiceTBL(Frame.invoices.get(i).getInvoiceNum(), Frame.invoices.get(i).getCustomerName(), Frame.invoices.get(i).getInvoiceDate(), Frame.invoices.get(i).getInvoiceItems()));
                        }
                        }
                }
                System.out.println("*********************************************");
            }
        } else {
            System.out.println("You must select two CSV files");
            System.out.println("*************************************************");
        }

    }

    private void saveFiles() {
        String invoicesFilePath = null;
        String itemsFilePath = null;
        System.out.println("Save files----1"+Frame.invoices);
        JFileChooser fc1 = new JFileChooser();
        if (fc1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            invoicesFilePath = fc1.getSelectedFile().getPath();
            boolean suffix = invoicesFilePath.endsWith("csv");
            if (!suffix) {
                System.out.println("Files must be CSV file only");
                return;
            }
            System.out.println("Invoices File is selected");
            System.out.println("******************************************");
        }

        JFileChooser fc2 = new JFileChooser();
        if (fc2.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            itemsFilePath = fc2.getSelectedFile().getPath();
            boolean suffix = itemsFilePath.endsWith("csv");
            if (!suffix) {
                System.out.println("Files must be CSV file only");
                return;
            }
            System.out.println("Invoice's items file is selected");
            System.out.println("----------------------------------------");
        }

        if (invoicesFilePath != null && itemsFilePath != null) {
            System.out.println("Save files2----"+Frame.invoices);
            fileOperations.writeFile(Frame.invoices, invoicesFilePath, itemsFilePath);

        } else {
            System.out.println("You must select two files");
            System.out.println("---------------------------------------------");
        }
    }

    private void createNewInvoice() {

        invoiceDialog = new NewInvoiceCreation(null, true);
        int invoiceNum;
        if (Frame.invoices != null) {
            invoiceNum = Frame.invoices.size() + 1;
        } else {
            invoiceNum = 1;
        }

        String dateString = invoiceDialog.getInvoiceDate();
        System.out.println(dateString);
        String customerName = invoiceDialog.getCustomerName();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
           // if (dateString != null && !(customerName.isEmpty())) {
                Date invoiceDate = df.parse(dateString);
                InvoiceTBL invoice = new InvoiceTBL(invoiceNum, customerName, invoiceDate);

                System.out.println(invoice);

                Frame.invoices.add(invoice);
                System.out.println("invoices= " + Frame.invoices);
                Object[][] invoiceTableData = getInvoiceTableData(Frame.invoices);
                Frame.invoiceTBL.setModel(new DefaultTableModel(invoiceTableData,
                        new String[]{"No.", "Date", "Customer", "Total"}));

        } catch (ParseException ex) {
            System.out.println("Incorrecet Date Format ====> It need to be (dd-MM-yyyy) ");
            System.out.println("------------------------------------------------------------");
        }
    }

    private void deleteInvoice() {

        System.out.println("row= " + Frame.invoiceTBL.getSelectedRow() );
        int selectRow = Frame.invoiceTBL.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel)Frame.invoiceTBL.getModel();
        DefaultTableModel model2 = (DefaultTableModel)Frame.itemTBL.getModel();
        System.out.println("Frame.invoiceTBL"+Frame.invoiceTBL.getRowCount());
        System.out.println("Select Row------"+selectRow);
        model.removeRow(selectRow);
        Frame.invoices.remove(selectRow);




            Frame.invoiveNumlbl.setText("0");
            Frame.invoiceDatelbl.setText("");
            Frame.customerNamelbl.setText("");
            Frame.invoiceTotallbl.setText("0.0");
            Frame.itemTBL.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{
                    },
                    new String[]{
                         "Item Name", "Item Price", "Count", "Item Total"
                    }
            ));

    }



    private void createItem() {
        itemDialog = new NewItemCreation(null, true);

        int selectedRow = Frame.invoiceTBL.getSelectedRow();
        if (selectedRow == 0) {
            InvoiceTBL invoice = Frame.invoices.get(selectedRow);
            ArrayList<ItemDetails> invoiceItems = invoice.getInvoiceItems();
            if (invoiceItems == null) {
                invoiceItems = new ArrayList<>();
                invoice.setInvoiceItems(invoiceItems);
            }
            ItemDetails item;
            item = new ItemDetails(invoice, itemDialog.getItemName(),
                    itemDialog.getItemPrice(), itemDialog.getCount());
            if (!((itemDialog.getName()).isEmpty()) && itemDialog.getItemPrice() > 0.0 && itemDialog.getCount() > 0) {
                invoiceItems.add(item);
            }

            double total = 0.0;
            for (ItemDetails invoiceItem : invoiceItems) {
                total += invoiceItem.getItemPrice() * invoiceItem.getCount();
            }

            Object[][] table2Data = getInvoiceItemsTableData(invoiceItems);
            Frame.itemTBL.setModel(new DefaultTableModel(table2Data,
                    new String[]{ "Item Name", "Item Price", "Count", "Item Total"}));

            Object[][] table1Data = getInvoiceTableData(Frame.invoices);
            Frame.invoiceTBL.setModel(new DefaultTableModel(table1Data,
                    new String[]{"No.", "Date", "Customer", "Total"}));


            System.out.println(Frame.invoiceTotallbl);

            Frame.invoiceTotallbl.setText("50");

        } else {
            System.out.println("Select Invoice First");
            System.out.println("------------------------------------------");
        }


    }

//    private void saveItem() {
//
//        int selectedRow = Frame.invoiceTBL.getSelectedRow();
//        if (selectedRow == 0) {
//            InvoiceTBL invoice = Frame.invoices.get(selectedRow);
//            ArrayList<ItemDetails> invoiceItems = invoice.getInvoiceItems();
//            if (invoiceItems == null) {
//                invoiceItems = new ArrayList<>();
//                invoice.setInvoiceItems(invoiceItems);
//            }
//            ItemDetails item;
//            item = new ItemDetails(invoice, itemDialog.getItemName(),
//                    itemDialog.getItemPrice(), itemDialog.getCount());
//            if (!((itemDialog.getName()).isEmpty()) && itemDialog.getItemPrice() > 0.0 && itemDialog.getCount() > 0) {
//                invoiceItems.add(item);
//            }
//
//            double total = 0.0;
//            for (ItemDetails invoiceItem : invoiceItems) {
//                total += invoiceItem.getItemPrice() * invoiceItem.getCount();
//            }
//
//            Object[][] table2Data = getInvoiceItemsTableData(invoiceItems);
//            Frame.itemTBL.setModel(new DefaultTableModel(table2Data,
//                    new String[]{ "Item Name", "Item Price", "Count", "Item Total"}));
//
//            Object[][] table1Data = getInvoiceTableData(Frame.invoices);
//            Frame.invoiceTBL.setModel(new DefaultTableModel(table1Data,
//                    new String[]{"No.", "Date", "Customer", "Total"}));
//
//
//            System.out.println(Frame.invoiceTotallbl);
//
//            Frame.invoiceTotallbl.setText("50");
//
//        } else {
//            System.out.println("Select Invoice First");
//            System.out.println("------------------------------------------");
//        }
//    }

    private void cancelItem() {
        int selectedRowInInvoiceTable = Frame.invoiceTBL.getSelectedRow();
        if (selectedRowInInvoiceTable >= 0) {

            InvoiceTBL invoice = Frame.invoices.get(selectedRowInInvoiceTable);
            ArrayList<ItemDetails> items = invoice.getInvoiceItems();
            if (items == null) {
                items = new ArrayList<>();
                invoice.setInvoiceItems(items);
            }
            int selectedRowInItemsTable = Frame.itemTBL.getSelectedRow();
            if (selectedRowInItemsTable >= 0) {
                items.remove(selectedRowInItemsTable);
                double total = 0.0;
                for (ItemDetails invoiceItem : items) {
                    total += invoiceItem.getItemPrice() * invoiceItem.getCount();
                }

                Frame.invoiceTotallbl.setText(String.valueOf(total));

                Object[][] table2Data = getInvoiceItemsTableData(items);
                Frame.itemTBL.setModel(new DefaultTableModel(table2Data,
                        new String[]{"No.", "Item Name", "Item Price", "Count", "Item Total"}));

                Object[][] table1Data = getInvoiceTableData(Frame.invoices);
                Frame.invoiceTBL.setModel(new DefaultTableModel(table1Data,
                        new String[]{"No.", "Date", "Customer", "Total"}));

            } else {
                System.out.println("Select Invoice and Item in the same time");
                System.out.println("--------------------------------------------");
            }
        } else {
            System.out.println("Select Invoice and Item in the same time");
            System.out.println("----------------------------------------------");
        }

    }

    //==Helper Methods==//
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

    private Object[][] getInvoiceItemsTableData(ArrayList<ItemDetails> items) {

        Object[][] tableData = new Object[items.size()][5];
        for (int i = 0; i < items.size(); i++) {
//          tableData[i][0] = items.get(i).getInvoice().getInvoiceNum();
            tableData[i][1] = items.get(i).getItemName();
            tableData[i][2] = items.get(i).getItemPrice();
            tableData[i][3] = items.get(i).getCount();
            double itemTotal = items.get(i).getItemPrice() * items.get(i).getCount();
            tableData[i][4] = itemTotal;

        }

        return tableData;

    }


}
