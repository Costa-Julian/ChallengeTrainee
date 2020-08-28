package challenge.Trainee.repository;

import challenge.Trainee.model.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DatosRepository extends JpaRepository <Datos , Long> {

   @Query("SELECT d.dni FROM Datos AS d WHERE id IN(1)")
   Integer findFirst1By();


   @Query(value = "SELECT nombre FROM datos ORDER BY id  DESC LIMIT 1 ", nativeQuery = true )
    String findTopByOrderByCodigoDesc();

    /*Seria el equivalente a hacer una query de este tipo
    * @Query(value = "SELECT d FROM Datos d where d.apellido = :apellido")
    * List<Datos> findByApellido(@Param("apellido")String apellido);
    * donde Datos es la entidad (por eso tiene mayuscula) (no es lo mismo que la tabla)
    * apellido es el atributo de Datos (no es lo mismo que la columna de la tabla)
    * y se le envia un :apellido como parametro.
    *
    * NO ES UN ERROR: solamente otra manera de hacerlo que te puede servir a futuro para hacer otras cosas
    * la manera que utilizaste para este punto es la correcta y la pedida.
    * */
    List<Datos> findByApellido(String apellido);

    @Query(value = "SELECT * FROM datos ORDER BY codigo",nativeQuery = true )
    List<Datos> findByOrderByCodigo();
}
