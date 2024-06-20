
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;


public class pharmacy extends javax.swing.JFrame {
    private DefaultTableModel model;

    public pharmacy() {
        
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        
        ADD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] rowData = new String[3];
                rowData[0] = producttext.getText();
                rowData[1] = quantitytxt.getText();
                rowData[2] = pricetxt.getText();
                model.addRow(rowData);
                clearTextFields();
                updateTotal();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        invoice = new javax.swing.JLabel();
        invoicetxt = new javax.swing.JTextField();
        c_name = new javax.swing.JLabel();
        c_nametxt = new javax.swing.JTextField();
        contact = new javax.swing.JLabel();
        contacttxt = new javax.swing.JFormattedTextField();
        Product = new javax.swing.JLabel();
        producttext = new javax.swing.JTextField();
        quantity = new javax.swing.JLabel();
        quantitytxt = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        total = new javax.swing.JLabel();
        totaltxt = new javax.swing.JTextField();
        Save = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HS PHARMACY");
        setBackground(new java.awt.Color(153, 153, 153));

        invoice.setText("Invoice no:");

        invoicetxt.setBackground(new java.awt.Color(204, 255, 255));
        invoicetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicetxtActionPerformed(evt);
            }
        });

        c_name.setText("Customer Name:");

        c_nametxt.setBackground(new java.awt.Color(204, 255, 255));

        contact.setText("Contact:");

        contacttxt.setBackground(new java.awt.Color(204, 255, 255));
        try {
            contacttxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+92) ###-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Product.setText("Product:");

        producttext.setBackground(new java.awt.Color(204, 255, 255));

        quantity.setText("Quantity:");

        quantitytxt.setBackground(new java.awt.Color(204, 255, 255));

        price.setText("Unit Price:");

        pricetxt.setBackground(new java.awt.Color(204, 255, 255));

        ADD.setBackground(new java.awt.Color(255, 0, 51));
        ADD.setForeground(new java.awt.Color(51, 51, 51));
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Unit Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        total.setText("Total:");

        totaltxt.setEditable(false);
        totaltxt.setBackground(new java.awt.Color(204, 255, 255));

        Save.setBackground(new java.awt.Color(51, 255, 153));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Save)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Product)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(producttext, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(invoice)
                                                    .addComponent(contact))
                                                .addGap(47, 47, 47))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(c_name)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c_nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(invoicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(quantity)
                                                    .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addComponent(price)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoice)
                    .addComponent(invoicetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_name)
                    .addComponent(c_nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Product)
                    .addComponent(producttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity)
                    .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price)
                    .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADD))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(Save)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoicetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoicetxtActionPerformed
    
    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
//        String[] rowData = new String[3];
//        rowData[0] = producttext.getText();
//        rowData[1] = quantitytxt.getText();
//        rowData[2] = pricetxt.getText();
//        model.addRow(rowData);
//        clearTextFields();
//        updateTotal();
    }//GEN-LAST:event_ADDActionPerformed
    
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String invoString = invoicetxt.getText();
        String custString = c_nametxt.getText();
        String coString = contacttxt.getText();
        String[][] tableData = new String[model.getRowCount()][3];
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < 3; j++) {
                tableData[i][j] = model.getValueAt(i, j).toString();
            }
        }
        String totalString = totaltxt.getText();
        
        jDialog1 = new JDialog(this, "Receipt", true); // Parent is 'this' JFrame
        jDialog1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jDialog1.setLayout(new BorderLayout());

        JPanel receiptPanel = new JPanel();
        receiptPanel.setLayout(new BoxLayout(receiptPanel, BoxLayout.Y_AXIS));
        receiptPanel.add(new JLabel("Invoice no: " + invoString));
        receiptPanel.add(new JLabel("Customer Name: " + custString));
        receiptPanel.add(new JLabel("Contact: " + coString));

        JTable table = new JTable(new DefaultTableModel(tableData, new String[]{"Product", "Quantity", "Unit Price"}));
        receiptPanel.add(new JScrollPane(table));
        receiptPanel.add(new JLabel("Total: " + totalString));

        jDialog1.getContentPane().add(receiptPanel, BorderLayout.CENTER);

        jDialog1.pack();
        jDialog1.setLocationRelativeTo(this); // Center the dialog relative to the parent frame
        jDialog1.setVisible(true);
    }//GEN-LAST:event_SaveActionPerformed
    
    private void updateTotal()
    {
        double total = 0.0;
        double total1 = 0.0;
        for (int i = 0; i < model.getRowCount(); i++)
        {
            Object value = model.getValueAt(i, 2);
            Object value1 = model.getValueAt(i, 1);
            total1 = Double.parseDouble(String.valueOf(value)) * Double.parseDouble(String.valueOf(value1));
            total = total + total1;
        }
        totaltxt.setText(Double.toString(total));
    }
    
    private void clearTextFields() {
        producttext.setText("");
        quantitytxt.setText("");
        pricetxt.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmacy().setVisible(true);
                new pharmacy().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JLabel Product;
    private javax.swing.JButton Save;
    private javax.swing.JLabel c_name;
    private javax.swing.JTextField c_nametxt;
    private javax.swing.JLabel contact;
    private javax.swing.JFormattedTextField contacttxt;
    private javax.swing.JLabel invoice;
    private javax.swing.JTextField invoicetxt;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel price;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField producttext;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField quantitytxt;
    private javax.swing.JLabel total;
    private javax.swing.JTextField totaltxt;
    // End of variables declaration//GEN-END:variables
}
