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

    public AeroEspacial(String tipoCombustible, boolean esDeCombate, int cantTanque, int kmsTanque) {
        super(cantTanque, kmsTanque);
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

    @Override
    public String toString() {
        return "AeroEspacial{" + "tipoCombustible=" + tipoCombustible + ", esDeCombate=" + esDeCombate + '}';
    }  

    
    public void viaje(Planetas planeta) {
        if (this.cantTanque >= kmsTanque && this.primatesAsignados.isEmpty()) {
            for (Primates primatesAsignados : primatesAsignados) {
                double consumo = ((planeta.getDistancia()* 0.32) + (25 + random.nextInt(35) + 3) * 3/2);
                primatesAsignados.getCantComida();
            }
        } else {
            System.out.println("No se puede realizar el viaje ");
        }
        
    }
}
