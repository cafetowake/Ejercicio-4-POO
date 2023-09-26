public class Portero extends Jugador {
    // Atributos adicionales
    /**
     *
     */
    private int paradasEfectivas;
    /**
     *
     */
    private int golesRecibidos;

    // Constructor
    /**
     * @param nombre
     * @param pais
     * @param faltas
     * @param golesDirectos
     * @param totalLanzamientos
     * @param paradasEfectivas
     * @param golesRecibidos
     */
    public Portero(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos,
                   int paradasEfectivas, int golesRecibidos) {
        super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
    }

    // Método para calcular la efectividad (sobreescrito)
    @Override
    public double calcularEfectividad() {
        // Lógica para calcular la efectividad de un portero
        double efectividadParadas = ((paradasEfectivas - golesRecibidos) * 100.0 / (paradasEfectivas + golesRecibidos));
        double efectividadGolesDirectos = (golesDirectos * 100.0 / getTotalLanzamientos());

        // La efectividad de un portero se calcula como el promedio de efectividad en paradas y efectividad en goles directos
        return (efectividadParadas + efectividadGolesDirectos) / 2.0;
    }

    // Getters y setters para atributos adicionales
    /**
     * @return
     */
    public int getParadasEfectivas() {
        return paradasEfectivas;
    }

    /**
     * @param paradasEfectivas
     */
    public void setParadasEfectivas(int paradasEfectivas) {
        this.paradasEfectivas = paradasEfectivas;
    }

    /**
     * @return
     */
    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    /**
     * @param golesRecibidos
     */
    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
}