package challenge.Trainee.repository;

import challenge.Trainee.model.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DatosRepository extends JpaRepository <Datos , Integer> {

    @Query("SELECT d.dni FROM Datos AS d WHERE codigo IN(1)")
    Integer findFirst1By();

   @Query(value = "SELECT nombre FROM datos ORDER BY 'codigo' DESC LIMIT 1 " , nativeQuery = true)
    String findTopByOrderByCodigo();

    List<Datos> findByApellido(String apellido);
}
