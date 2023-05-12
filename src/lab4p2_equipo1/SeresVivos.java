
package lab4p2_equipo1;

public class SeresVivos {
    private String nombre;
    private String grupoSanguineo;
    private String sexo;
    private double altura;
    private double peso;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, String grupoSanguineo, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.grupoSanguineo = grupoSanguineo;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Seres vivos:\n" + 
                                  "\nNombre del ser vivo: " + nombre + 
                                  "\nGrupo sanguineo del ser vivo: " + grupoSanguineo + 
                                  "\nSexo del ser vivo: " + sexo + 
                                  "\nAltura del ser vivo: " + altura +    
                                  "\nPeso del ser vivo: " + peso;
    }
    
    
    
}
