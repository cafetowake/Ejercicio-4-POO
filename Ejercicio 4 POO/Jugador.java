public class Jugador {
    // Atributos privados
    private String nombre;
    private String pais;
    private int faltas;
    private int golesDirectos;
    private int totalLanzamientos;

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
        return 0.0; // Reemplazar con la fórmula adecuada
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getGolesDirectos() {
        return golesDirectos;
    }

    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }
    

    public int getTotalLanzamientos() {
        return totalLanzamientos;
    }

    public void setTotalLanzamientos(int totalLanzamientos) {
        this.totalLanzamientos = totalLanzamientos;
    }
}
