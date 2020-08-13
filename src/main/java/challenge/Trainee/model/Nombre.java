package challenge.Trainee.model;

import javax.persistence.*;

@Entity
@Table(name = "nombres")
public class Nombre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    public Nombre(){}

    public Nombre(Integer id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
