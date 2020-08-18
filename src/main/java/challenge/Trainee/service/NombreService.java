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

    public void guardar(List<Nombre> nombres) {
        for(Nombre nombre : nombres)
          repoNombre.save(nombre);
    }
}
