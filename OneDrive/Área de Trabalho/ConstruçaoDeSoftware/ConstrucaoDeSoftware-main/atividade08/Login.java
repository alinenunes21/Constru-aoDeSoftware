import java.util.Scanner;

public class Login {
    private String usuario;
    private String senha;
    public Login (String usuario,String senha){
                this.usuario = usuario;
                this.senha = senha;
    }
    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoExcepcion {

        if (this.usuario.equals (usuario) && this.senha.equals (senha)) {
            return true;

        } else {
            throw new LoginInvalidoExcepcion ("USUÁRIO OU SENHA INCORRETOS");
        }
    }
}


