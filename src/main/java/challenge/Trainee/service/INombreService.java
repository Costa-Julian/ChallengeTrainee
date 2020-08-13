package challenge.Trainee.service;

import challenge.Trainee.model.Nombre;

import java.util.List;

public interface INombreService {

    List<Nombre> mostrarTodo();
    void guardar(Nombre nombre);
}
