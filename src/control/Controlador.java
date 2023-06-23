package control;

import java.awt.event.*;
import java.beans.PropertyVetoException;
import javax.swing.*;
import javax.swing.table.*;
import modelo.*;
import vista.*;

/**
 * Esta Clase permite controlar los datos que llegan desde la vista para poder
 * ser procesados y manipulados por parte del modelo
 * <p>
 * @author jorge Martinez
 * @since 2021
 */
public class Controlador implements ActionListener {

    /**
     * Este Atibuto contiene una estructura de datos la cual guarda los
     * diferentes contactos
     */
    public ListaContactos Objlc;

    /**
     * Esta es la ventana Principal, la cual el usuario puede visualizar al
     * iniciar el programa
     */
    public Principal Ven_Prin;

    /**
     * Esta es la ventana en la cual se ingresan los datos que contiene el
     * contacto
     */
    public Ven_AddContacto Ven_addCont;

    /**
     * Esta clase permite hacer la persistencia de los datos
     */
    public ConnetData C_data;

    /**
     * Esta es la ventana en la cual se ven los contactos
     */
    public Ven_Contactos Ven_VerContactos;

    /**
     * Constructor de la clase, sin parametros
     *
     *
     */
    public Controlador() {
        this.Objlc = new ListaContactos();
        this.Ven_Prin = new Principal();
        this.Ven_addCont = new Ven_AddContacto();
        this.C_data = new ConnetData();
        this.Ven_Prin.getBtn_add().addActionListener(this);
        this.Ven_Prin.getBtn_delete().addActionListener(this);
        this.Ven_Prin.getBtn_view().addActionListener(this);
        this.Ven_VerContactos = new Ven_Contactos();
        this.Ven_addCont.getBtn_AddCont().addActionListener(this);
        this.Ven_addCont.getBtn_Upload().addActionListener(this);
        this.Ven_VerContactos.getBtn_Buscar().addActionListener(this);
    }

    /**
     * Este metodo es llamado en el metodo main ,hace que el frame sea visible
     */
    public void inicia() {
        this.Ven_Prin.setVisible(true);
    }

