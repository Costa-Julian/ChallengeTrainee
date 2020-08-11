package challenge.Trainee.controller;

import challenge.Trainee.model.Datos;
import challenge.Trainee.repository.DatosRepository;
import challenge.Trainee.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DatosController {
    @Autowired
    public DatosService serviceDatos;
    @Autowired
    public DatosRepository repoDatos;

    @GetMapping("ping")
    public String ping(){
        return "pong";
    }
    @GetMapping("mostrar")
    public List<Datos> mostrarTodo(){
        return serviceDatos.mostrarTodo();
    }
    @GetMapping("dni")
    public String finalDni(){
        return "Primer Dni: " + mostrarDniPrimero() + "Nombre ultima persona: " +
                ultimoNombre();
    }
    @PostMapping(value = "guardar" , consumes = "application/json")
    public List<Datos> guardar(@RequestBody Datos datos){
        serviceDatos.guardarTodo(datos);
        return mostrarTodo();
    }
    public Integer mostrarDni(){
        return repoDatos.findById(0);
    }
    public Integer mostrarDniPrimero(){
        return repoDatos.findTopBy();
    }
    @GetMapping("nombre")
    public String ultimoNombre(){
        return repoDatos.findTopByOrderByIdDesc();
    }
    @GetMapping("borrar")
    public String borrarTodo(){
        serviceDatos.borrarTodo();
        return "Datos borrados";
    }
}
