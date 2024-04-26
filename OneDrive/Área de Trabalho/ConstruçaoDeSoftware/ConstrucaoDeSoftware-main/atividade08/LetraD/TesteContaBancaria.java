package LetraD;
import java.util.Scanner;

public class TesteContaBancaria {
 public static void main(String[] args) {
  Scanner scanner = new Scanner (System.in);
  double valor;

  System.out.println ("digite o valor inicial da conta:  ");
  double saldoInicial = scanner.nextDouble ( );
  ContaBancaria conta = new ContaBancaria (saldoInicial);

  System.out.println ("digite o valor a ser depositado: ");
  valor = scanner.nextDouble ( );
  conta.depositar (valor);
  System.out.println ("Saldo após o deposito: " + conta.getSaldo ( ));

  System.out.println ("Digite o valor que deseja retirar");
  valor = scanner.nextDouble ( );

  try {
   conta.sacar (valor);
   System.out.println ("Saque realizado com sucesso!");
   System.out.println ("Saldo depois da retirada: " + conta.getSaldo ( ));


  } catch (SaldoInsuficienteExcepcion e) {

   System.out.println ("Erro: " + e.getMessage ( ));
  }
 }
}