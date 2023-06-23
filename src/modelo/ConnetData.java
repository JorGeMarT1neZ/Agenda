package modelo;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author jorge
 */
public class ConnetData {

    private Scanner leerArc;

    public ConnetData(Scanner leerArc) {
        this.leerArc = leerArc;
    }
    
    public ConnetData()  {
        try{
            this.leerArc = new Scanner(new File("ExportC2SV.txt"));
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al abrir el archivo" + ex.toString());
        }
    }

    public void UpData(ArrayList Lista) {
        while (this.leerArc.hasNext()) {
            Scanner sl = new Scanner(this.leerArc.nextLine());
            sl.useDelimiter("\\s*,\\s*");
            Lista.add(new People(
                    sl.next(),
                    sl.next(),
                    sl.next(),
                    sl.next(),
                    sl.next(),
                    new Fecha(
                            Integer.parseInt(sl.next()),
                            Integer.parseInt(sl.next()),
                            Integer.parseInt(sl.next()))));
        }
    }

    public Scanner getLeerArc() {
        return leerArc;
    }

    public void setLeerArc(Scanner leerArc) {
        this.leerArc = leerArc;
    }
}
