package challenge.Trainee.model;

import challenge.Trainee.repository.DatosRepository;

import java.util.List;

public class RetornoDatos{
    private Integer primerDni;
    private String ultNombre;
    private List<Datos> orden;

    public RetornoDatos(){}

    public RetornoDatos(Integer primerDni, String ultNombre, List<Datos> orden){
        this.primerDni = primerDni;
        this.ultNombre = ultNombre;
        this.orden = orden;

    }

    public long getPrimerDni() {
        return primerDni;
    }

    public void setPrimerDni(Integer primerDni) {
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


}

