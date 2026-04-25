import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {

    private int numFact;
    private Date fecha;
    private String cliente;
    private List<Producto> productos;

    public Factura(int numFact, Date fecha, String cliente, List<Producto> productos) {
        this.numFact = numFact;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public int getNumFact() {
        return numFact;
    }

    public void setNumFact(int numFact) {
        this.numFact = numFact;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
