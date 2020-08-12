package challenge.Trainee.service;

import challenge.Trainee.model.Datos;
import challenge.Trainee.repository.DatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatosService implements IDatosService{
    @Autowired
    public DatosRepository repoDatos;
    @Override
    public List<Datos> mostrarTodo() {
        return repoDatos.findAll();
    }

    @Override
    public void guardarTodo(Datos datos) {
        repoDatos.save(datos);
    }

    @Override
    public void borrarTodo() {
        repoDatos.deleteAll();

    }


    }



