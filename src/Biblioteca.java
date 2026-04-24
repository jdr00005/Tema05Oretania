import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro (Libro libro) {

        libros.add(libro);

    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibros() {
        return List.copyOf(libros);
    }
}
