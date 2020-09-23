package challenge.Trainee.model;

import javax.persistence.*;


@Entity
public class Nombre {


    @Id
    private String  nombre;


    public Nombre(){}


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
