public class Docente {

    private String nombreCompleto;
    private Grupo tutoria;

    public Docente(String nombreCompleto, Grupo tutoria) {
        this.nombreCompleto = nombreCompleto;
        this.tutoria = tutoria;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Grupo getTutoria() {
        return tutoria;
    }

    public void setTutoria(Grupo tutoria) {
        this.tutoria = tutoria;
    }
}
