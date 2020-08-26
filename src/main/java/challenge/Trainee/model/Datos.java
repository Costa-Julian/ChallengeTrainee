package challenge.Trainee.model;

import javax.persistence.*;

@Entity
@Table(name = "datos")
public class Datos {

    /*falto ponerle los datos
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Siempre trata de que se mantenga una coherencia en tu propio codigo
    (Espacios que dejas para los ifs , anotations que usas,
    si le pones o no llaves despues de un if de una sola sentencia,  etc)
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nombre;
    private String apellido;
    private Integer dni;

    public long getCodigo() {
        return codigo ;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                '}';
    }
}
