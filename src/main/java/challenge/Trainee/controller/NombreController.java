package challenge.Trainee.controller;

import challenge.Trainee.model.Nombre;
import challenge.Trainee.model.ReturnNombres;

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



    //1.a , 1.c

    /*recibo lista de nombres List<Nombre>
    * quizas este /nombre estaria de mas */
    @PostMapping(value = "/nombre",consumes = "application/json")
    public ReturnNombres principal(@RequestBody List<Nombre> nombre){
        List<Nombre> lista = new ArrayList<>();
        lista.addAll(nombre);

        return new ReturnNombres(lista);
    }


}


