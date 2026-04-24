import java.util.List;

public class Estudiante {

    private String nombre;
    private List<ModuloProfesional> modulos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.modulos = modulos;
    }

    public void agregarModulo(ModuloProfesional modulo) {

        modulos.add(modulo);

    }

    public List<ModuloProfesional> getModulos() {

        return List.copyOf(modulos);

    }

    public String getNombre() {
        return nombre;
    }

}
