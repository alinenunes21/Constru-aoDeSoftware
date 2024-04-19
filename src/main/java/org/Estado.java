import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String nome;
    private Pais pais;
    private List<Cidade> cidades;

    public Estado(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
        this.cidades = new ArrayList<>();
    }


}
