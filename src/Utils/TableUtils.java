/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import DAO.DAOArticleRequest;
import Entidad.Article;
import Entidad.ArticleRequest;
import Entidad.Cabin;
import Entidad.Request;
import Entidad.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author leons
 */
public class TableUtils {

    public TableUtils() {
    }

    public static void fillTableUser(JTable table, List<User> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "Nombre", "Apellido", "Nombre de Usuario", "País", "Dirección", "Teléfono", "Contraseña", "Rol"
        });
        for (User t : list) {
            model.addRow(new Object[]{t.getName(), t.getLastName(), t.getUserName(), t.getCountry(), t.getAdress(),
                t.getPhone(), t.getPassword(), t.getRole()});
        }
        table.setModel(model);
    }

    public static void fillTableArticle(JTable table, List<Article> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "Género", "Nombre", "Lavado", "Lavado y Planchado", "Planchado", "Doblado"
        });
        for (Article t : list) {
            model.addRow(new Object[]{t.getGender(), t.getClothName(), t.getWashPrice(), t.getWaiPrice(), t.getIronPrice(),
                t.getFoldPrice()});
        }
        table.setModel(model);
    }

    public static void fillTableArticleRequest(JTable table, List<ArticleRequest> list) {
        DefaultTableModel model = new DefaultTableModel(null,
                new String[]{
                    "#", "Género", "Nombre", "Servicio", "Doblado", "Express", "Cantidad", "Subtotal"
                }) {
            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        for (ArticleRequest t : list) {
            model.addRow(new Object[]{t.getId() == null ? t.getTempId() : t.getId(), t.getArticle().getGender(), t.getArticle().getClothName(), t.getService(), t.isFold(), t.isExpress(), t.getQuantity(), t.getSubtotal()});
        }
        table.setModel(model);
    }

    public static void fillTableArticleServices(JTable table, List<ArticleRequest> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "ID", "Cabina", "Lavado", "Planchado", "Lav. y Plan.", "Express", "Total"
        });
        for (ArticleRequest t : list) {
            model.addRow(new Object[]{t.getRequest().getId(), t.getRequest().getCabin(), t.getArticle().getClothName(),
                t.getService(), t.isFold(), t.isExpress(), t.getQuantity(), t.getSubtotal()});
        }
        table.setModel(model);
    }

    public class MiModelo extends DefaultTableModel {

        /**
         * Primera columna Boolean, segunda Integer y el resto Object
         */
        public Class getColumnClass(int columna) {
            if (columna == 0) {
                return Boolean.class;
            }
            if (columna == 1) {
                return Integer.class;
            }
            return Object.class;
        }
    }

    public static void fillTableRequest(JTable table, List<Request> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "ID", "Cabina", "Total", "Nº Prendas", "Fecha de creación"
        }) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };
        };

        for (Request r : list) {
            model.addRow(new Object[]{r.getId(), r.getCabin().getId(), r.getTotal(), r.getArticleSet().size(), r.getCreated_at()});
        }
        table.setModel(model);
    }

    public static void addPopUpMenu(JTable table) {
        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem editItem = new JMenuItem("Editar");
        JMenuItem disableItem = new JMenuItem("Deshabilitar");
        editItem.addActionListener((ActionEvent e) -> {
            //TODO: Add Popup for editing
        });
        popupMenu.add(editItem);
        table.setComponentPopupMenu(popupMenu);
    }

    public static void guardaTabla(Cabin cabin, JTable table, Request request) {
        try {
            String company = ""
                    + "Lavandería a Bordo\n"
                    + "600 NW 1st Ave, Miami, FL‎\n"
                    + "Land: 812254630 Mob: 712205220 Fax: 812254639\n"
                    + " \n";
            String sucursalesCSVFile = "archivos/DatosTabla.txt";
            BufferedWriter bfw = new BufferedWriter(new FileWriter(sucursalesCSVFile));
            bfw.write(company);
            bfw.write("Fecha:  ");
            bfw.write(request.getCreated_at().toString() + " \n ");
            bfw.write("Solicitud Nº: " + cabin.getId() + "\n");
            bfw.write("Cliente: ");
//          bfw.write(cabin.getResponsibleUser().getName());
            bfw.write("\n_________________________________________");
            bfw.newLine();
            for (int i = 0; i < table.getRowCount(); i++) //realiza un barrido por filas.
            {
                for (int j = 0; j < table.getColumnCount(); j++) //realiza un barrido por columnas.
                {
                    bfw.write((table.getValueAt(i, j)).toString());
                    if (j < table.getColumnCount() - 1) { //agrega separador "," si no es el ultimo elemento de la fila.
                        bfw.write("|");
                    }
                }

                bfw.write("\n_________________________________________");
                bfw.newLine();//inserta nueva linea.
            }

            bfw.close(); //cierra archivo!
            System.out.println("El archivo fue salvado correctamente!");
        } catch (IOException e) {
            System.out.println("ERROR: Ocurrio un problema al salvar el archivo!" + e.getMessage());
        }
    }

    public static void clearTable(JTable table) {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    public static void fillRequestStatistics(JTable table, List<Request> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "ID", "Cabina", "Lavado", "Planchado", "Lav. y Plan.", "Total"
        });
        for (Request r : list) {
            double washSum = 0, ironSum = 0, ironWashSum = 0, expressSum = 0, total = 0;
            Set<ArticleRequest> artAR = r.getArticleSet();
            List<ArticleRequest> listAR = new ArrayList<>(artAR);
            washSum = listAR.stream().filter(ar -> ar.getService().equals("Lavado")).mapToDouble(ar -> ar.getSubtotal()).sum();
            ironWashSum = listAR.stream().filter(ar -> ar.getService().equals("Lavado y Planchado")).mapToDouble(ar -> ar.getSubtotal()).sum();
            ironSum = listAR.stream().filter(ar -> ar.getService().equals("Planchado")).mapToDouble(ar -> ar.getSubtotal()).sum();
            total = listAR.stream().mapToDouble(ar -> ar.getSubtotal()).sum();
            model.addRow(new Object[]{r.getId(), r.getCabin().getId(), washSum, ironSum, ironWashSum, total});
        }
        table.setModel(model);
    }

    public static void fillArticleStatistics(JTable table, List<Request> list) {
        DAOArticleRequest daoT = new DAOArticleRequest();
        List<ArticleRequest> ars = daoT.findAll();
        List<ArticleRequest> filtered = ars.stream()
                .filter(arr -> list.stream()
                .anyMatch(r -> arr.getRequest().getId() == r.getId()))
                .collect(Collectors.toList());

        Map<Article, List<ArticleRequest>> art = filtered.stream().collect(Collectors.groupingBy(ArticleRequest::getArticle));

        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "Nombre prenda", "Lavado", "Planchado", "Lav. y Plan.", "Express", "Total"
        });

        art.forEach((k, v) -> {
            double wash = v.stream().filter(ar -> ar.getService().equalsIgnoreCase("lavado")).mapToDouble(ar -> ar.getSubtotal()).sum();
            double iron = v.stream().filter(ar -> ar.getService().equalsIgnoreCase("planchado")).mapToDouble(ar -> ar.getSubtotal()).sum();
            double ironWash = v.stream().filter(ar -> ar.getService().equalsIgnoreCase("lavado y planchado")).mapToDouble(ar -> ar.getSubtotal()).sum();
            double express = v.stream().filter(ar -> ar.isExpress()).mapToDouble(ar -> ar.getSubtotal()).sum();
            double Total = v.stream().mapToDouble(ar -> ar.getSubtotal()).sum();
            model.addRow(new Object[]{k.getClothName(), wash, iron, ironWash, express, Total});
        });
        table.setModel(model);
    }
}
