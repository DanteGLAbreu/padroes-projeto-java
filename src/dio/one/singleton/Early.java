package dio.one.singleton;

public class Early {

    private static Early instancia=new Early();
    private Early(){}

    public static Early getInstancia(){
        return instancia;
    }
}
