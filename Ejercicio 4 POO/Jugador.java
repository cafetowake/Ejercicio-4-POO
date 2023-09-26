public class Jugador {
    // Atributos
    /**
     *
     */
    protected String nombre;
    /**
     *
     */
    protected String pais;
    /**
     *
     */
    protected int faltas;
    /**
     *
     */
    protected int golesDirectos;
    /**
     *
     */
    protected int totalLanzamientos;

    // Constructor
    /**
     * @param nombre
     * @param pais
     * @param faltas
     * @param golesDirectos
     * @param totalLanzamientos
     */
    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }

    // Método para calcular la efectividad (debe ser sobreescrito en las subclases)
    /**
     * @return
     */
    public double calcularEfectividad() {
        // Lógica para calcular la efectividad común a todos los jugadores
        return 0.0; // Reemplazar con la fórmula adecuada
    }

    // Getters y setters
    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return
     */
    public String getPais() {
        return pais;
    }

    /**
     * @return
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @return
     */
    public int getGolesDirectos() {
        return golesDirectos;
    }

    /**
     * @return
     */
    public int getTotalLanzamientos() {
        return totalLanzamientos;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @param faltas
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    /**
     * @param golesDirectos
     */
    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }

    /**
     * @param totalLanzamientos
     */
    public void setTotalLanzamientos(int totalLanzamientos) {
        this.totalLanzamientos = totalLanzamientos;
    }
}
