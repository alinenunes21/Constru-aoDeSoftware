package LetraC;

import LetraC.LoginInvalidoExcepcion;

import java.util.Scanner;
public class TesteLogin {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        String senhaDigitada;
        String usuarioDigitado;

        System.out.println ( "Digite o seu login" );
        usuarioDigitado = scanner.nextLine ( );

        System.out.println ( "Digite a sua senha" );
        senhaDigitada = scanner.nextLine ( );
        Login login = new Login ("usuario","senha");

            try {
                if(login.fazerLogin(usuarioDigitado, senhaDigitada)){
                    System.out.println ( "Login realizado com sucesso" );
                }else {
                    System.out.println ( "Login ou senha estão incorretos" );
                }
            }
        catch ( LoginInvalidoExcepcion e){
            System.out.println ( "Erro ao fazer o Login:  " + e.getMessage());
        }

    }












}
