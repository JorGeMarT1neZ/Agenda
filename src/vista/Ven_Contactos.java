
package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author jorge
 */
public class Ven_Contactos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ven_Contactos
     */
    public Ven_Contactos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo1 = new javax.swing.ButtonGroup();
        panelContactos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContactos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Btn_Buscar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        rtnCedula = new javax.swing.JRadioButton();
        rbtnNombre = new javax.swing.JRadioButton();
        rbtnCorreo = new javax.swing.JRadioButton();
        LabelNum = new javax.swing.JLabel();

        setBackground(new java.awt.Color(248, 248, 251));
        setClosable(true);

        panelContactos.setBackground(new java.awt.Color(110, 0, 255));
        panelContactos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lista de Contactos ");
        panelContactos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tablaContactos.setForeground(new java.awt.Color(0, 0, 0));
        tablaContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaContactos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaContactos.setRowHeight(25);
        tablaContactos.setSelectionBackground(new java.awt.Color(110, 0, 255));
        tablaContactos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaContactos);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Buscar");

        Btn_Buscar.setBackground(new java.awt.Color(248, 248, 251));
        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Images&Icons/buscar.png"))); // NOI18N
        Btn_Buscar.setBorder(null);
        Btn_Buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Images&Icons/buscar_opc.png"))); // NOI18N
        Btn_Buscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Images&Icons/buscar.png"))); // NOI18N

        txtBusqueda.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        rtnCedula.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo1.add(rtnCedula);
        rtnCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rtnCedula.setText("Cedula");

        rbtnNombre.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo1.add(rbtnNombre);
        rbtnNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnNombre.setText("Nombre");

        rbtnCorreo.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo1.add(rbtnCorreo);
        rbtnCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnCorreo.setText("Correo");
        rbtnCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCorreoActionPerformed(evt);
            }
        });

        LabelNum.setBackground(new java.awt.Color(255, 255, 255));
        LabelNum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContactos, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(Btn_Buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rtnCedula)
                                    .addComponent(rbtnNombre)
                                    .addComponent(rbtnCorreo))))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtnCedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnCorreo)
                                .addGap(22, 22, 22)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LabelNum)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
//        DefaultTableModel plantilla = (DefaultTableModel) this.tablaContactos.getModel();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(plantilla);
//       this.tablaContactos.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(this.txtBusqueda.getText()));
///////////////////////////////////////////////////////////////////////////////////////////////////////
//        TableModel plantilla = (DefaultTableModel) this.tablaContactos.getModel();
//        TableRowSorter<TableModel> sorter = new TableRowSorter<>(plantilla);
//        this.tablaContactos.setRowSorter(sorter);
//        if (this.txtBusqueda.getText().isEmpty()) {
//            sorter.setRowFilter(null);
//        } else {
//            sorter.setRowFilter(RowFilter.regexFilter(this.txtBusqueda.getText().trim()));
//        }

    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void rbtnCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCorreoActionPerformed

    public ButtonGroup getBtnGrupo1() {
        return btnGrupo1;
    }

    public void setBtnGrupo1(ButtonGroup btnGrupo1) {
        this.btnGrupo1 = btnGrupo1;
    }

    public JRadioButton getRbtnCorreo() {
        return rbtnCorreo;
    }

    public void setRbtnCorreo(JRadioButton rbtnCorreo) {
        this.rbtnCorreo = rbtnCorreo;
    }

    public JRadioButton getRbtnNombre() {
        return rbtnNombre;
    }

    public void setRbtnNombre(JRadioButton rbtnNombre) {
        this.rbtnNombre = rbtnNombre;
    }

    public JRadioButton getRtnCedula() {
        return rtnCedula;
    }

    public void setRtnCedula(JRadioButton rtnCedula) {
        this.rtnCedula = rtnCedula;
    }

    public JPanel getPanelContactos() { 
        return panelContactos;
    }

    public void setPanelContactos(JPanel panelContactos) {
        this.panelContactos = panelContactos;
    }

    public JTable getTablaContactos() {
        return tablaContactos;
    }

    public void setTablaContactos(JTable tablaContactos) {
        this.tablaContactos = tablaContactos;
    }

    public JTextField getTxtBusqueda() {
        return txtBusqueda;
    }

    public void setTxtBusqueda(JTextField txtBusqueda) {
        this.txtBusqueda = txtBusqueda;
    }

    public JButton getBtn_Buscar() {
        return Btn_Buscar;
    }

    public void setBtn_Buscar(JButton Btn_Buscar) {
        this.Btn_Buscar = Btn_Buscar;
    }

    public JLabel getLabelNum() {
        return LabelNum;
    }

    public void setLabelNum(JLabel LabelNum) {
        this.LabelNum = LabelNum;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JLabel LabelNum;
    private javax.swing.ButtonGroup btnGrupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelContactos;
    private javax.swing.JRadioButton rbtnCorreo;
    private javax.swing.JRadioButton rbtnNombre;
    private javax.swing.JRadioButton rtnCedula;
    private javax.swing.JTable tablaContactos;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
