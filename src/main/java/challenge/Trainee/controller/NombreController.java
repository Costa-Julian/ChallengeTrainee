package challenge.Trainee.controller;

import challenge.Trainee.model.Nombre;
import challenge.Trainee.repository.NombreRepository;
import challenge.Trainee.service.INombreService;
import challenge.Trainee.service.NombreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//PENDIENTE DE SOLUCION
@RestController
@RequestMapping("/nombre")
public class NombreController {
    @Autowired
    public NombreService nombreService;
    @Autowired
    public NombreRepository repoNombre;

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
    @GetMapping("/mostrar")
    public List<Nombre> mostrarTodo(){
        return nombreService.mostrarTodo();
    }
    @PostMapping("/nombre")
    public String principal(@RequestBody Nombre nombre){
        nombreService.guardar(nombre);
        return nombreInicio() + "\n" + nombreFin();
    }
    @GetMapping("/lu")
    public String nombreInicio(){
        String buscado = repoNombre.findByNombreStartingWith("LU");
        return "Nombres que comienzan con 'LU': " + buscado;
    }
    @GetMapping("/s")
    public String nombreFin(){
        String fin = repoNombre.findByNombreEndingWith("S");
        return "Nombres finalizados en S: " + fin;
    }
}

