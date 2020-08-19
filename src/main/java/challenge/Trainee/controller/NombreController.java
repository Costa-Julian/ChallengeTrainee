package challenge.Trainee.controller;

import challenge.Trainee.model.Nombre;
import challenge.Trainee.repository.NombreRepository;

import challenge.Trainee.service.NombreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import java.util.List;

/*
*siempre tratar que los nombres de url sean coherentes con la entidad
que estoy queriendo manipular esta bien el ejemplo de /nombres
*se tiende a poner las urls en plural /nombres por ejemplo
*Para los retornos en JSON quizas seria conveniente crear una clase
que se llame por ejemplo ReturnNombre y que tenga como atributos
los datos que se pidieron en los distintos puntos
* Los imports no utilizados por lo general se almacenan en memoria cuando se carga
* por primera vez la aplicacion eso consume memoria y esta visto como "mala practica"
* (recomendacion fijate que no queden imports obsoletos en gris como: import challenge.Trainee.service.INombreService;)
* */
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

    /*recibo lista de nombres List<Nombre>
    * quizas este /nombre estaria de mas */
    @PostMapping(value = "/nombre",consumes = "application/json")
    public List<Nombre> principal(@RequestBody List<Nombre> nombre){
        /*no hacia falta guardar en base de datos porque la lista ya te la envia por parametro*/
        nombreService.guardar(nombre);
        List<Nombre> nombres= new ArrayList<>();
        nombres.addAll(nombreFin());
        nombres.addAll(nombreInicio());
        /*la idea es buscar desde la misma lista (Collection) que
        te envian (la busqueda la harias programaticamente y no por query)
        No esta mal pero la performance cambia mucho*/
        return nombres;
    }
    //1.b
    @PostMapping("/cantidad")
    public String cantidad(){
        /*te trae el total de los registros en la base se piden en el
        mismo endpoint /nombre */
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


