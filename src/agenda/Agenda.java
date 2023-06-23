/*
 * En esta Clase el metodo principal de java , ejecuta el proyecto de la agenda 
 */
package agenda;

import control.Controlador;
import vista.Mensaje;

/**
 *
 * @author jorge
 */
public class Agenda {

    /**
     * Metodo principal el cual hace que se pueda 
     * ejecutar la aplicacion, mediante la invocacon del metodo "inicia" 
     * @param args
     */
    public static void main(String[] args)  {
       control.Controlador Obj = new Controlador(); 
       Obj.inicia();  
    }
    
}
