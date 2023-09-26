public class Jugador {
    // Atributos
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int golesDirectos;
    protected int totalLanzamientos;

    // Constructor
    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }

    // Método para calcular la efectividad (debe ser sobreescrito en las subclases)
    public double calcularEfectividad() {
        // Lógica para calcular la efectividad común a todos los jugadores
        return 0.0; // Reemplazar con la fórmula adecuada
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getFaltas() {
        return faltas;
    }

    public int getGolesDirectos() {
        return golesDirectos;
    }

    public int getTotalLanzamientos() {
        return totalLanzamientos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }

    public void setTotalLanzamientos(int totalLanzamientos) {
        this.totalLanzamientos = totalLanzamientos;
    }
}
