package dio.one.singleton;

public class TesteS {
    public static void main(String[] args) {
        Lazy lazy = Lazy.getInstancia();
        System.out.println("lazy :" + lazy);
        lazy = Lazy.getInstancia();
        System.out.println("lazy :" + lazy);

        Early early = Early.getInstancia();
        System.out.println("early :" + early);
        early = Early.getInstancia();
        System.out.println("early :" + early);

        LazyHolder holder = LazyHolder.getInstancia();
        System.out.println("holder :" + holder);
        holder = LazyHolder.getInstancia();
        System.out.println("holder :" + holder);

    }
}
