package challenge.Trainee.repository;

import challenge.Trainee.model.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DatosRepository extends JpaRepository <Datos , Integer> {
    @Query("SELECT d.dni FROM Datos AS d")
    Integer findById(int id);
    @Query("SELECT d.dni FROM Datos AS d")
    Integer findTopBy();
    @Query("SELECT d.nombre FROM Datos AS d")
    String findTopByOrderByIdDesc();
}
