package challenge.Trainee.controller;

import challenge.Trainee.model.Datos;
import challenge.Trainee.model.RetornoDatos;
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

    @GetMapping ("ping")
    public String ping (String ping){
        return "pong";
    }
    /* Punto 2*/
    /*Este era el punto 3
    * Le pondria el nombre de lo que estaria tratando de guardar tipo si estoy
    * tratando de guardar una persona pondria /personas y el POST ya indicaria
    * que se intenta guardar.
    * un GET seria para obtenerla con un id por ejemplo (no es necesario en este ejercicio)
    * y un PUT para modificarla (no es necesario en este ejercicio)
    * sin retorno era este metodo
    * */
    @PostMapping(value = "guardar", consumes = "application/json")
    public RetornoDatos persona(@RequestBody List<Datos> datos) {
        serviceDatos.guardarTodo(datos);
        RetornoDatos retorno = new RetornoDatos();
        retorno.setUltNombre(mostrarUltimoNombre());
        retorno.setPrimerDni(mostrarDniPrimero());
        retorno.setOrden(ordenLista());
        return retorno;

    }/* 3*/
    /*este punto era el 3.1*/
    @GetMapping("/buscarApellido")
    /*otro nombre le hubieses puesto al metodo jajaja*/
    public List<Datos> buscar(@RequestParam(name = "apellido", required = false) String apellido) {
        return repoDatos.findByApellido(apellido);
    }

    @GetMapping("borrar")
    public String borrarTodo() {
        serviceDatos.borrarTodo();
        return "Datos borrados";
    }

    public String mostrarUltimoNombre() {
        return repoDatos.findTopByOrderByCodigoDesc();
    }

    public Integer mostrarDniPrimero() {
        return repoDatos.findFirst1By();
    }

    public List<Datos> ordenLista() {
        return repoDatos.findByOrderByCodigo();
    }
}

