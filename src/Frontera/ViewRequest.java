/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import DAO.DAOArticleRequest;
import DAO.DAORequest;
import Entidad.ArticleRequest;
import Entidad.Request;
import Utils.PanelUtils;
import Utils.TableUtils;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class ViewRequest extends javax.swing.JPanel {

    private DAOArticleRequest daoAR;
    private DAORequest daoR;

    public ViewRequest() {
        initComponents();
        //daoT = new DAOArticle();
        //articleRequestsSet = new HashSet<>();
        //daoAR = new DAOArticleRequest();
        daoR = new DAORequest();
        TableUtils.fillTableRequest(requestTable, daoR.findAll());
        //daoC = new DAOCabin();
        //BoxUtils.updateBoxInt(list, CabinId);
        //CabinId.addActionListener((ev) -> {
//            idSelected(ev);
//        });

//        CabinId.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
    }

    private void idSelected(ActionEvent evt) {
//        String item = (String)CabinId.getSelectedItem();
//        BoxUtils.getArticlesbyGender(item, subItems);

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

        viewPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CabinId = new javax.swing.JComboBox<>();
        FindB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        editButton = new javax.swing.JButton();
        editPanel = new javax.swing.JPanel();
        mainTB3 = new javax.swing.JToolBar();
        backBtn3 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        requestEditLbl = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        userLbl = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        ExitB = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 1000));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.CardLayout());

        viewPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Filtrar servicios en curso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Id de Cabina");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        jPanel1.add(jLabel2, gridBagConstraints);

        CabinId.setMaximumSize(new java.awt.Dimension(32767, 30));
        CabinId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CabinIdItemStateChanged(evt);
            }
        });
        CabinId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CabinIdFocusGained(evt);
            }
        });
        CabinId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CabinIdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        jPanel1.add(CabinId, gridBagConstraints);

        FindB.setText("Buscar");
        FindB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        jPanel1.add(FindB, gridBagConstraints);

        viewPanel.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(837, 40));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(456, 300));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cabina", "Total", "Nº Prendas", "Fecha de creación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        requestTable.getTableHeader().setReorderingAllowed(false);
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requestTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 514;
        gridBagConstraints.ipady = 399;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 35, 14, 14);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        viewPanel.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        editButton.setText("Editar Seleccionado");
        editButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(15, 700, 15, 40);
        jPanel5.add(editButton, gridBagConstraints);

        viewPanel.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        add(viewPanel, "view");

        editPanel.setLayout(new java.awt.BorderLayout());

        mainTB3.setFloatable(false);
        mainTB3.setRollover(true);

        backBtn3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        backBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontera/left-arrow (1).png"))); // NOI18N
        backBtn3.setText("Volver");
        backBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn3.setFocusable(false);
        backBtn3.setMargin(new java.awt.Insets(0, 10, 0, 0));
        backBtn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        backBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn3ActionPerformed(evt);
            }
        });
        mainTB3.add(backBtn3);
        mainTB3.add(filler1);

        requestEditLbl.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        requestEditLbl.setText("Editando Solicitud");
        mainTB3.add(requestEditLbl);
        mainTB3.add(filler2);
        mainTB3.add(userLbl);
        mainTB3.add(filler3);

        ExitB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ExitB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontera/close (1).png"))); // NOI18N
        ExitB.setText("Cancelar");
        ExitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitB.setFocusable(false);
        ExitB.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ExitB.setMargin(new java.awt.Insets(0, 0, 0, 10));
        ExitB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBActionPerformed(evt);
            }
        });
        mainTB3.add(ExitB);

        editPanel.add(mainTB3, java.awt.BorderLayout.NORTH);

        add(editPanel, "edit");
    }// </editor-fold>//GEN-END:initComponents


    private void CabinIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CabinIdItemStateChanged

    }//GEN-LAST:event_CabinIdItemStateChanged

    private void CabinIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CabinIdFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_CabinIdFocusGained

    private void CabinIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CabinIdActionPerformed

    }//GEN-LAST:event_CabinIdActionPerformed


    private void FindBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBActionPerformed
        int a;
        List<ArticleRequest> lista;
        a = (Integer) CabinId.getSelectedItem();
        lista = daoAR.findByIDs(a);
        TableUtils.fillTableArticleRequest(requestTable, lista);
    }//GEN-LAST:event_FindBActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int selectedID = (Integer) requestTable.getValueAt(requestTable.getSelectedRow(), 0);
        Request r = daoR.read(selectedID);
        NewRequestPanel requestPanel = new NewRequestPanel(r, this);
        CardLayout cardLayout = (CardLayout) this.getLayout();
        requestEditLbl.setText("Editando Solicitud # " + String.valueOf(r.getId()));
        cardLayout.show(this, "edit");
        PanelUtils.change(editPanel, requestPanel);
    }//GEN-LAST:event_editButtonActionPerformed

    private void ExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBActionPerformed
        //logOut();
    }//GEN-LAST:event_ExitBActionPerformed

    private void backBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn3ActionPerformed
        CardLayout cardLayout = (CardLayout) this.getLayout();
        cardLayout.show(this, "view");
    }//GEN-LAST:event_backBtn3ActionPerformed

    private void requestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMouseClicked
        
    }//GEN-LAST:event_requestTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CabinId;
    private javax.swing.JButton ExitB;
    private javax.swing.JButton FindB;
    private javax.swing.JButton backBtn3;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel editPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar mainTB3;
    private javax.swing.JLabel requestEditLbl;
    private javax.swing.JTable requestTable;
    private javax.swing.JLabel userLbl;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables

    public JTable getRequestTable() {
        return requestTable;
    }

}
