package veterinario;

public class Mascota {
    // atributos
    private String nombre;
    private String raza;
    private String especie;
    private int edad;

    // constructor
    public Mascota(String nombre, String raza, String especie, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.edad = edad;
    }

    // getters y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota [Nombre=" + nombre + ", Raza=" + raza + ", Especie=" + especie + ", Edad=" + edad + "]";
    }
}
