package challenge.Trainee.model;




import java.util.ArrayList;
import java.util.*;

import java.util.stream.Collectors;


public class ReturnNombres {

    private List<String> comNombres = null;
    private long cantidadNombres;
    private List<String> finNombres = null;
  //  public List<Nombre> nombres;


    public ReturnNombres(List<String> nombres){
        this.comNombres = inicio(nombres);
        this.cantidadNombres = nombres.size();
        this.finNombres = fin(nombres);
    }

    public List<String> getComNombres() {
        return comNombres;
    }

    public void setComNombres(List<String> comNombres) {
        this.comNombres = comNombres;
    }

    public long getCantidadNombres() {
        return cantidadNombres;
    }

    public void setCantidadNombres(long cantidadNombres) {
        this.cantidadNombres = cantidadNombres;
    }

    public List<String> getFinNombres() {
        return finNombres;
    }

    public void setFinNombres(List<String> finNombres) {
        this.finNombres = finNombres;
    }

    @Override
    public String toString() {
        return "comNombres=" + comNombres +
                ", cantidadNombres=" + cantidadNombres +
                ", finNombres=" + finNombres ;
    }

    public String comienzo() {
        List<Nombre> lista = new ArrayList<>();
    return null;
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
