package challenge.Trainee.controller;

import challenge.Trainee.model.Datos;
import challenge.Trainee.repository.DatosRepository;
import challenge.Trainee.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DatosController {
    @Autowired
    public DatosService serviceDatos;
    @Autowired
    public DatosRepository repoDatos;
    /*Punto 2.c */
    @PostMapping(value = "mostrar", consumes = "application/json" )
    public List<Datos> mostrarTodo(@RequestBody Datos datos){
        serviceDatos.guardarTodo(datos);
        return serviceDatos.mostrarTodo();
    }

    /* Punto 2.a , 2.b */
    @PostMapping(value = "guardar" , consumes = "application/json")
    public String guardar(@RequestBody Datos datos){
        serviceDatos.guardarTodo(datos);
        return "Primer Dni: " + mostrarDniPrimero() + "\nUltimo nombre : " + mostrarUltimoNombre();

    }/* 3.1*/
    @GetMapping("perez")
    public List<Datos> perez(){
        return repoDatos.findByApellido("Perez");
    }
    @GetMapping("borrar")
    public String borrarTodo(){
        serviceDatos.borrarTodo();
        return "Datos borrados";
    }

    public String mostrarUltimoNombre(){
        return repoDatos.findTopByOrderByCodigo();
    }

    public Integer mostrarDniPrimero(){
        return repoDatos.findFirst1By();
    }

}
