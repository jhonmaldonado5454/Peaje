# Peaje
Programa que modela un sistema de peaje, utilizando Java
# Sistema de Peaje

## Descripción
Este proyecto modela un sistema de peaje que calcula el valor del peaje recolectado según el tipo de vehículo que pasa por una estación.  
El sistema está desarrollado en **Java** aplicando principios de programación orientada a objetos (POO), como **herencia** y **polimorfismo**.

---

## Funcionamiento del Sistema
1. **Tipos de vehículos:**
   - **Carro**: paga un peaje fijo de $2.
   - **Moto**: paga un peaje fijo de $1.
   - **Camión**: paga $1 por cada eje.

2. **Cálculo del total:**
   - El sistema calcula y acumula el peaje recolectado de cada vehículo.
   - Se lleva un conteo del número de carros, motos y camiones que pasan por la estación.

3. **Resumen final:**
   - Lista todos los vehículos que pasaron por el peaje junto con su información (placa, tipo y valor del peaje).
   - Imprime el total recaudado y un resumen general.

---

## Estructura del Proyecto
El proyecto está organizado en las siguientes clases:

```
SistemaPeaje/
│
├── Vehiculo.java      // Clase base para todos los vehículos
├── Carro.java         // Subclase para carros
├── Moto.java          // Subclase para motos
├── Camion.java        // Subclase para camiones
├── Peaje.java         // Clase que gestiona el cálculo del peaje
└── SistemaPeaje.java  // Clase principal (Main) para ejecutar el programa
```

---

## Ejemplo de Ejecución
Al ejecutar el programa, el sistema imprimirá la información de los vehículos y un resumen:

```
Carro - Placa: ABC123, Peaje: $2
Moto - Placa: XYZ987, Peaje: $1
Camión - Placa: LMN456, Ejes: 4, Peaje: $4
Carro - Placa: DEF456, Peaje: $2
Camión - Placa: GHI789, Ejes: 6, Peaje: $6

Resumen del Peaje:
Nombre: Peaje Central
Departamento: Loja
Total Peaje Recolectado: $15
Total Carros: 2
Total Motos: 1
Total Camiones: 2
```

---

## Requisitos
- **Java Development Kit (JDK)** versión 8 o superior.
- Editor de código o IDE (como IntelliJ, Eclipse o VS Code).

---

## Cómo Ejecutar el Programa
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/sistema-peaje.git
   cd sistema-peaje
   ```

2. Compila los archivos `.java`:
   ```bash
   javac *.java
   ```

3. Ejecuta la clase principal:
   ```bash
   java SistemaPeaje
   ```

---

## Licencia
Este proyecto está bajo la licencia **MIT**. Siéntete libre de utilizarlo y modificarlo.

---

## Autor
Desarrollado por [Tu Nombre].

