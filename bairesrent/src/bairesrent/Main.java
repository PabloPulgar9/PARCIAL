package bairesrent;

import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Maurito");

        String[] opciones = { "Agregar propiedad", "Consultar propiedades disponibles", "Alquilar propiedad", "Salir" };
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "BairesRent",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0: // agregar propiedad
                    String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación de la propiedad:");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del alquiler:"));
                    Propiedad nuevaPropiedad = new Propiedad(ubicacion, precio);
                    empleado.agregarPropiedad(nuevaPropiedad);
                    JOptionPane.showMessageDialog(null, "Propiedad agregada exitosamente.");
                    break;

                case 1: // consultar propiedades disponibles
                    List<Propiedad> disponibles = empleado.propiedadesDisponibles();
                    if (disponibles.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay propiedades disponibles.");
                    } else {
                        String mensaje = "Propiedades disponibles:\n";
                        for (Propiedad propiedad : disponibles) {
                            mensaje += propiedad.toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, mensaje);
                    }
                    break;

                case 2: // alquilar propiedad
                    List<Propiedad> disponiblesParaAlquilar = empleado.propiedadesDisponibles();
                    if (disponiblesParaAlquilar.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay propiedades disponibles para alquilar.");
                    } else {
                        String opcionesPropiedades = "Seleccione una propiedad:\n";
                        for (int i = 0; i < disponiblesParaAlquilar.size(); i++) {
                            opcionesPropiedades += (i + 1) + ": " + disponiblesParaAlquilar.get(i).getUbicacion() + "\n";
                        }

                        String seleccion = JOptionPane.showInputDialog(opcionesPropiedades);
                        int indiceSeleccionado = Integer.parseInt(seleccion) - 1; 

                        if (indiceSeleccionado >= 0 && indiceSeleccionado < disponiblesParaAlquilar.size()) {
                            String inquilino = JOptionPane.showInputDialog("Ingrese el nombre del inquilino:");
                            disponiblesParaAlquilar.get(indiceSeleccionado).alquilar(inquilino);
                            JOptionPane.showMessageDialog(null, "Propiedad alquilada a: " + inquilino);
                        } else {
                            JOptionPane.showMessageDialog(null, "Selección invalida.");
                        }
                    }
                    break;

                case 3: // salir
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 3);
    }
}