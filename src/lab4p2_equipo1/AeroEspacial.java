package lab4p2_equipo1;

import static lab4p2_equipo1.AereoNormal.random;

public class AeroEspacial extends MediosTransporte {
    private String tipoCombustible;
    private boolean esDeCombate;

    public AeroEspacial() {
    }

    public AeroEspacial(String tipoCombustible, boolean esDeCombate) {
        this.tipoCombustible = tipoCombustible;
        this.esDeCombate = esDeCombate;
    }

    public AeroEspacial(String tipoCombustible, boolean esDeCombate, int cantTanque, int kmsTanque, int cantGalones) {
        super(cantTanque, kmsTanque, cantGalones);
        this.tipoCombustible = tipoCombustible;
        this.esDeCombate = esDeCombate;
    }

    public AeroEspacial(String tipoCombustible, boolean esDeCombate, int cantTanque, int kmsTanque, int cantGalones, String nombre, int distancia) {
        super(cantTanque, kmsTanque, cantGalones, nombre, distancia);
        this.tipoCombustible = tipoCombustible;
        this.esDeCombate = esDeCombate;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public boolean isEsDeCombate() {
        return esDeCombate;
    }

    public void setEsDeCombate(boolean esDeCombate) {
        this.esDeCombate = esDeCombate;
    }

    public void viaje(Planetas planeta) {
        double consumo = ((planeta.getDistancia()* 0.32) + (25 + random.nextInt(35) + 3) * 3/2);
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
        return super.toString() + "Aereo espacial:\n" + 
                                  "\nEl tipo de combustible es: " + tipoCombustible + 
                                  "\nEs de combate?" + esDeCombate;
    }
    
    
}
