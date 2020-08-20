package challenge.Trainee.model;




import java.util.ArrayList;
import java.util.List;

public class ReturnNombres {

    private String comNombres = null;
    private long cantidadNombres;
    private String finNombres = null;
  //  public List<Nombre> nombres;


    public ReturnNombres(List<Nombre> nombres){
        this.comNombres = comNombres;
        this.cantidadNombres = nombres.size();
        this.finNombres = finNombres;
    }

    public String getComNombres() {
        return comNombres;
    }

    public void setComNombres(String comNombres) {
        this.comNombres = comNombres;
    }

    public long getCantidadNombres() {
        return cantidadNombres;
    }

    public void setCantidadNombres(long cantidadNombres) {
        this.cantidadNombres = cantidadNombres;
    }

    public String getFinNombres() {
        return finNombres;
    }

    public void setFinNombres(String finNombres) {
        this.finNombres = finNombres;
    }

    @Override
    public String toString() {
        return "ReturnNombres{" +
                "comNombres='" + comNombres + '\'' +
                ", cantidadNombres=" + cantidadNombres +
                ", finNombres='" + finNombres + '\'' +
                '}';
    }

    public String comienzo() {
        List<Nombre> lista = new ArrayList<>();
    return null;
    }

    public long contador(List nombres){
        return nombres.size();
    }
}
