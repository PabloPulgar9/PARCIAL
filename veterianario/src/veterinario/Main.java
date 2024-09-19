package veterinario;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		Veterinario veterinario = new Veterinario("Mauro", 29);
		Empleado empleado = new Empleado("Fabricio");

		//opciones
		String[] opciones = { "Agregar mascota", "Crear turno", "Ver turnos", "Registrar informacion de salud",
				"Seguimiento de salud", "Salir" };
		int opcion;

		do {
			//menuu
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Veterinaria Amigos Peludos",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

			switch (opcion) {
			case 0: // mascota
				String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota:");
				String raza = JOptionPane.showInputDialog("Ingrese la raza de la mascota:");
				String especie = JOptionPane.showInputDialog("Ingrese la especie de la mascota:");
				int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota:"));
				Mascota nuevaMascota = new Mascota(nombre, raza, especie, edad);
				empleado.agregarMascota(nuevaMascota);
				JOptionPane.showMessageDialog(null, "Mascota agregada: " + nuevaMascota);
				break;

			case 1: // agregar turno
				String[] nombresMascotas = empleado.obtenerNombresMascotas();
				if (nombresMascotas.length > 0) {
					String mascotaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una mascota:",
							"Crear Turno", JOptionPane.QUESTION_MESSAGE, null, nombresMascotas, nombresMascotas[0]);
					Mascota mascotaTurno = empleado.obtenerMascotaPorNombre(mascotaSeleccionada);
					int fecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha del turno (Año mes dia):"));
					String motivo = JOptionPane.showInputDialog("Ingrese el motivo del turno:");
					Turno nuevoTurno = empleado.crearTurno(mascotaTurno, veterinario, fecha, motivo);
					JOptionPane.showMessageDialog(null, "Turno creado:\n" + nuevoTurno);
				} else {
					JOptionPane.showMessageDialog(null, "No hay mascotas disponibles para crear un turno.");
				}
				break;

			case 2: // ver turnos
				empleado.mostrarTurnos();
				break;

			case 3: // registrar información de salud
				String[] nombresMascotasSalud = empleado.obtenerNombresMascotas();
				if (nombresMascotasSalud.length > 0) {
					String mascotaSeleccionadaSalud = (String) JOptionPane.showInputDialog(null,
							"Seleccione una mascota:", "Registrar Información de Salud", JOptionPane.QUESTION_MESSAGE,
							null, nombresMascotasSalud, nombresMascotasSalud[0]);
					Mascota mascotaSalud = empleado.obtenerMascotaPorNombre(mascotaSeleccionadaSalud);
					String salud = JOptionPane.showInputDialog("Ingrese el estado de salud de la mascota:");
					String observacion = JOptionPane.showInputDialog("Anote alguna observacion:");
					veterinario.crearInforme(salud, observacion, mascotaSalud);
					JOptionPane.showMessageDialog(null, "Informe creado para " + mascotaSalud.getNombre());
				} else {
					JOptionPane.showMessageDialog(null,
							"No hay mascotas disponibles para registrar informacion de salud.");
				}
				break;

			case 4: // seguimiento de salud
				veterinario.mostrarInformes();
				break;

			case 5: // Sair
				JOptionPane.showMessageDialog(null, "Saliendo...");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opción no valida.");
				break;
			}
		} while (opcion != 5);
	}
}
