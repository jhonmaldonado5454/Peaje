// Subclase Moto
public class Moto extends Vehiculo {
    private int valorPeaje = 1; // Valor fijo para motos ($1)

    // Constructor
    public Moto(String placa) {
        super(placa);
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    public void imprimir() {
        System.out.println("Moto - Placa: " + placa + ", Peaje: $" + valorPeaje);
    }
}
