package challenge.Trainee.service;

import challenge.Trainee.model.Nombre;
import challenge.Trainee.repository.NombreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NombreService implements INombreService {
    @Autowired
    public NombreRepository repoNombre;
    @Override
    public List<Nombre> mostrarTodo() {
        return repoNombre.findAll();
    }

    @Override
    public void guardar(Nombre nombre) {
        repoNombre.save(nombre);
    }
}
