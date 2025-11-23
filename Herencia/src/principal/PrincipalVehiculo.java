package principal;

import modelo.Vehiculo;
import modelo.Bicicleta;
import modelo.Coche;
import modelo.Patinete;

public class PruncipalV {
    public static void main(String[] args) {

        Vehiculo bici = new Bicicleta("Orbea", "MX30", 2.5, "Disco");
        Vehiculo coche = new Coche("Tesla", "Model 3", 15.0, 4, true);
        Vehiculo patinete = new Patinete("Xiaomi", "Mi Scooter", 5.0, 30);

        int horas = 3;

        System.out.println("=== Información de los Vehículos ===");
        System.out.println(bici.descripcion());
        System.out.println("Precio por " + horas + "h: " + bici.calcularPrecioAlquiler(horas) + "€");

        System.out.println("\n" + coche.descripcion());
        System.out.println("Precio por " + horas + "h: " + coche.calcularPrecioAlquiler(horas) + "€");

        System.out.println("\n" + patinete.descripcion());
        System.out.println("Precio por " + horas + "h: " + patinete.calcularPrecioAlquiler(horas) + "€");
    }
}