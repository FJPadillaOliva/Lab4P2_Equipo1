package lab4p2_equipo1;

public class Planetas {
    private String nombre;
    private int distancia;

    public Planetas() {
    }

    public Planetas(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Planetas{" + "nombre=" + nombre + ", distancia=" + distancia + '}';
    }
    
    
}
