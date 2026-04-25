public class Grupo {

    private String nombre;
    private int numAula;
    private Docente tutor;

    public Grupo(String nombre, int numAula, Docente tutor) {
        this.nombre = nombre;
        this.numAula = numAula;
        this.tutor = tutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumAula() {
        return numAula;
    }

    public void setNumAula(int numAula) {
        this.numAula = numAula;
    }

    public Docente getTutor() {
        return tutor;
    }

    public void setTutor(Docente tutor) {
        this.tutor = tutor;
    }
}
