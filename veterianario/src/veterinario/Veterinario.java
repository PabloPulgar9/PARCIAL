package veterinario;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Veterinario {
    // atributos
    private String nombre;
    private int edad;
    private List<Informe> informes;

    // constructor
    public Veterinario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.informes = new ArrayList<>();
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Informe> getInformes() {
        return informes;
    }

    public void setInformes(List<Informe> informes) {
        this.informes = informes;
    }

    // metodos
    public Informe crearInforme(String salud, String observacion, Mascota mascota) {
        Informe nuevoInforme = new Informe(salud, observacion, mascota);
        informes.add(nuevoInforme);
        return nuevoInforme;
    }

    public void mostrarInformes() {
        if (informes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay informes registrados.");
        } else {
            String mensaje = "Informes de salud:\n";
            for (Informe informe : informes) {
                mensaje += "Salud: " + informe.getSalud() +
                           ", Observacion: " + informe.getObservacion() +
                           ", Mascota: " + informe.getMascota().getNombre() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

}

