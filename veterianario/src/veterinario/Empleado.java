package veterinario;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Empleado {
    // atributos
    private String nombre;
    private List<Turno> turnos;
    private List<Mascota> mascotas; 

    // constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.turnos = new ArrayList<>();
        this.mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    // metodo para agregar una mascota
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    // metodo para crear un turno
    public Turno crearTurno(Mascota mascota, Veterinario veterinario, int fecha, String motivo) {
        Turno nuevoTurno = new Turno(fecha, motivo, veterinario, mascota);
        turnos.add(nuevoTurno);
        return nuevoTurno;
    }

    public void mostrarTurnos() {
        if (turnos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay turnos registrados.");
        } else {
            String mensaje = "Turnos registrados:\n";
            for (Turno turno : turnos) {
                mensaje += "Fecha: " + turno.getFecha() +
                           ", Motivo: " + turno.getMotivo() +
                           ", Mascota: " + turno.getMascota().getNombre() +
                           ", Veterinario: " + turno.getVeterinario().getNombre() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }



    // metodo para obtener nombres de mascotas
    public String[] obtenerNombresMascotas() {
        String[] nombres = new String[mascotas.size()];
        for (int i = 0; i < mascotas.size(); i++) {
            nombres[i] = mascotas.get(i).getNombre();
        }
        return nombres;
    }

    // metodo para obtener mascota por nombre
    public Mascota obtenerMascotaPorNombre(String nombre) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                return mascota;
            }
        }
        return null; // si no se encuentra la mascota
    }
}
