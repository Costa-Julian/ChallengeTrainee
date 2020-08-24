package challenge.Trainee.controller;


import challenge.Trainee.model.ReturnNombres;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController

public class NombreController {

    @PostMapping(value = "/nombre",consumes = "application/json")
    public ReturnNombres principal(@RequestBody List<String> nombre){
        List<String> lista = new ArrayList<>();
        lista.addAll(nombre);
        return new ReturnNombres(lista);
    }


}


