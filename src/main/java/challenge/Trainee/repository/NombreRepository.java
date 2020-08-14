package challenge.Trainee.repository;

import challenge.Trainee.model.Nombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface NombreRepository extends JpaRepository<Nombre , Integer> {

    List<Nombre> findByNombreStartingWith(String nombre);

    List<Nombre> findByNombreEndingWith(String nombre);



}
