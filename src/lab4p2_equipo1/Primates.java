package lab4p2_equipo1;

public class Primates extends SeresVivos {
    MediosTransporte transporteAsignado;
    private double cantComida;
    private double cantComidaKm;
    private String lugarNacimiento;

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
        return "Primates{" + "transporteAsignado=" + transporteAsignado + ", cantComida=" + cantComida + ", cantComidaKm=" + cantComidaKm + ", lugarNacimiento=" + lugarNacimiento + '}';
    }
    
    
    
}
