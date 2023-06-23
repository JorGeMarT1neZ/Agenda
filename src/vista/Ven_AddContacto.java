package vista;

import javax.swing.*;
/**
 *
 * @author jorge
 */
public class Ven_AddContacto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ven_AddContacto
     */
    public Ven_AddContacto() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAddContacto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Btn_AddCont = new javax.swing.JButton();
        PanelComponetes = new javax.swing.JPanel();
        txt_cedula = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_day = new javax.swing.JTextField();
        txt_month = new javax.swing.JTextField();
        txt_year = new javax.swing.JTextField();
        LabelCed = new javax.swing.JLabel();
        LabelNom = new javax.swing.JLabel();
        LabelApe = new javax.swing.JLabel();
        LabelCorr = new javax.swing.JLabel();
        LabelFech = new javax.swing.JLabel();
        LabelTel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Btn_Upload = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 248, 251));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setClosable(true);
        setTitle("Agenda");
        setPreferredSize(new java.awt.Dimension(776, 360));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAddContacto.setBackground(new java.awt.Color(110, 0, 255));
        PanelAddContacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Añadir Contacto");
        PanelAddContacto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        Btn_AddCont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Images&Icons/sum.png"))); // NOI18N
        Btn_AddCont.setBorder(null);
        Btn_AddCont.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Images&Icons/sum_opc.png"))); // NOI18N
        PanelAddContacto.add(Btn_AddCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 80, 30));

        getContentPane().add(PanelAddContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 776, 49));

        PanelComponetes.setBackground(new java.awt.Color(255, 255, 255));
        PanelComponetes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cedula.setBackground(new java.awt.Color(248, 248, 251));
        txt_cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponetes.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 258, 30));

        txt_apellido.setBackground(new java.awt.Color(248, 248, 251));
        txt_apellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponetes.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 258, 30));

        txt_nombre.setBackground(new java.awt.Color(248, 248, 251));
        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponetes.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 258, 30));

        txt_tel.setBackground(new java.awt.Color(248, 248, 251));
        txt_tel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponetes.add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 258, 30));

        txt_correo.setBackground(new java.awt.Color(248, 248, 251));
        txt_correo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponetes.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 258, 30));

        txt_day.setBackground(new java.awt.Color(248, 248, 251));
        txt_day.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponetes.add(txt_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 36, 30));

        txt_month.setBackground(new java.awt.Color(248, 248, 251));
        txt_month.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponetes.add(txt_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 36, 30));

        txt_year.setBackground(new java.awt.Color(248, 248, 251));
        txt_year.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelComponetes.add(txt_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 36, 30));

        LabelCed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCed.setText("Cedula");
        PanelComponetes.add(LabelCed, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        LabelNom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelNom.setText("Nombre");
        PanelComponetes.add(LabelNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        LabelApe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelApe.setText("Apellido");
        PanelComponetes.add(LabelApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        LabelCorr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCorr.setText("Correo");
        PanelComponetes.add(LabelCorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        LabelFech.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelFech.setText("Fecha de Nacimiento");
        PanelComponetes.add(LabelFech, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        LabelTel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTel.setText("Telefono");
        PanelComponetes.add(LabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Subir Contactos");
        PanelComponetes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        Btn_Upload.setBackground(new java.awt.Color(248, 248, 251));
        Btn_Upload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Images&Icons/DataB.png"))); // NOI18N
        Btn_Upload.setBorder(null);
        Btn_Upload.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Images&Icons/DataB_opc.png"))); // NOI18N
        PanelComponetes.add(Btn_Upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        getContentPane().add(PanelComponetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 775, 283));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getPanelComponetes() {
        return PanelComponetes;
    }

    public void setPanelComponetes(JPanel PanelComponetes) {
        this.PanelComponetes = PanelComponetes;
    }

    public JLabel getLabelApe() {
        return LabelApe;
    }

    public void setLabelApe(JLabel LabelApe) {
        this.LabelApe = LabelApe;
    }

    public JLabel getLabelCed() {
        return LabelCed;
    }

    public void setLabelCed(JLabel LabelCed) {
        this.LabelCed = LabelCed;
    }

    public JLabel getLabelCorr() {
        return LabelCorr;
    }

    public void setLabelCorr(JLabel LabelCorr) {
        this.LabelCorr = LabelCorr;
    }

    public JLabel getLabelFech() {
        return LabelFech;
    }

    public void setLabelFech(JLabel LabelFech) {
        this.LabelFech = LabelFech;
    }

    public JLabel getLabelNom() {
        return LabelNom;
    }

    public void setLabelNom(JLabel LabelNom) {
        this.LabelNom = LabelNom;
    }

    public JLabel getLabelTel() {
        return LabelTel;
    }

    public void setLabelTel(JLabel LabelTel) {
        this.LabelTel = LabelTel;
    }

    public JButton getBtn_Upload() {
        return Btn_Upload;
    }

    public void setBtn_Upload(JButton Btn_Upload) {
        this.Btn_Upload = Btn_Upload;
    }

    public JButton getBtn_AddCont() {
        return Btn_AddCont;
    }

    public void setBtn_AddCont(JButton Btn_AddCont) {
        this.Btn_AddCont = Btn_AddCont;
    }

    public JTextField getTxt_apellido() {
        return txt_apellido;
    }

    public void setTxt_apellido(JTextField txt_apellido) {
        this.txt_apellido = txt_apellido;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public void setTxt_cedula(JTextField txt_cedula) {
        this.txt_cedula = txt_cedula;
    }

    public JTextField getTxt_correo() {
        return txt_correo;
    }

    public void setTxt_correo(JTextField txt_correo) {
        this.txt_correo = txt_correo;
    }

    public JTextField getTxt_day() {
        return txt_day;
    }

    public void setTxt_day(JTextField txt_day) {
        this.txt_day = txt_day;
    }

    public JTextField getTxt_month() {
        return txt_month;
    }

    public void setTxt_month(JTextField txt_month) {
        this.txt_month = txt_month;
    }

    public JTextField getTxt_nombre() {
        return txt_nombre;
    }

    public void setTxt_nombre(JTextField txt_nombre) {
        this.txt_nombre = txt_nombre;
    }

    public JTextField getTxt_tel() {
        return txt_tel;
    }

    public void setTxt_tel(JTextField txt_tel) {
        this.txt_tel = txt_tel;
    }

    public JTextField getTxt_year() {
        return txt_year;
    }

    public void setTxt_year(JTextField txt_year) {
        this.txt_year = txt_year;
    }

    public JPanel getPanelAddContacto() {
        return PanelAddContacto;
    }

    public void setPanelAddContacto(JPanel PanelAddContacto) {
        this.PanelAddContacto = PanelAddContacto;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_AddCont;
    private javax.swing.JButton Btn_Upload;
    private javax.swing.JLabel LabelApe;
    private javax.swing.JLabel LabelCed;
    private javax.swing.JLabel LabelCorr;
    private javax.swing.JLabel LabelFech;
    private javax.swing.JLabel LabelNom;
    private javax.swing.JLabel LabelTel;
    private javax.swing.JPanel PanelAddContacto;
    private javax.swing.JPanel PanelComponetes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_day;
    private javax.swing.JTextField txt_month;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables
}
