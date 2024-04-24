public class Endereco {
    private String rua;
    private String numero;
    private PessoaFisica pessoaFisica; // Associação com PessoaFisica
    private Bairro bairro; // Associação com Bairro
    private Enum tipoEndereco; // Associação com Enum
    private Logradouro logradouro; // Associação com Logradouro

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public Enum getTipoEndereco() {
        return tipoEndereco;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    // Método para associar uma pessoa física a este endereço
    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    // Método para associar um bairro a este endereço
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    // Método para associar um tipo de endereço (enum) a este endereço
    public void setTipoEndereco(Enum tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    // Método para associar um logradouro a este endereço
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }
}
