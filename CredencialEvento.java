package proyecto;

public class CredencialEvento implements Cloneable {
    private String nombreAsistente;
    private String cargo;
    private String rut;

    public CredencialEvento(String nombreAsistente, String cargo, String rut) {
        this.nombreAsistente = nombreAsistente;
        this.cargo = cargo;
        this.rut = rut;
    }

    // Constructor vacío para la plantilla base
    public CredencialEvento() {
        this.nombreAsistente = "";
        this.cargo = "";
        this.rut = "";
    }

    // Método clone implementado manualmente
    @Override
    public CredencialEvento clone() {
        return new CredencialEvento(this.nombreAsistente, this.cargo, this.rut);
    }

    // Métodos getters y setters
    public String getNombreAsistente() {
        return nombreAsistente;
    }

    public void setNombreAsistente(String nombreAsistente) {
        this.nombreAsistente = nombreAsistente;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreAsistente + ", Cargo: " + cargo + ", RUT: " + rut;
    }
}
