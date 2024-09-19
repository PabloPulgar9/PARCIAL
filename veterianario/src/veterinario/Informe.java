package veterinario;

public class Informe {
    // atributos
    private String salud; 
    private String observacion;
    private Mascota mascota;

    // constructor
    public Informe(String salud, String observacion, Mascota mascota) {
        this.salud = salud;
        this.observacion = observacion;
        this.mascota = mascota;
    }

    // getters y setters
    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Informe [Salud=" + salud + ", Observacion=" + observacion + ", Mascota=" + mascota.getNombre() + "]";
    }
}

