package challenge.Trainee.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Nombre {
    /*Los ids conviene ponerlos en Long por una cuestion de cantidades que se lleguen a manejar*/

    @Id
    private String  nombre;


    public Nombre(){}

  /*tuve que agregarle este constructor sino no lo tomaba*/
  public Nombre(String nombre){
      this.nombre = nombre;
  }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre{" +
                "nombre=" + nombre +
                '}';
    }
}
