package challenge.Trainee.repository;

import challenge.Trainee.model.Nombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface NombreRepository extends JpaRepository<Nombre , Integer> {
    //PENDIENTE DE SOLUCION!!
    String findByNombreStartingWith(String nombre);
    @Query("SELECT d.nombre FROM Nombre AS d ")
    String findByNombreEndingWith(String nombre);


}
