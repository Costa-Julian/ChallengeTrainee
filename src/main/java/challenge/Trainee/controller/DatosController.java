package challenge.Trainee.controller;

import challenge.Trainee.model.Datos;
import challenge.Trainee.model.Prueba;
import challenge.Trainee.model.RetornoDatos;
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
    public List<Datos> mostrarTodo(@RequestBody List<Datos> datos){
        serviceDatos.guardarTodo(datos);
        /*te falto ordenar por codigo*/
        return serviceDatos.mostrarTodo();
    }

    /* Punto 2.a , 2.b */
    @PostMapping(value = "guardar" , consumes = "application/json")
    public RetornoDatos guardar(@RequestBody List<Datos> datos){
        serviceDatos.guardarTodo(datos);
        RetornoDatos retorno = new RetornoDatos();
        retorno.setUltNombre(mostrarUltimoNombre());
        retorno.setPrimerDni(mostrarDniPrimero());
        retorno.setOrden(ordenLista());

        return retorno;

    }/* 3.1*/
    @GetMapping("perez")
    public List<Datos> perez(){
        /*
        que pasa si quiero buscar personas con otro apellido
        * como podria parametrizar el apellido y que lo tome la base de datos al buscarlo
        *(Tomar en cuenta la mayuscula de la primer letra que se podria hacer)
        * */
        return repoDatos.findByApellido("Perez");
    }
    @GetMapping("borrar")
    public String borrarTodo(){
        serviceDatos.borrarTodo();
        return "Datos borrados";
    }

   public String mostrarUltimoNombre(){
        return repoDatos.findTopByOrderByCodigoDesc();
    }

    public Integer mostrarDniPrimero(){
        return repoDatos.findFirst1By();
    }

    public List<Datos> ordenLista(){ return repoDatos.findByOrderByCodigo();}

    @GetMapping(value = "/test" , produces = "application/json")
    public String pruebaRetornoJSON(){
        return "{\"valor\":10}";
    }
    @GetMapping(value = "test2" ,produces = "application/json")
    public Prueba test2(){
        return new Prueba();
    }
}
