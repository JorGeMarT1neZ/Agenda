
package modelo;

import java.util.ArrayList;

/**
 * En esta clase hay una estructura dinamica la cual contiene objetos
 * de tipo People , aqui en esta clase, se va almacenar los contactos que se usen en la agenda
 * @author jorge
 */
public class ListaContactos {

    private ArrayList<People> contactos;

    public ListaContactos() {
        this.contactos = new ArrayList<>();
    }

    public ListaContactos(ArrayList<People> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<People> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<People> contactos) {
        this.contactos = contactos;
    }
    
}
