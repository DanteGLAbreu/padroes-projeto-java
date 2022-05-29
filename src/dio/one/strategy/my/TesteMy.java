package dio.one.strategy.my;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteMy {

    public static void main(String[] args)throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite o primeiro número: ");
        float valor1 = Float.parseFloat(br.readLine());
        System.out.print("Digite o segundo número: ");
        float valor2 = Float.parseFloat(br.readLine());

        Calculadora calculadora = new Calculadora(new Soma());
        System.out.println("Soma = " + calculadora.executeFace(valor1, valor2));
        calculadora = new Calculadora(new Subtracao());
        System.out.println("Subtração = " + calculadora.executeFace(valor1, valor2));
        calculadora = new Calculadora(new Divisao());
        System.out.println("Divisão = " + calculadora.executeFace(valor1, valor2));
        calculadora = new Calculadora(new Multiplicacao());
        System.out.println("Multiplicação = " + calculadora.executeFace(valor1, valor2));

    }
}
