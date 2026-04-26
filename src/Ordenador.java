public class Ordenador {

    public  String numeroSerie;
    protected String marca;
    protected String modelo;

    public Ordenador(String marca, String modelo) {
        this.numeroSerie = "Ninguno";
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimir() {

        System.out.println("Ordenador " + marca + " " + modelo + " con nº de serie " + numeroSerie );

    }

}
