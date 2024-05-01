import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        int[] vetor = new int[10];
        int index = 0;


        Scanner scanner = new Scanner (System.in);

        try {
            while (true) {
                System.out.println ("Digite um valor inteiro (0 para sair):  ");
                int valor = scanner.nextInt ( );

                if (valor == 0) {
                    vetor[index] = valor;
                    break;
                }
                vetor[index] = valor;
                index++;

                if (index >= 10) {
                    System.out.println ("Existe um limite máximo de elementos,10");
                    break;

                }


                System.out.println ("Valores digitados: ");
                for (int i = 0; i < index; i++) {
                    System.out.println (vetor[i]);
                }
            }
            } catch(InputMismatchException e){
                System.out.println ("Só são válidos valores inteiros");
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println ("Você atingiu o número máximo de elementos");
            } finally{
                scanner.close ( );
            }
        }

    }

