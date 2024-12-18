// Clase principal Peaje
import java.util.ArrayList;

public class Peaje {
    private String nombre;
    private String departamento;
    private int totalPeaje = 0;
    private int totalCarros = 0;
    private int totalMotos = 0;
    private int totalCamiones = 0;

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>(); // Lista de vehículos

    // Constructor
    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Añadir vehículos y calcular peaje
    public void añadirVehiculo(Vehiculo vehiculo) {
        int valorPeaje = 0;

        if (vehiculo instanceof Carro) {
            valorPeaje = ((Carro) vehiculo).getValorPeaje();
            totalCarros++;
        } else if (vehiculo instanceof Moto) {
            valorPeaje = ((Moto) vehiculo).getValorPeaje();
            totalMotos++;
        } else if (vehiculo instanceof Camion) {
            valorPeaje = ((Camion) vehiculo).getValorPeaje();
            totalCamiones++;
        }

        totalPeaje += valorPeaje; // Actualizar total recolectado
        vehiculos.add(vehiculo);  // Agregar vehículo a la lista
        vehiculo.imprimir();      // Imprimir información del vehículo
    }

    // Imprimir resumen del peaje
    public void imprimir() {
        System.out.println("\nResumen del Peaje:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Total Peaje Recolectado: $" + totalPeaje);
        System.out.println("Total Carros: " + totalCarros);
        System.out.println("Total Motos: " + totalMotos);
        System.out.println("Total Camiones: " + totalCamiones);
    }
}
