package challenge.Trainee.model;

import javax.persistence.*;

@Entity
@Table(name = "nombres")
public class Nombre {
    /*Los ids conviene ponerlos en Long por una cuestion de cantidades que se lleguen a manejar*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String nombre;

    public Nombre(){}

  /*tuve que agregarle este constructor sino no lo tomaba*/
  public Nombre(String nombre){
      this.nombre = nombre;
  }
 /*tengo entendido que no seria necesario*/
    public Nombre(Integer id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
