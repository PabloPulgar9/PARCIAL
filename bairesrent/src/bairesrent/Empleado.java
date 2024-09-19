package bairesrent;

import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String nombre;
    private List<Propiedad> propiedades;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.propiedades = new ArrayList<>(); 
    }

    public void agregarPropiedad(Propiedad propiedad) {
    	propiedades.add(propiedad);
    }

    public List<Propiedad> propiedadesDisponibles() {
        List<Propiedad> disponibles = new ArrayList<>();
        for (Propiedad propiedad : propiedades) {
            if (!propiedad.isAlquilada()) {
                disponibles.add(propiedad);
            }
        }
        return disponibles;
    }

    public List<Propiedad> getPropiedadesDisponibles() {
        return propiedades;
    }

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", Propiedades=" + propiedades + "]";
	}
    
    
}
