// Subclase Carro
public class Carro extends Vehiculo {
    private int valorPeaje = 2; // Valor fijo para carros ($2)

    // Constructor
    public Carro(String placa) {
        super(placa);
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    public void imprimir() {
        System.out.println("Carro - Placa: " + placa + ", Peaje: $" + valorPeaje);
    }
}
