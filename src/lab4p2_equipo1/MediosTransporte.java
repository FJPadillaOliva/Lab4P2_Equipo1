package lab4p2_equipo1;

import java.util.ArrayList;

public abstract class MediosTransporte extends Planetas {
    protected int cantTanque;
    protected int kmsTanque;
    protected ArrayList<Primates> primatesAsignados = new ArrayList();

    public MediosTransporte() {
        
    }

    public MediosTransporte(int cantTanque, int kmsTanque) {
        this.cantTanque = cantTanque;
        this.kmsTanque = kmsTanque;
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

    public ArrayList<Primates> getPrimatesAsignados() {
        return primatesAsignados;
    }

    public void setPrimatesAsignados(ArrayList<Primates> primatesAsignados) {
        this.primatesAsignados = primatesAsignados;
    }

    @Override
    public String toString() {
        return "MediosTransporte{" + "cantTanque=" + cantTanque + ", kmsTanque=" + kmsTanque + ", primatesAsignados=" + primatesAsignados + '}';
    }
    
    
    
}
