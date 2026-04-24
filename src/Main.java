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



    }


}
