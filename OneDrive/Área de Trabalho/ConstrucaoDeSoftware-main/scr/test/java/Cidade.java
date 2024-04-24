public class Cidade {
    private String nome;
    private Estado estado;
    private String Complemento;
    private Integer Numero;
    private Integer CEP;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public Estado getEstado() {
        return estado;
    }

    public void receberBairro(Bairro bairro) {
        // implementação do método
    }
}
