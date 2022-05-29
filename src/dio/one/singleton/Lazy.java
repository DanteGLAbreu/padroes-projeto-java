package dio.one.singleton;

public class Lazy {
    private static Lazy instancia;

    private Lazy(){}

    public static Lazy getInstancia(){
        if(instancia == null){
            synchronized (Lazy.class){
                if(instancia == null){
                    instancia = new Lazy();
                }
            }
        }
        return instancia;
    }
}
