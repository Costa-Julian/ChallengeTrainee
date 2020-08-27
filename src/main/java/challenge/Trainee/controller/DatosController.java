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


    /* Punto 2*/
    @PostMapping(value = "guardar", consumes = "application/json")
    public RetornoDatos guardar(@RequestBody List<Datos> datos) {
        serviceDatos.guardarTodo(datos);
        RetornoDatos retorno = new RetornoDatos();
        retorno.setUltNombre(mostrarUltimoNombre());
        retorno.setPrimerDni(mostrarDniPrimero());
        retorno.setOrden(ordenLista());

        return retorno;

    }/* 3*/

    @GetMapping("/buscarApellido")
    public List<Datos> perez(@RequestParam(name = "apellido", required = false) String apellido) {
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

