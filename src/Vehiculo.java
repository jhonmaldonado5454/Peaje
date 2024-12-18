// Clase base abstracta Vehiculo
public abstract class Vehiculo {
    protected String placa;

    // Constructor
    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    // Método abstracto que deben implementar las subclases
    public abstract void imprimir();
}

