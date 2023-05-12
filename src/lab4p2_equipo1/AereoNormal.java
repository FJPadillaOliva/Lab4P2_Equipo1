package lab4p2_equipo1;

import java.util.Random;

public class AereoNormal extends MediosTransporte {
    static Random random = new Random();
    private int cantMaxPasajeros;
    private int longitudTotal;
    private int cantMotores;

    public AereoNormal() {
        super();
    }

    public AereoNormal(int cantMaxPasajeros, int longitudTotal, int cantMotores) {
        this.cantMaxPasajeros = cantMaxPasajeros;
        this.longitudTotal = longitudTotal;
        this.cantMotores = cantMotores;
    }

    public AereoNormal(int cantMaxPasajeros, int longitudTotal, int cantMotores, int cantTanque, int kmsTanque) {
        super(cantTanque, kmsTanque);
        this.cantMaxPasajeros = cantMaxPasajeros;
        this.longitudTotal = longitudTotal;
        this.cantMotores = cantMotores;
    }

    public int getCantMaxPasajeros() {
        return cantMaxPasajeros;
    }

    public void setCantMaxPasajeros(int cantMaxPasajeros) {
        this.cantMaxPasajeros = cantMaxPasajeros;
    }

    public int getLongitudTotal() {
        return longitudTotal;
    }

    public void setLongitudTotal(int longitudTotal) {
        this.longitudTotal = longitudTotal;
    }

    public int getCantMotores() {
        return cantMotores;
    }

    public void setCantMotores(int cantMotores) {
        this.cantMotores = cantMotores;
    }
    
    public void viaje(Planetas planeta) {
        if (this.cantTanque >= kmsTanque && this.primatesAsignados.isEmpty()) {
            for (Primates primatesAsignados : primatesAsignados) {
                double consumo = (planeta.getDistancia()* 0.15) + (25 + random.nextInt(100));
                primatesAsignados.getCantComida();
            }
        } else {
            System.out.println("No se puede realizar el viaje ");
        }
        
    }
}