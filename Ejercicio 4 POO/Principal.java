import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Cuántos jugadores desea registrar? ");
            int numJugadores = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            ArrayList<Jugador> jugadores = new ArrayList<>();

            for (int i = 1; i <= numJugadores; i++) {
                System.out.println("Ingrese los datos del jugador " + i);
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("País: ");
                String pais = scanner.nextLine();
                System.out.print("Faltas: ");
                int faltas = scanner.nextInt();
                System.out.print("Goles directos: ");
                int golesDirectos = scanner.nextInt();
                System.out.print("Total de lanzamientos: ");
                int totalLanzamientos = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                System.out.println("Ingrese los datos específicos del jugador:");
                System.out.print("¿Es portero? (S/N): ");
                char esPortero = scanner.nextLine().charAt(0);

                if (esPortero == 'S' || esPortero == 's') {
                    System.out.print("Paradas efectivas: ");
                    int paradasEfectivas = scanner.nextInt();
                    System.out.print("Goles recibidos: ");
                    int golesRecibidos = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    Portero portero = new Portero(nombre, pais, faltas, golesDirectos, totalLanzamientos, paradasEfectivas, golesRecibidos);
                    jugadores.add(portero);
                } else {
                    System.out.print("Pases: ");
                    int pases = scanner.nextInt();
                    System.out.print("Asistencias efectivas: ");
                    int asistenciasEfectivas = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    Extremo extremo = new Extremo(nombre, pais, faltas, golesDirectos, totalLanzamientos, pases, asistenciasEfectivas);
                    jugadores.add(extremo);
                }
            }

            System.out.println("Jugadores registrados en el campeonato:");
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre() + " - " + jugador.getPais());
            }

            System.out.println("Efectividad de los jugadores:");
            for (Jugador jugador : jugadores) {
                double efectividad = jugador.calcularEfectividad();
                System.out.println(jugador.getNombre() + ": " + efectividad);
            }

            // Calcular los mejores porteros
            ArrayList<Portero> porteros = new ArrayList<>();
            for (Jugador jugador : jugadores) {
                if (jugador instanceof Portero) {
                    porteros.add((Portero) jugador);
                }
            }

            porteros.sort((p1, p2) -> Double.compare(p2.calcularEfectividad(), p1.calcularEfectividad()));

            System.out.println("Mejores porteros:");
            for (int i = 0; i < Math.min(3, porteros.size()); i++) {
                System.out.println(porteros.get(i).getNombre());
            }

            // Calcular la cantidad de extremos con más del 85% de efectividad
            int extremosCon85Mas = 0;
            for (Jugador jugador : jugadores) {
                if (jugador instanceof Extremo && jugador.calcularEfectividad() > 85.0) {
                    extremosCon85Mas++;
                }
            }

            System.out.println("Cantidad de extremos con más de 85% de efectividad: " + extremosCon85Mas);
        }
    }
}
