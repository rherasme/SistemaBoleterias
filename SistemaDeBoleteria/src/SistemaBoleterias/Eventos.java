
package SistemaBoleterias;

import java.util.Date;


public class Eventos {

 int codigoEvento;
 String descripcion;
 String fecha;
 
 public Eventos(int codigoEvento, String descripcion, String fecha){
     this.codigoEvento = codigoEvento;
     this.descripcion = descripcion;
     this.fecha = fecha;
 
 }

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
 
}
