/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import DAO.DAORequest;
import Utils.FormUtils;
import Utils.TableUtils;
import java.awt.BorderLayout;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 *
 * @author usuario
 */
public class Estadisticas extends javax.swing.JPanel {

    boolean selectedTypeCounter = true;

    /**
     * Creates new form Estadisticas
     */
    public Estadisticas() {
        initComponents();
        estTypeButtonActionPerformed(null);
        lastYearButtonActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        servicePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        clothesPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clothesTable = new javax.swing.JTable();
        saveConfirmationDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        cancelPrintButton = new javax.swing.JButton();
        savePrintButton = new javax.swing.JButton();
        saveFileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        centerPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        estLabel = new javax.swing.JLabel();
        selectedTypeButtonLabel = new javax.swing.JLabel();
        selectedTimeButtonLabel = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        statisticsMainPanel = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(500, 350), new java.awt.Dimension(10000, 10000));
        beforePanel = new javax.swing.JPanel();
        estTypeButton = new javax.swing.JToggleButton();
        lastYearButton = new javax.swing.JButton();
        lastMonthButton = new javax.swing.JButton();
        lastWeekButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        totalServiceLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalWashLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalIronLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalIWLabel = new javax.swing.JLabel();

        servicePanel.setPreferredSize(new java.awt.Dimension(500, 350));

        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cabina", "Lavado", "Planchado", "Lav. y Plan.", "Express", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(serviceTable);
        if (serviceTable.getColumnModel().getColumnCount() > 0) {
            serviceTable.getColumnModel().getColumn(0).setResizable(false);
            serviceTable.getColumnModel().getColumn(1).setResizable(false);
            serviceTable.getColumnModel().getColumn(2).setResizable(false);
            serviceTable.getColumnModel().getColumn(3).setResizable(false);
            serviceTable.getColumnModel().getColumn(4).setResizable(false);
            serviceTable.getColumnModel().getColumn(5).setResizable(false);
            serviceTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout servicePanelLayout = new javax.swing.GroupLayout(servicePanel);
        servicePanel.setLayout(servicePanelLayout);
        servicePanelLayout.setHorizontalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );
        servicePanelLayout.setVerticalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );

        clothesPanel.setPreferredSize(new java.awt.Dimension(500, 350));

        clothesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ROPA", "Cabina", "Lavado", "Planchado", "Lav. y Plan.", "Express", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(clothesTable);
        if (clothesTable.getColumnModel().getColumnCount() > 0) {
            clothesTable.getColumnModel().getColumn(0).setResizable(false);
            clothesTable.getColumnModel().getColumn(1).setResizable(false);
            clothesTable.getColumnModel().getColumn(2).setResizable(false);
            clothesTable.getColumnModel().getColumn(3).setResizable(false);
            clothesTable.getColumnModel().getColumn(4).setResizable(false);
            clothesTable.getColumnModel().getColumn(5).setResizable(false);
            clothesTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout clothesPanelLayout = new javax.swing.GroupLayout(clothesPanel);
        clothesPanel.setLayout(clothesPanelLayout);
        clothesPanelLayout.setHorizontalGroup(
            clothesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(clothesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );
        clothesPanelLayout.setVerticalGroup(
            clothesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(clothesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );

        saveConfirmationDialog.setTitle("Confirmar guardado");
        saveConfirmationDialog.setBounds(new java.awt.Rectangle(300, 300, 300, 150));
        saveConfirmationDialog.setModal(true);
        saveConfirmationDialog.setResizable(false);
        saveConfirmationDialog.getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("<html>\n<pre>\nSe creará un arcchivo .txt\nSeleccione a continuación la dirección \nde guardado del archivo.\n</pre>\n</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        saveConfirmationDialog.getContentPane().add(jLabel3, gridBagConstraints);

        cancelPrintButton.setText("Cancelar");
        cancelPrintButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelPrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPrintButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        saveConfirmationDialog.getContentPane().add(cancelPrintButton, gridBagConstraints);

        savePrintButton.setText("Guardar");
        savePrintButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savePrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePrintButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        saveConfirmationDialog.getContentPane().add(savePrintButton, gridBagConstraints);

        saveFileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        saveFileChooser.setApproveButtonToolTipText("save");
        saveFileChooser.setDialogTitle("Guardar");
        saveFileChooser.setFileFilter(null);
        saveFileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        saveFileChooser.setSelectedFiles(null);

        setMaximumSize(new java.awt.Dimension(1000000, 1000000));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setLayout(new java.awt.BorderLayout());

        centerPanel.setPreferredSize(new java.awt.Dimension(500, 400));
        centerPanel.setLayout(new java.awt.BorderLayout());

        topPanel.setPreferredSize(new java.awt.Dimension(500, 30));
        topPanel.setLayout(new java.awt.GridLayout(1, 5, 5, 5));

        estLabel.setText("Estadisticas:");
        estLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topPanel.add(estLabel);

        selectedTypeButtonLabel.setText("Solicitud");
        selectedTypeButtonLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topPanel.add(selectedTypeButtonLabel);

        selectedTimeButtonLabel.setText("por semana");
        selectedTimeButtonLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topPanel.add(selectedTimeButtonLabel);

        printButton.setText("Imprimir");
        printButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printButton.setFocusPainted(false);
        printButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        printButton.setMaximumSize(new java.awt.Dimension(10000, 10000));
        printButton.setMinimumSize(new java.awt.Dimension(0, 0));
        printButton.setPreferredSize(new java.awt.Dimension(100, 50));
        topPanel.add(printButton);

        centerPanel.add(topPanel, java.awt.BorderLayout.NORTH);

        statisticsMainPanel.setPreferredSize(new java.awt.Dimension(500, 350));

        javax.swing.GroupLayout statisticsMainPanelLayout = new javax.swing.GroupLayout(statisticsMainPanel);
        statisticsMainPanel.setLayout(statisticsMainPanelLayout);
        statisticsMainPanelLayout.setHorizontalGroup(
            statisticsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticsMainPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addContainerGap())
        );
        statisticsMainPanelLayout.setVerticalGroup(
            statisticsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        centerPanel.add(statisticsMainPanel, java.awt.BorderLayout.CENTER);

        jPanel1.add(centerPanel, java.awt.BorderLayout.CENTER);

        beforePanel.setPreferredSize(new java.awt.Dimension(200, 400));
        beforePanel.setLayout(new java.awt.GridLayout(12, 1, 5, 5));

        estTypeButton.setText("Solicitud/Prendas");
        estTypeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estTypeButton.setFocusPainted(false);
        estTypeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        estTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estTypeButtonActionPerformed(evt);
            }
        });
        beforePanel.add(estTypeButton);

        lastYearButton.setText("Ultimo año");
        lastYearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastYearButton.setFocusPainted(false);
        lastYearButton.setMaximumSize(new java.awt.Dimension(1000, 1000));
        lastYearButton.setMinimumSize(new java.awt.Dimension(0, 0));
        lastYearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastYearButtonActionPerformed(evt);
            }
        });
        beforePanel.add(lastYearButton);

        lastMonthButton.setText("Ultimo mes");
        lastMonthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastMonthButton.setFocusPainted(false);
        lastMonthButton.setMaximumSize(new java.awt.Dimension(1000, 1000));
        lastMonthButton.setMinimumSize(new java.awt.Dimension(0, 0));
        lastMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastMonthButtonActionPerformed(evt);
            }
        });
        beforePanel.add(lastMonthButton);

        lastWeekButton.setText("Ultima semana");
        lastWeekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastWeekButton.setFocusPainted(false);
        lastWeekButton.setMaximumSize(new java.awt.Dimension(1000, 1000));
        lastWeekButton.setMinimumSize(new java.awt.Dimension(0, 0));
        lastWeekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastWeekButtonActionPerformed(evt);
            }
        });
        beforePanel.add(lastWeekButton);

        jLabel1.setText("Total:");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(null);
        beforePanel.add(jLabel1);

        totalServiceLabel.setText("$ ######");
        totalServiceLabel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        totalServiceLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        totalServiceLabel.setName(""); // NOI18N
        totalServiceLabel.setPreferredSize(null);
        beforePanel.add(totalServiceLabel);

        jLabel5.setText("Total lavado:");
        jLabel5.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5.setName(""); // NOI18N
        jLabel5.setPreferredSize(null);
        beforePanel.add(jLabel5);

        totalWashLabel.setText("$ ######");
        totalWashLabel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        totalWashLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        totalWashLabel.setName(""); // NOI18N
        totalWashLabel.setPreferredSize(null);
        beforePanel.add(totalWashLabel);

        jLabel4.setText("Total planchado:");
        jLabel4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setName(""); // NOI18N
        jLabel4.setPreferredSize(null);
        beforePanel.add(jLabel4);

        totalIronLabel.setText("$ ######");
        totalIronLabel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        totalIronLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        totalIronLabel.setName(""); // NOI18N
        totalIronLabel.setPreferredSize(null);
        beforePanel.add(totalIronLabel);

        jLabel7.setText("Total lavado y planchado:");
        jLabel7.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel7.setName(""); // NOI18N
        jLabel7.setPreferredSize(null);
        beforePanel.add(jLabel7);

        totalIWLabel.setText("$ ######");
        totalIWLabel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        totalIWLabel.setMinimumSize(new java.awt.Dimension(0, 0));
        totalIWLabel.setName(""); // NOI18N
        totalIWLabel.setPreferredSize(null);
        beforePanel.add(totalIWLabel);

        jPanel1.add(beforePanel, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lastYearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastYearButtonActionPerformed
        // TODO add your handling code here:
        selectedTimeButtonLabel.setText("Por Año");
        if (selectedTypeCounter == true) {
            fillRequestsByTime("year");
        }else{
            fillArticlesByTime("year");
        }
    }//GEN-LAST:event_lastYearButtonActionPerformed

    private void lastMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastMonthButtonActionPerformed
        selectedTimeButtonLabel.setText("por mes");
        if (selectedTypeCounter == true) {
            fillRequestsByTime("month");
        }else{
            fillArticlesByTime("month");
        }
    }//GEN-LAST:event_lastMonthButtonActionPerformed

    private void lastWeekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastWeekButtonActionPerformed
        selectedTimeButtonLabel.setText("por semana");
        if (selectedTypeCounter == true) {
            fillRequestsByTime("week");
        }else{
            fillArticlesByTime("week");
        }
    }//GEN-LAST:event_lastWeekButtonActionPerformed

    private void fillRequestsByTime(String time) {
        int period = 0;
        switch (time) {
            case "year":
                period = Calendar.YEAR;
                break;
            case "month":
                period = Calendar.MONTH;
                break;
            case "week":
                period = Calendar.WEEK_OF_MONTH;
                break;
        }
        DAORequest daoR = new DAORequest();
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(period, -1);
        Date previous = cal.getTime();
        double washSum = 0, ironSum = 0, ironWashSum = 0, expressSum = 0, total = 0;
        TableUtils.fillRequestStatistics(serviceTable, daoR.findBetweenDates(previous, today));
        HashMap hm = FormUtils.statisticsTotals(daoR.findBetweenDates(previous, today));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        totalServiceLabel.setText(formatter.format(hm.get("total")));
        totalWashLabel.setText(formatter.format(hm.get("wash")));
        totalIronLabel.setText(formatter.format(hm.get("iron")));
        totalIWLabel.setText(formatter.format(hm.get("ironwash")));
    }
    
    private void fillArticlesByTime(String time) {
        int period = 0;
        switch (time) {
            case "year":
                period = Calendar.YEAR;
                break;
            case "month":
                period = Calendar.MONTH;
                break;
            case "week":
                period = Calendar.WEEK_OF_MONTH;
                break;
        }
        DAORequest daoR = new DAORequest();
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(period, -1);
        Date previous = cal.getTime();
        double washSum = 0, ironSum = 0, ironWashSum = 0, expressSum = 0, total = 0;
        TableUtils.fillArticleStatistics(clothesTable, daoR.findBetweenDates(previous, today));
        HashMap hm = FormUtils.statisticsTotals(daoR.findBetweenDates(previous, today));
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        totalServiceLabel.setText(formatter.format(hm.get("total")));
        totalWashLabel.setText(formatter.format(hm.get("wash")));
        totalIronLabel.setText(formatter.format(hm.get("iron")));
        totalIWLabel.setText(formatter.format(hm.get("ironwash")));
        
    }
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        saveConfirmationDialog.setVisible(true);
    }                                           

    private void estTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estTypeButtonActionPerformed
        if (selectedTypeCounter == true) {
            selectedTypeButtonLabel.setText("Prendas");
            estTypeButton.setText("Prendas");
            selectedTypeCounter = false;
            statisticsMainPanel.setVisible(false);
            statisticsMainPanel.removeAll();
            statisticsMainPanel.setLayout(new BorderLayout());
            statisticsMainPanel.add(clothesPanel);
            statisticsMainPanel.setVisible(true);
        } else {
            selectedTypeButtonLabel.setText("Solicitud");
            estTypeButton.setText("Solicitud");
            lastYearButtonActionPerformed(null);
            selectedTypeCounter = true;
            statisticsMainPanel.setVisible(false);
            statisticsMainPanel.removeAll();
            statisticsMainPanel.setLayout(new BorderLayout());
            statisticsMainPanel.add(servicePanel);
            statisticsMainPanel.setVisible(true);
        }

    }//GEN-LAST:event_estTypeButtonActionPerformed

    private void savePrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePrintButtonActionPerformed
        saveConfirmationDialog.dispose();
        saveFileChooser.showDialog(null, "Guardar");

    }//GEN-LAST:event_savePrintButtonActionPerformed

    private void cancelPrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPrintButtonActionPerformed
        saveConfirmationDialog.dispose();
    }//GEN-LAST:event_cancelPrintButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel beforePanel;
    private javax.swing.JButton cancelPrintButton;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel clothesPanel;
    private javax.swing.JTable clothesTable;
    private javax.swing.JLabel estLabel;
    private javax.swing.JToggleButton estTypeButton;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lastMonthButton;
    private javax.swing.JButton lastWeekButton;
    private javax.swing.JButton lastYearButton;
    private javax.swing.JButton printButton;
    private javax.swing.JDialog saveConfirmationDialog;
    private javax.swing.JFileChooser saveFileChooser;
    private javax.swing.JButton savePrintButton;
    private javax.swing.JLabel selectedTimeButtonLabel;
    private javax.swing.JLabel selectedTypeButtonLabel;
    private javax.swing.JPanel servicePanel;
    private javax.swing.JTable serviceTable;
    private javax.swing.JPanel statisticsMainPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel totalIWLabel;
    private javax.swing.JLabel totalIronLabel;
    private javax.swing.JLabel totalServiceLabel;
    private javax.swing.JLabel totalWashLabel;
    // End of variables declaration//GEN-END:variables
}
