package challenge.Trainee.service;

import challenge.Trainee.model.Nombre;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface INombreService {

    List<Nombre> mostrarTodo();

    void guardar(List<Nombre> nombre);
}
