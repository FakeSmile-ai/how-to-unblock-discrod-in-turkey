import java.util.Scanner;

public class Pista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("bienvenido al menu para calcular la velocidad promedio");
            System.out.println("                    de vehiculos      ");
            System.out.println("----------------------------------------------------------");
            System.out.println("1.Ingrese Cantidad de Vehiculos");
            System.out.println("2. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Pista();
                    break;
                case 2:
                    System.out.println("Cerrando el programa");
                    break;
                default:
                    System.out.println("No ingreso ninguna opc correcta");
                    break;
            }
        } while (opcion != 2);
    }

    public static void Pista() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de vehículos: ");
        int numeroVehiculos = scanner.nextInt();

        for (int vehiculo = 1; vehiculo <= numeroVehiculos; vehiculo++) {
            System.out.println("Vehículo " + vehiculo);
            System.out.print("Ingrese el número de vueltas recorridas: ");
            int numeroVueltas = scanner.nextInt();

            double tiempoTotal = 0;
            for (int i = 1; i <= numeroVueltas; i++) {
                System.out.print("Ingrese el tiempo (minutos) de la vuelta " + i + ": ");
                double tiempoVuelta = scanner.nextDouble();
                tiempoTotal += tiempoVuelta;
            }

            System.out.print("Ingrese la distancia total recorrida (en metros): ");
            double distanciaTotal = scanner.nextDouble();

            // Convertir tiempoTotal de minutos a segundos
            tiempoTotal *= 60;

            double velocidadPromedio = distanciaTotal / tiempoTotal;
            System.out.println(
                    "La velocidad promedio del vehículo " + vehiculo + " es: " + velocidadPromedio + " metros/segundo");
            System.out.println();
        }
    }
}
