public class Portero extends Jugador {
    // Atributos adicionales
    private int paradasEfectivas;
    private int golesRecibidos;

    // Constructor
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
    public int getParadasEfectivas() {
        return paradasEfectivas;
    }

    public void setParadasEfectivas(int paradasEfectivas) {
        this.paradasEfectivas = paradasEfectivas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
}