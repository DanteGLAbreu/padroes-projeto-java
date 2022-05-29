package dio.one.strategy.my;

public class Calculadora {

    private Face face;

    public Calculadora(Face face){
        this.face = face;
    }

    public float executeFace(float num1, float num2){
        return face.calcular(num1, num2);
    }
}
