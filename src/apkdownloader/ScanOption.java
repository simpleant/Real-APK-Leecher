/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ScanOption.java
 *
 * Created on Mar 24, 2012, 1:53:48 AM
 */
package apkdownloader;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author CodeBlue
 */
public class ScanOption extends javax.swing.JDialog {
    
    public String folder = "";
    public boolean isSet = false;
    DocumentUndoManager undo = DocumentUndoManager.getInstance();

    /** Creates new form ScanOption */
    public ScanOption(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(btnScan);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbDefault = new javax.swing.JRadioButton();
        rbAnother = new javax.swing.JRadioButton();
        txtFolder = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnScan = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(ScanOption.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        rbDefault.setBackground(resourceMap.getColor("rbDefault.background")); // NOI18N
        buttonGroup1.add(rbDefault);
        rbDefault.setSelected(true);
        rbDefault.setText(resourceMap.getString("rbDefault.text")); // NOI18N
        rbDefault.setName("rbDefault"); // NOI18N

        rbAnother.setBackground(resourceMap.getColor("rbDefault.background")); // NOI18N
        buttonGroup1.add(rbAnother);
        rbAnother.setText(resourceMap.getString("rbAnother.text")); // NOI18N
        rbAnother.setName("rbAnother"); // NOI18N
        rbAnother.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbAnotherStateChanged(evt);
            }
        });

        txtFolder.setText(resourceMap.getString("txtFolder.text")); // NOI18N
        txtFolder.setEnabled(false);
        txtFolder.setName("txtFolder"); // NOI18N

        btnBrowse.setText(resourceMap.getString("btnBrowse.text")); // NOI18N
        btnBrowse.setEnabled(false);
        btnBrowse.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btnBrowse.setName("btnBrowse"); // NOI18N
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnScan.setText(resourceMap.getString("btnScan.text")); // NOI18N
        btnScan.setName("btnScan"); // NOI18N
        btnScan.setPreferredSize(new java.awt.Dimension(65, 23));
        btnScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScanActionPerformed(evt);
            }
        });

        btnCancel.setText(resourceMap.getString("btnCancel.text")); // NOI18N
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnScan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rbAnother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbDefault, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbDefault)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAnother)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnScan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        undo.registerDocumentHolder(txtFolder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScanActionPerformed
        // TODO add your handling code here:
        if(rbDefault.isSelected()) {
            folder = APKDownloaderApp.config.getDefaultScanFolder();
        } else {
            folder = txtFolder.getText();
        }
        isSet = true;
        dispose();
    }//GEN-LAST:event_btnScanActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(JFileChooser.APPROVE_OPTION == chooser.showOpenDialog(this)) {
            File file = chooser.getSelectedFile();
            txtFolder.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void rbAnotherStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbAnotherStateChanged
        // TODO add your handling code here:
        if(rbAnother.isSelected()) {
            txtFolder.setEnabled(true);
            btnBrowse.setEnabled(true);
        } else {
            txtFolder.setEnabled(false);
            btnBrowse.setEnabled(false);
        }
    }//GEN-LAST:event_rbAnotherStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnScan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbAnother;
    private javax.swing.JRadioButton rbDefault;
    private javax.swing.JTextField txtFolder;
    // End of variables declaration//GEN-END:variables

}