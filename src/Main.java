import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        String[] vector = new String[10];
        List<String> lista = new ArrayList<>();

        vector[0] = "HOLA";
        vector[1] = "MUNDO";

        lista.add("HOLA");
        lista.add("MUNDO");

        System.out.println(vector[0]);
        System.out.println(lista.get(0));

        vector[0] = "ADIÓS";
        lista.set(0, "ADIÓS");

        System.out.println(vector[0]);
        System.out.println(lista.get(0));

        Estudiante e1 = new Estudiante("Chuck", "Norris", 123456, "1º de DAM");


        e1.entrar();
        e1.estudiar();


        //Animal a = new Animal("Turrón");
        Gato g = new Gato("Guantes", "Siameso");
        Perro p = new Perro("Thor", "Bretón");


        /*a.emitirSonido();
        p.emitirSonido();
        g.emitirSonido();*/


        Portatil porta = new Portatil("Xiaomi", "Notebook Air 13.13");
        porta.numeroSerie = 20;
        porta.imprimir();


        try {

            FileReader fr = new FileReader("no_existe.txt.");
            FileWriter fw = new FileWriter("copia.txt");
            fr.transferTo(fw);
            fw.close();
            fr.close();

        } catch (FileNotFoundException e) {

            System.err.println("No encontrado");

        } catch (IOException e) {

            System.err.println("Error de E/S");

        } catch (Exception e) {

            System.err.println("Ha sido otro error");

        } finally {

            System.err.println("Siempre se ejecuta");

        }

        Imagen i = new Imagen(640,480);
        Almacenable a1 = i;
        Rotable r1 = i;

        i.recuperar("imagen.jpg");
        i.rotarSentidoContrarioAgujas();
        a1.guardar("salida.jpg");
        r1.rotarSentidoAgujas();

    }


}
