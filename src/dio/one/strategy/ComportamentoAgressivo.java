package dio.one.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movimento Agressivo...");
    }
}
