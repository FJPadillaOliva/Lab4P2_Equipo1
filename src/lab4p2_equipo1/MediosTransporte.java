package lab4p2_equipo1;

import java.util.ArrayList;

public abstract class MediosTransporte extends Planetas {
    protected int cantTanque;
    protected int kmsTanque;
    protected int cantGalones;
    protected ArrayList<Primates> primatesAsignados = new ArrayList();

    public MediosTransporte() {
    }

    public MediosTransporte(int cantTanque, int kmsTanque, int cantGalones) {
        this.cantTanque = cantTanque;
        this.kmsTanque = kmsTanque;
        this.cantGalones = cantGalones;
    }

    public MediosTransporte(int cantTanque, int kmsTanque, int cantGalones, String nombre, int distancia) {
        super(nombre, distancia);
        this.cantTanque = cantTanque;
        this.kmsTanque = kmsTanque;
        this.cantGalones = cantGalones;
    }

    public int getCantTanque() {
        return cantTanque;
    }

    public void setCantTanque(int cantTanque) {
        this.cantTanque = cantTanque;
    }

    public int getKmsTanque() {
        return kmsTanque;
    }

    public void setKmsTanque(int kmsTanque) {
        this.kmsTanque = kmsTanque;
    }

    public int getCantGalones() {
        return cantGalones;
    }

    public void setCantGalones(int cantGalones) {
        this.cantGalones = cantGalones;
    }

    public ArrayList<Primates> getPrimatesAsignados() {
        return primatesAsignados;
    }

    public void setPrimatesAsignados(ArrayList<Primates> primatesAsignados) {
        this.primatesAsignados = primatesAsignados;
    }

    @Override
    public String toString() {
        return "Medios de transporte: \n" + 
                "\nPorcentaje de tanque: " + cantTanque + "%" + 
                "\nLos kilometros recorridos por tanque de combustible: " + kmsTanque + 
                "\nCantidad de galones que tiene el tanque: " + cantGalones +
                "\nLos primates asignados son: " + primatesAsignados;
    }
    
    
    
}
