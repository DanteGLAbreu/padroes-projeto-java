package dio.one.singleton;

public class LazyHolder {
    
    private static class InstanceHolder {
        public static LazyHolder instancia = new LazyHolder();
    }

    private LazyHolder(){
        super();
    }

    public static LazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
