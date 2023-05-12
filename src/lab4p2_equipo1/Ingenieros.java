package lab4p2_equipo1;

public class Ingenieros extends SeresVivos {
    private int numeroRRHH;
    private String nombreUsuario;
    private String contraseña;

    public Ingenieros() {
    }

    public Ingenieros(int numeroRRHH, String nombreUsuario, String contraseña) {
        this.numeroRRHH = numeroRRHH;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public Ingenieros(int numeroRRHH, String nombreUsuario, String contraseña, String nombre, String grupoSanguineo, String sexo, double altura, double peso) {
        super(nombre, grupoSanguineo, sexo, altura, peso);
        this.numeroRRHH = numeroRRHH;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public int getNumeroRRHH() {
        return numeroRRHH;
    }

    public void setNumeroRRHH(int numeroRRHH) {
        this.numeroRRHH = numeroRRHH;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    @Override
    public String toString() {
        return "Ingenieros:\n" + 
                "\nNumero RRHH: " + numeroRRHH + 
                "\nNombre de usuario del ingeniero: " + nombreUsuario + 
                "\nContraseña: " + contraseña;
    }

    
    
}
