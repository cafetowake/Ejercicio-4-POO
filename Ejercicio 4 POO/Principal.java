public class Principal {
    public static void main(String[] args) {
        // Crear instancias de jugadores, porteros y extremos
        Jugador jugador1 = new Jugador("Juan", "España", 2, 10, 20);
        Portero portero1 = new Portero("Carlos", "Alemania", 0, 5, 10, 15, 8);
        Extremo extremo1 = new Extremo("Maria", "Francia", 1, 8, 18, 25, 12);

        // Calcular efectividad de un jugador
        double efectividadJugador1 = jugador1.calcularEfectividad();
        System.out.println("Efectividad de " + jugador1.getNombre() + ": " + efectividadJugador1);

        // Calcular efectividad de un portero
        double efectividadPortero1 = portero1.calcularEfectividad();
        System.out.println("Efectividad de " + portero1.getNombre() + ": " + efectividadPortero1);

        // Calcular efectividad de un extremo
        double efectividadExtremo1 = extremo1.calcularEfectividad();
        System.out.println("Efectividad de " + extremo1.getNombre() + ": " + efectividadExtremo1);
    }
}
