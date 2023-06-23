/*
 * Esta clase permitira agregar personas con sus respectivos datos 
 * para poder ser almacenados en una estructura dinamica 
 */
package modelo;

/**
 *
 * @author jorge
 */
public class People {
    
    private String cedula,nombre,apellido,correo,numTel;
    private Fecha fechaNacimiento ;
    
    public People() {
        this.cedula = "";
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.numTel = "";
        this.fechaNacimiento = new Fecha();
    }

    public People(String cedula, String nombre, String apellido, String correo, String numTel, Fecha fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numTel = numTel;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "--People--" 
                + "\ncedula = " + cedula 
                + "\nnombre = " + nombre 
                + "\napellido = " + apellido 
                + "\ncorreo = " + correo 
                + "\nnumTel = " + numTel 
                + "\nfechaNacimiento = " + fechaNacimiento + "\n\n";
    }
}
