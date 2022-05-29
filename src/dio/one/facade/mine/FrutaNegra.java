package dio.one.facade.mine;

public class FrutaNegra implements LojaCelular{

    @Override
    public void numeroModelo() {
        System.out.println("FrutaNegra Z10");
    }

    @Override
    public void preco() {
        System.out.println("R$ 5500,00");
    }
}
