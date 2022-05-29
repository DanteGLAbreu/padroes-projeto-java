package dio.one.facade.mine;

public class Maca implements LojaCelular{
    @Override
    public void numeroModelo() {
        System.out.println("Maçã 6");
    }

    @Override
    public void preco() {
        System.out.println("R$ 6500,00");
    }
}
