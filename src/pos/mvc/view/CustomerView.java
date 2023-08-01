/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

/**
 *
 * @author User
 */
public class CustomerView extends javax.swing.JFrame {

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        custIdLabel = new javax.swing.JLabel();
        custIdText = new javax.swing.JTextField();
        custTitleText = new javax.swing.JTextField();
        custTitleLabel = new javax.swing.JLabel();
        custDobText = new javax.swing.JTextField();
        custDobLabel = new javax.swing.JLabel();
        custAddressText = new javax.swing.JTextField();
        custAddressLabel = new javax.swing.JLabel();
        custCityText = new javax.swing.JTextField();
        custCityLabel = new javax.swing.JLabel();
        custZipText = new javax.swing.JTextField();
        custZipLabel = new javax.swing.JLabel();
        custNameText = new javax.swing.JTextField();
        custNameLabel = new javax.swing.JLabel();
        custProvinceText = new javax.swing.JTextField();
        custProvinceLabel = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Manage Customer");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(451, 451, 451))
        );

        custIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custIdLabel.setText("Cust ID :");

        custIdText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIdTextActionPerformed(evt);
            }
        });

        custTitleText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        custTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custTitleLabel.setText("Customer Title :");

        custDobText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        custDobLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custDobLabel.setText("Customer DOB :");

        custAddressText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custAddressTextActionPerformed(evt);
            }
        });

        custAddressLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custAddressLabel.setText("Address :");

        custCityText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custCityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custCityTextActionPerformed(evt);
            }
        });

        custCityLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custCityLabel.setText("City :");

        custZipText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        custZipLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custZipLabel.setText("Postal Code");

        custNameText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        custNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custNameLabel.setText("Customer Name :");

        custProvinceText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        custProvinceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        custProvinceLabel.setText("Province :");

        add.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        add.setText("Save Customer");

        update.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        update.setText("Update Customer");

        delete.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        delete.setText("Delete Customer");

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(custAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(custIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(custTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(custDobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custDobText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(custTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custNameLabel)
                                .addGap(12, 12, 12)
                                .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(custAddressText))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custCityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custZipLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custCityText, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(custZipText))
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add))
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(custProvinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custIdLabel)
                    .addComponent(custIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custTitleLabel)
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(custNameLabel)
                        .addComponent(custTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custDobLabel)
                    .addComponent(custDobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custAddressLabel)
                    .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custCityLabel)
                    .addComponent(custProvinceLabel)
                    .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custZipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(update)
                    .addComponent(add))
                .addContainerGap())
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custIdTextActionPerformed

    private void custCityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custCityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custCityTextActionPerformed

    private void custAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custAddressTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel custAddressLabel;
    private javax.swing.JTextField custAddressText;
    private javax.swing.JLabel custCityLabel;
    private javax.swing.JTextField custCityText;
    private javax.swing.JLabel custDobLabel;
    private javax.swing.JTextField custDobText;
    private javax.swing.JLabel custIdLabel;
    private javax.swing.JTextField custIdText;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JTextField custNameText;
    private javax.swing.JLabel custProvinceLabel;
    private javax.swing.JTextField custProvinceText;
    private javax.swing.JLabel custTitleLabel;
    private javax.swing.JTextField custTitleText;
    private javax.swing.JLabel custZipLabel;
    private javax.swing.JTextField custZipText;
    private javax.swing.JButton delete;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
