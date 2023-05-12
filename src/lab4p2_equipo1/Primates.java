package lab4p2_equipo1;

public class Primates extends SeresVivos {
    MediosTransporte transporteAsignado;
    private double cantComida;

    public Primates() {
    }

    public Primates(MediosTransporte transporteAsignado, double cantComida) {
        this.transporteAsignado = transporteAsignado;
        this.cantComida = cantComida;
    }

    public Primates(MediosTransporte transporteAsignado, double cantComida, String nombre, String grupoSanguineo, String sexo, double altura, double peso) {
        super(nombre, grupoSanguineo, sexo, altura, peso);
        this.transporteAsignado = transporteAsignado;
        this.cantComida = cantComida;
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

    @Override
    public String toString() {
        return "Primates{" + "transporteAsignado=" + transporteAsignado + ", cantComida=" + cantComida + '}';
    }
}
