package proyecto;

public class ConfiguracionEvento {
    private static ConfiguracionEvento instancia;
    private String nombreEvento;
    private int duracionHoras;
    private String idioma;

    private ConfiguracionEvento() {
        // Configuración predeterminada
        this.nombreEvento = "Conferencia de Tecnología";
        this.duracionHoras = 4;
        this.idioma = "Español";
    }

    public static ConfiguracionEvento getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionEvento();
        }
        return instancia;
    }

    // Métodos getters y setters
    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
