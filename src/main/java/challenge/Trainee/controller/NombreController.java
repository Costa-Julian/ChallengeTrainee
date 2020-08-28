package challenge.Trainee.controller;


import challenge.Trainee.model.ReturnNombres;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController

public class NombreController {

    @PostMapping(value = "/nombres",consumes = "application/json")
    public ReturnNombres principal(@RequestBody List<String> nombre){
        /*Esta lista seria innecesaria ya que recibe una lista de strings de la misma manera que se envia al servicio*/
        List<String> lista = new ArrayList<>();
        lista.addAll(nombre);
        /*************************************/
        /*me gusta que hagas el return new ReturnNombres()
        de esta manera seria una sola linea de codigo*/
        return new ReturnNombres(nombre);
    }


}


