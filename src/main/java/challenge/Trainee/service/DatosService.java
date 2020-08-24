package challenge.Trainee.service;

import challenge.Trainee.model.Datos;
import challenge.Trainee.repository.DatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DatosService implements IDatosService{
    @Autowired
    public DatosRepository repoDatos;
    @Override
    public List<Datos> mostrarTodo() {
        return repoDatos.findAll();
    }

    /*se le agrego iteracion para guardar todos "datos" de la lista*/
    @Override
    public void guardarTodo(List<Datos> datos) {
        for(Datos dato: datos){
          repoDatos.save(dato);
        }
    }

    @Override
    public void borrarTodo() {
        repoDatos.deleteAll();

    }


    }