    /**
     * Permite que los JtexFiel borren el texto almacenado
     *<p>
     * @param panel se pasa un objeto de tipo JPanel que este en alguna ventana
     */
    public void limpiarCampos(JPanel panel) {

        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (panel.getComponent(i) instanceof JTextField) {
                JTextField txt = (JTextField) panel.getComponent(i);
                txt.setText("");
            }
        }
    }

    /**
     * Este Metodo hace que la ventana se visualize
     *
     * @param frm ventana la cual se visualiza dentro del JFrame
     */
    public void abrirventana(JInternalFrame frm) {
        if (frm.isVisible()) {
            frm.toFront();
            frm.getFocusOwner();
            try {
                frm.setSelected(true);
            } catch (PropertyVetoException ex) {
                JOptionPane.showMessageDialog(null, "Error al Abrir Ventana" + ex.toString());
                this.abrirventana(new Mensaje("Error al Abrir Ventana" + ex.toString()));
            }
        } else if (!this.Ven_Prin.getPanel_Desktop().isAncestorOf(frm)) {
            this.Ven_Prin.getPanel_Desktop().add(frm);
            frm.setVisible(true);
        } else {
            this.Ven_Prin.getPanel_Desktop().setSelectedFrame(frm);
            frm.setVisible(true);
            
        }
    }

    public void agregarDatosTabla(JTable tabla) {
        DefaultTableModel plantilla = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < this.Objlc.getContactos().size(); i++) {
            String data[] = {this.Objlc.getContactos().get(i).getCedula(),
                this.Objlc.getContactos().get(i).getNombre(),
                this.Objlc.getContactos().get(i).getApellido(),
                this.Objlc.getContactos().get(i).getCorreo()};
            plantilla.addRow(data);
        }
        //Para centrar el texto de cada fila de la tabla //
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.Ven_Prin.getBtn_add()) {
            this.abrirventana(Ven_addCont);
        }

        if (e.getSource() == this.Ven_addCont.getBtn_AddCont()) {
            People contactoNuevo = new People();
            contactoNuevo.setNombre(this.Ven_addCont.getTxt_nombre().getText().trim());
            // el metodo trim , elimina los espacios en blanco que pueda tener el JtexFiel
            contactoNuevo.setApellido(this.Ven_addCont.getTxt_apellido().getText().trim());
            contactoNuevo.setCorreo(this.Ven_addCont.getTxt_correo().getText().trim());
            contactoNuevo.setNumTel(this.Ven_addCont.getTxt_tel().getText().trim());
            try { // si El usuario ingresa Datos no numericos se lanza una Excepcion //
                if (this.Ven_addCont.getTxt_cedula().getText().isEmpty()) {
                    throw new IllegalArgumentException(); // si el Campo esta vacio 
                } else {
                    this.Ven_addCont.getLabelCed().setForeground(new java.awt.Color(0,0,0));
                    contactoNuevo.setCedula(this.Ven_addCont.getTxt_cedula().getText());
                    contactoNuevo.getFechaNacimiento().setDd(Integer.parseInt(this.Ven_addCont.getTxt_day().getText().trim()));
                    contactoNuevo.getFechaNacimiento().setMm(Integer.parseInt(this.Ven_addCont.getTxt_month().getText().trim()));
                    contactoNuevo.getFechaNacimiento().setAa(Integer.parseInt(this.Ven_addCont.getTxt_year().getText().trim()));
                    this.Ven_addCont.dispose();
                    this.Objlc.getContactos().add(contactoNuevo); // Contacto Guardado 
                }
                this.abrirventana(new Mensaje("Contacto Añadido"));
                this.limpiarCampos(this.Ven_addCont.getPanelComponetes());
            } catch (NumberFormatException ex_1) {//si se ingresan datos no numericos//
                this.limpiarCampos(this.Ven_addCont.getPanelAddContacto());
                this.abrirventana(new Mensaje(ex_1.toString()));
            } catch (IllegalArgumentException ex_2) { // si el campo esta vacio 
                this.Ven_addCont.getLabelCed().setForeground(new java.awt.Color(204, 0, 0));
                this.abrirventana(new Mensaje("Campo Vacio " + ex_2.toString()));
            }
        }
        if (e.getSource() == this.Ven_Prin.getBtn_view()) {
            DefaultTableModel plantilla = (DefaultTableModel) this.Ven_VerContactos.getTablaContactos().getModel();
            for (int i = this.Ven_VerContactos.getTablaContactos().getRowCount() - 1; i >= 0; i--) {
                plantilla.removeRow(i);
            }
            this.agregarDatosTabla(this.Ven_VerContactos.getTablaContactos());
            this.Ven_VerContactos.getLabelNum().setText(this.Objlc.getContactos().size() + " Contactos");
            this.abrirventana(this.Ven_VerContactos);
        }

        if (e.getSource() == this.Ven_addCont.getBtn_Upload()) {
            this.Ven_addCont.dispose();
            this.abrirventana(new Mensaje("Contactos Cargados"));
            this.C_data.UpData(this.Objlc.getContactos());
        }

        if (this.Ven_VerContactos.getBtnGrupo1().getSelection() == null) {

            if (e.getSource() == this.Ven_VerContactos.getBtn_Buscar()) {
                this.abrirventana(new Mensaje("Ningun Boton seleccionado"));
            }
        }

        if (this.Ven_VerContactos.getRtnCedula().isSelected()) {

            if (e.getSource() == this.Ven_VerContactos.getBtn_Buscar()) {
                String bucar = this.Ven_VerContactos.getTxtBusqueda().getText().trim();
                boolean band = false;
                int indice = 0;
                //este ciclo permite buscar la palabra requerida //
                for (int i = 0; i < this.Objlc.getContactos().size(); i++) {
                    band = bucar.equals(this.Objlc.getContactos().get(i).getCedula());
                    indice = i;
                    if (band) {
                        break;
                    }
                }
                if (band) {
                    //este ciclo permite limpiar las filas de la tabla// 
                    DefaultTableModel plantilla = (DefaultTableModel) this.Ven_VerContactos.getTablaContactos().getModel();
                    for (int i = this.Ven_VerContactos.getTablaContactos().getRowCount() - 1; i >= 0; i--) {
                        plantilla.removeRow(i);
                    }
                    String data[] = {this.Objlc.getContactos().get(indice).getCedula(),
                        this.Objlc.getContactos().get(indice).getNombre(),
                        this.Objlc.getContactos().get(indice).getApellido(),
                        this.Objlc.getContactos().get(indice).getCorreo()};
                    plantilla.addRow(data);
                } else {
                    this.abrirventana(new Mensaje("El Campo ingresado No existe"));
                }
                this.Ven_VerContactos.getBtnGrupo1().clearSelection();
            }
        }
        if (this.Ven_VerContactos.getRbtnNombre().isSelected()) {

            if (e.getSource() == this.Ven_VerContactos.getBtn_Buscar()) {
                String bucar = this.Ven_VerContactos.getTxtBusqueda().getText().trim();
                boolean band = false;
                int indice = 0;
                for (int i = 0; i < this.Objlc.getContactos().size(); i++) {
                    band = bucar.equalsIgnoreCase(this.Objlc.getContactos().get(i).getNombre());
                    indice = i;
                    if (band) {
                        break;
                    }
                }
                if (band) {
                    DefaultTableModel plantilla = (DefaultTableModel) this.Ven_VerContactos.getTablaContactos().getModel();
                    for (int i = this.Ven_VerContactos.getTablaContactos().getRowCount() - 1; i >= 0; i--) {
                        plantilla.removeRow(i);
                    }
                    String data[] = {this.Objlc.getContactos().get(indice).getCedula(),
                        this.Objlc.getContactos().get(indice).getNombre(),
                        this.Objlc.getContactos().get(indice).getApellido(),
                        this.Objlc.getContactos().get(indice).getCorreo()};
                    plantilla.addRow(data);
                } else {
                    this.abrirventana(new Mensaje("El Campo ingresado No existe"));
                }
                this.Ven_VerContactos.getBtnGrupo1().clearSelection();
            }
        }
        if (this.Ven_VerContactos.getRbtnCorreo().isSelected()) {

            if (e.getSource() == this.Ven_VerContactos.getBtn_Buscar()) {
                String bucar = this.Ven_VerContactos.getTxtBusqueda().getText().trim();
                boolean band = false;
                int indice = 0;
                for (int i = 0; i < this.Objlc.getContactos().size(); i++) {
                    band = bucar.equalsIgnoreCase(this.Objlc.getContactos().get(i).getCorreo());
                    indice = i;
                    if (band) {
                        break;
                    }
                }
                if (band) {
                    DefaultTableModel plantilla = (DefaultTableModel) this.Ven_VerContactos.getTablaContactos().getModel();
                    for (int i = this.Ven_VerContactos.getTablaContactos().getRowCount() - 1; i >= 0; i--) {
                        plantilla.removeRow(i);
                    }
                    String data[] = {this.Objlc.getContactos().get(indice).getCedula(),
                        this.Objlc.getContactos().get(indice).getNombre(),
                        this.Objlc.getContactos().get(indice).getApellido(),
                        this.Objlc.getContactos().get(indice).getCorreo()};
                    plantilla.addRow(data);
                } else {
                    this.abrirventana(new Mensaje("El Campo ingresado No existe"));
                }
                this.Ven_VerContactos.getBtnGrupo1().clearSelection();
            }
        }
    }
}
