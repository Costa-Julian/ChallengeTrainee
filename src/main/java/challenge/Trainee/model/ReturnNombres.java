package challenge.Trainee.model;




import java.util.ArrayList;
import java.util.*;

import java.util.stream.Collectors;


public class ReturnNombres {

    private List<String> comienzosConLU ;
    private long cantidadNombres;
    private List<String> terminadosEnS ;


  /*la manera de resolverlo esta perfecto pero los metodos tenian que estar
  ubicados en el servicio*/
    public ReturnNombres(List<String> nombres){
        this.comienzosConLU = inicio(nombres);
        this.cantidadNombres = nombres.size();
        this.terminadosEnS = fin(nombres);
    }


    public List<String> getComienzosConLU() {
        return comienzosConLU;
    }

    public void setComienzosConLU(List<String> comienzosConLU) {
        this.comienzosConLU = comienzosConLU;
    }

    public long getCantidadNombres() {
        return cantidadNombres;
    }

    public void setCantidadNombres(long cantidadNombres) {
        this.cantidadNombres = cantidadNombres;
    }

    public List<String> getTerminadosEnS() {
        return terminadosEnS;
    }

    public void setTerminadosEnS(List<String> terminadosEnS) {
        this.terminadosEnS = terminadosEnS;
    }

    @Override
    public String toString() {
        return "Comenzados con Lu=" + comienzosConLU +
                ", cantidadNombres=" + cantidadNombres +
                ", Terminados en S=" + terminadosEnS ;
    }


    public long contador(List nombres){
        return nombres.size();
    }

  public List<String> inicio(List<String> nombres){
            return (List<String>) nombres.stream()
                    .filter( parametro ->((String)parametro)
                    .startsWith("LU")).collect(Collectors.toList());
  }
  public List<String> fin (List<String> nombres){
        return (List<String>) nombres.stream()
                .filter(parametro -> ((String)parametro).endsWith("S"))
                .collect(Collectors.toList());
  }
}
