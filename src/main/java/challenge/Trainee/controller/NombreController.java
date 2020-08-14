package challenge.Trainee.controller;

import challenge.Trainee.model.Nombre;
import challenge.Trainee.repository.NombreRepository;
import challenge.Trainee.service.INombreService;
import challenge.Trainee.service.NombreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/nombre")
public class NombreController {
    @Autowired
    public NombreService nombreService;
    @Autowired
    public NombreRepository repoNombre;

    @GetMapping("/mostrar")
    public List<Nombre> mostrarTodo(){
        return nombreService.mostrarTodo();
    }
    //1.a , 1.c
    @PostMapping(value = "/nombre",consumes = "application/json")
    public List<Nombre> principal(@RequestBody Nombre nombre){
        nombreService.guardar(nombre);
        List<Nombre> nombres= new ArrayList<>();
        nombres.addAll(nombreFin());
        nombres.addAll(nombreInicio());
        return nombres;
    }
    //1.b
    @PostMapping("/cantidad")
    public String cantidad(){
        long cantidad = repoNombre.count();
        String resultado = "Cantidad total de registros: " + cantidad;
        return resultado;
    }

    public List<Nombre> nombreInicio(){
        return repoNombre.findByNombreStartingWith("LU");
    }

    public List<Nombre> nombreFin(){
        return repoNombre.findByNombreEndingWith("S");
    }

}


