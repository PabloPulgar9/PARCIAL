package bairesrent;

class Propiedad {
    private String ubicacion;
    private double precio;
    private boolean alquilada;
    private String inquilino;

    public Propiedad(String ubicacion, double precio) {
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.alquilada = false;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isAlquilada() {
        return alquilada;
    }

    public void alquilar(String inquilino) {
        this.inquilino = inquilino;
        this.alquilada = true;
    }

    @Override
    public String toString() {
        return "Ubicacion: " + ubicacion + 
               ", Precio por noche: " + precio + 
               ", Alquilada: " + (alquilada ? "Si, Inquilino: " + inquilino : "No");
    }

    
}