/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import DAO.DAOArticle;
import Entidad.Article;
import Utils.BoxUtils;
import Utils.PanelUtils;
import Utils.TableUtils;
import java.util.List;

/**
 *
 * @author leons
 */
public class ArticlePanel extends javax.swing.JPanel {

    /**
     * Creates new form ArticlePanel
     */
    public NewArticlePanel newArticle;
    public ViewArticles viewArticles ;
    public EditArticle editArticle;
    
    public static NewArticlePanel NServ = new NewArticlePanel();
    public static CreateAccount acc = new CreateAccount();
    public static ViewArticles viewT = new ViewArticles();
    public static EditArticlePanel editT = new EditArticlePanel();
    private DAOArticle daoT = new DAOArticle();
    List<Article> list = daoT.findAll(); 
    public ArticlePanel() {
        initComponents();
        newArticle = new NewArticlePanel();
        viewArticles = new ViewArticles();
        editArticle = new EditArticle();  
        
        PanelUtils.change(addArticleTab, newArticle);
        
        tabs.addChangeListener(e -> {
            switch (tabs.getSelectedIndex()) {
                case 0:
                    PanelUtils.change(addArticleTab, newArticle);
                    break;
                case 1:
                    PanelUtils.change(viewArticlesTab, viewArticles);
                    break;
                default:
                    PanelUtils.change(editArticleTab, editArticle);
                    break;
            }
        });
//        PanelUtils.change(addArticleTab, newArticle);
//        //PanelUtils.change(viewArticlesTab, viewArticles);
//        PanelUtils.change(editArticleTab, editArticle);
                
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

        tabs = new javax.swing.JTabbedPane();
        addArticleTab = new javax.swing.JPanel();
        viewArticlesTab = new javax.swing.JPanel();
        editArticleTab = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(860, 500));
        setLayout(new java.awt.BorderLayout());

        tabs.setPreferredSize(new java.awt.Dimension(800, 300));

        addArticleTab.setLayout(new java.awt.BorderLayout());
        tabs.addTab("Agregar nuevo artículo", addArticleTab);

        viewArticlesTab.setLayout(new java.awt.BorderLayout());
        tabs.addTab("Ver artículos", viewArticlesTab);

        editArticleTab.setLayout(new java.awt.BorderLayout());
        tabs.addTab("Editar artículo", editArticleTab);

        add(tabs, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed
      
        PanelUtils.change(addArticleTab, NServ); 
        TableUtils.fillTable(NewArticlePanel.schemaClothes, daoT.findAll()); 
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBActionPerformed

    private void AccountBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountBActionPerformed
        PanelUtils.change(addArticleTab, acc); 
                                              // TODO add your handling code here:
    }//GEN-LAST:event_AccountBActionPerformed

    private void ViewSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSBActionPerformed
        PanelUtils.change(addArticleTab, viewT);  
        TableUtils.fillTable(viewT.schemaClothes, daoT.findAll());// TODO add your handling code here:
    }//GEN-LAST:event_ViewSBActionPerformed

    private void EditSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSBActionPerformed
        PanelUtils.change(addArticleTab, editT); 
        TableUtils.fillTable(editT.schemaClothes, daoT.findAll()); 
        BoxUtils.updateBox(daoT.getGenders(),EditArticlePanel.GenderBox);// TODO add your handling code here:
    }//GEN-LAST:event_EditSBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addArticleTab;
    private javax.swing.JPanel editArticleTab;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JPanel viewArticlesTab;
    // End of variables declaration//GEN-END:variables
}