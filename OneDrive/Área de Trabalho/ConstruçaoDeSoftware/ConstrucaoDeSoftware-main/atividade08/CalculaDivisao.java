import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculaDivisao {

    public static void main(String[] agrs) {

        Scanner scanner = new Scanner (System.in);
        double num1;
        try {
            System.out.print ("Digite um número: ");
            num1 = scanner.nextDouble ( );

            System.out.print ("digite outro número: ");
            double num2 = scanner.nextDouble ( );
            double resultado = dividir (num1, num2);
            System.out.println ("O resultado da divisão é: "
                    + resultado);
        } catch (InputMismatchException e) {
            System.out.println ("ERRO: NUMERO DIGITADO NÃO CONFERE");
        } catch (ArithmeticException e) {
            System.out.println ("ERRO: DIVISÃO POR ZERO NÃO É PERMITIDA");
        }
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException ("Divisão por zero");
        }
        return num1 / num2;
    }
}