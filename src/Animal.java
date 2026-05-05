abstract class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException{
        if (nombre.isBlank()){

            throw new IllegalArgumentException("El nombre no puede quedar en blanco");

        }


        this.nombre = nombre;
    }

    public abstract void emitirSonido();

}
