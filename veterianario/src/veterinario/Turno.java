package veterinario;

public class Turno {
    // ctributos
    private int fecha; // formato año-mes-dia
    private String motivo;
    private Veterinario veterinario;
    private Mascota mascota;

    // constructor
    public Turno(int fecha, String motivo, Veterinario veterinario, Mascota mascota) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.veterinario = veterinario;
        this.mascota = mascota;
    }

    // getters y setters
    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Turno [Fecha=" + fecha + ", Motivo=" + motivo + ", Veterinario=" + veterinario.getNombre() + 
               ", Mascota=" + mascota.getNombre() + "]";
    }
}

