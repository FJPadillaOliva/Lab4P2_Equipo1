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

    public AereoNormal(int cantMaxPasajeros, int longitudTotal, int cantMotores, int cantTanque, int kmsTanque, int cantGalones) {
        super(cantTanque, kmsTanque, cantGalones);
        this.cantMaxPasajeros = cantMaxPasajeros;
        this.longitudTotal = longitudTotal;
        this.cantMotores = cantMotores;
    }

    public AereoNormal(int cantMaxPasajeros, int longitudTotal, int cantMotores, int cantTanque, int kmsTanque, int cantGalones, String nombre, int distancia) {
        super(cantTanque, kmsTanque, cantGalones, nombre, distancia);
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
        
        double consumo = (planeta.getDistancia()* 0.15) + (25 + random.nextInt(100));
        if (this.cantTanque >= cantGalones && this.primatesAsignados.isEmpty()) {
            for (Primates primatesAsignados : primatesAsignados) {
                if (primatesAsignados.getCantComida() >= primatesAsignados.getCantComidaKm() * planeta.getDistancia()) {
                    int comida = (int) ((primatesAsignados.getCantComida()) - (primatesAsignados.getCantComidaKm()));
                    primatesAsignados.setCantComida(comida);
                    cantGalones = (int) (cantGalones - consumo);
                } else {
                    System.out.println("los monos imbeciles no tiene comida, no se puede viajar");
                }  
            }
        } else {
            System.out.println("No se puede realizar el viaje ");
        }   
    }

    @Override
    public String toString() {
        return super.toString() + "Aereo normal:\n" + 
                                  "\nCantidad maxima de pasajeros: " + cantMaxPasajeros + 
                                  "\nLongitud total: " + longitudTotal + 
                                  "\nCantidad de motores: " + cantMotores;
    }
    
    
}