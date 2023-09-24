public class Extremo extends Jugador {
    // Atributos adicionales
    private int pases;
    private int asistenciasEfectivas;

    // Constructor
    public Extremo(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos,
                   int pases, int asistenciasEfectivas) {
        super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
        this.pases = pases;
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    // Método para calcular la efectividad (sobreescrito)
    @Override
    public double calcularEfectividad() {
        // Lógica para calcular la efectividad de un extremo
        double efectividadPases = ((pases + asistenciasEfectivas - getFaltas()) * 100.0 / (pases + asistenciasEfectivas + getFaltas()));
        double efectividadGolesDirectos = (getGolesDirectos() * 100.0 / getTotalLanzamientos());

        // La efectividad de un extremo se calcula como el promedio de efectividad en pases y efectividad en goles directos
        return (efectividadPases + efectividadGolesDirectos) / 2.0;
    }

    // Getters y setters para atributos adicionales
    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getAsistenciasEfectivas() {
        return asistenciasEfectivas;
    }

    public void setAsistenciasEfectivas(int asistenciasEfectivas) {
        this.asistenciasEfectivas = asistenciasEfectivas;
    }
}
