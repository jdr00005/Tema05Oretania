public class LadoNoValidoException extends IllegalArgumentException {

    public LadoNoValidoException() {

        super("El lado tiene un tamño incorrecto");

    }

    public LadoNoValidoException(String message){

        super(message);

    }


}
