package lab4p2_equipo1;

public class Primates extends SeresVivos {
    MediosTransporte transporteAsignado;
    protected double cantComida;
    protected double cantComidaKm;
    protected String lugarNacimiento;

    public Primates() {
    }

    public Primates(MediosTransporte transporteAsignado, double cantComida, double cantComidaKm, String lugarNacimiento) {
        this.transporteAsignado = transporteAsignado;
        this.cantComida = cantComida;
        this.cantComidaKm = cantComidaKm;
        this.lugarNacimiento = lugarNacimiento;
    }

    public Primates(MediosTransporte transporteAsignado, double cantComida, double cantComidaKm, String lugarNacimiento, String nombre, String grupoSanguineo, String sexo, double altura, double peso) {
        super(nombre, grupoSanguineo, sexo, altura, peso);
        this.transporteAsignado = transporteAsignado;
        this.cantComida = cantComida;
        this.cantComidaKm = cantComidaKm;
        this.lugarNacimiento = lugarNacimiento;
    }

    public MediosTransporte getTransporteAsignado() {
        return transporteAsignado;
    }

    public void setTransporteAsignado(MediosTransporte transporteAsignado) {
        this.transporteAsignado = transporteAsignado;
    }

    public double getCantComida() {
        return cantComida;
    }

    public void setCantComida(double cantComida) {
        this.cantComida = cantComida;
    }

    public double getCantComidaKm() {
        return cantComidaKm;
    }

    public void setCantComidaKm(double cantComidaKm) {
        this.cantComidaKm = cantComidaKm;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Primates:\n" + 
                                  "\nTransporte asignado al primate: " + transporteAsignado + 
                                  "\nCantidad de comida: " + cantComida + 
                                  "\nCantidad de comida que come por KM: " + cantComidaKm + 
                                  "\nLugar de nacimiento de los primates: " + lugarNacimiento;
    }
    
    
    
}
