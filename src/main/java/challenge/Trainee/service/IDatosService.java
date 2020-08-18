package challenge.Trainee.service;

import challenge.Trainee.model.Datos;

import java.util.List;

public interface IDatosService {

    List<Datos> mostrarTodo();

    void guardarTodo(List<Datos> datos);

    void borrarTodo();


}
