package challenge.Trainee.model;

import challenge.Trainee.repository.DatosRepository;

import java.util.List;

public class RetornoDatos {
    private long primerDni;
    private String ultNombre;
    private List<Datos> orden;

    public DatosRepository repoDatos;

    public RetornoDatos(List<Datos> datos){
        this.primerDni = mostrarDniPrimero();
        this.ultNombre = "preba";
        this.orden = null;

    }

    public long getPrimerDni() {
        return primerDni;
    }

    public void setPrimerDni(long primerDni) {
        this.primerDni = primerDni;
    }

    public String getUltNombre() {
        return ultNombre;
    }

    public void setUltNombre(String ultNombre) {
        this.ultNombre = ultNombre;
    }

    public List getOrden() {
        return orden;
    }

    public void setOrden(List orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "RetornoDatos{" +
                "primerDni=" + primerDni +
                ", ultNombre='" + ultNombre + '\'' +
                ", orden=" + orden +
                '}';
    }

    /*public List<Datos> orden(List<Datos> Datos){
        return repoDatos.findTop15By();
    }*/
    public Integer mostrarDniPrimero(){
        return repoDatos.findFirst1By();
    }
}

