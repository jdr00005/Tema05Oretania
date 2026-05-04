public class Cuadrado {

    private double lado;

    public Cuadrado(double lado) {
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {

        if (lado < 0) {

            throw new IllegalArgumentException("Lado no válido");

        }

        this.lado = lado;
    }
}
