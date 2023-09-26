public class Extremo extends Jugador {
    // Atributos adicionales
    /**
     *
     */
    private int pases;
    /**
     *
     */
    private int asistenciasEfectivas;

    // Constructor
    /**
     * @param nombre
     * @param pais
     * @param faltas
     * @param golesDirectos
     * @param totalLanzamientos
     * @param pases
     * @param asistenciasEfectivas
     */
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
        double efectividadPasesAsistencias = ((pases + asistenciasEfectivas - getFaltas()) * 100.0
                / (pases + asistenciasEfectivas + getFaltas()));
        double efectividadGolesDirectos = (getGolesDirectos() * 100.0 / getTotalLanzamientos());

        // La efectividad de un extremo se calcula como el promedio de efectividad en pases/asistencias y efectividad en goles directos
        return (efectividadPasesAsistencias + efectividadGolesDirectos) / 2.0;
    }

    // Getters y setters para atributos adicionales
    /**
     * @return
     */
    public int getPases() {
        return pases;
    }

    /**
     * @param pases
     */
    public void setPases(int pases) {
        this.pases = pases;
    }

    /**
     * @return
     */
    public int getAsistenciasEfectivas() {
        return asistenciasEfectivas;
    }

    /**
     * @param asistenciasEfectivas
     */
    public void setAsistenciasEfectivas(int asistenciasEfectivas) {
        this.asistenciasEfectivas = asistenciasEfectivas;
    }
}