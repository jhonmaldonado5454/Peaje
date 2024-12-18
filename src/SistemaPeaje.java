// Clase principal Main
public class SistemaPeaje {
    public static void main(String[] args) {
        // Crear instancia del peaje
        Peaje peaje = new Peaje("Peaje Central", "Loja");

        // Añadir vehículos al peaje
        peaje.añadirVehiculo(new Carro("ABC123"));
        peaje.añadirVehiculo(new Moto("XYZ987"));
        peaje.añadirVehiculo(new Camion("LMN456", 4)); // Camión con 4 ejes
        peaje.añadirVehiculo(new Carro("DEF456"));
        peaje.añadirVehiculo(new Camion("GHI789", 6)); // Camión con 6 ejes

        // Imprimir resumen del peaje
        peaje.imprimir();
    }
}

/*
SistemaPeaje/
│
├── Vehiculo.java
├── Carro.java
├── Moto.java
├── Camion.java
├── Peaje.java
└── SistemaPeaje.java  // Clase principal
*/
