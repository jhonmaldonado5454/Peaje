// Subclase Camion
public class Camion extends Vehiculo {
    private int numeroEjes;
    private int valorPeajeEje = 1; // Valor por eje ($1)

    // Constructor
    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public int getValorPeaje() {
        return numeroEjes * valorPeajeEje; // Calcula el peaje según ejes
    }

    public void imprimir() {
        System.out.println("Camión - Placa: " + placa + ", Ejes: " + numeroEjes + ", Peaje: $" + getValorPeaje());
    }
}
