package dio.one.facade.mine;

public class Atendente {
    private LojaCelular maca;
    private LojaCelular koreana;
    private LojaCelular frutaNegra;

    public Atendente() {
        maca = new Maca();
        koreana = new Koreana();
        frutaNegra = new FrutaNegra();
    }

    public void vendaMaca() {
        maca.numeroModelo();
        maca.preco();
    }

    public void vendaKoreana() {
        koreana.numeroModelo();
        koreana.preco();
    }

    public void vendaFrutaNegra() {
        frutaNegra.numeroModelo();
        frutaNegra.preco();
    }
}
