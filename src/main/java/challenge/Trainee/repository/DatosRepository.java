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


    List<Datos> findByApellido(String apellido);

    @Query(value = "SELECT * FROM datos ORDER BY codigo",nativeQuery = true )
    List<Datos> findByOrderByCodigo();
}
