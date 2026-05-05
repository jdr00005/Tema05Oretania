public class DocumentoImagen implements Almacenable{

    private String contenido;

    public DocumentoImagen(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void guardar(String nombreFichero){

        System.out.println("Guardar documento en " + nombreFichero);

    }

    @Override
    public void recuperar(String nombreFichero){

        System.out.println("Cargando documento desde  " + nombreFichero);

    }


}
