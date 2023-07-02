import java.time.LocalDate;

public class CartaoSeguradora {
    private long id;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private LocalDate dataValidade;
    private String numeroCartao;
    private String numeroPessoal;
    private String identificacaoInstituicao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }


    public String getNumeroCartao() {
        return numeroCartao;
    }


    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroPessoal() {
        return numeroPessoal;
    }

    public void setNumeroPessoal(String numeroPessoal) {
        this.numeroPessoal = numeroPessoal;
    }

    public String getIdentificacaoInstituicao() {
        return identificacaoInstituicao;
    }

    public void setIdentificacaoInstituicao(String identificacaoInstituicao) {
        this.identificacaoInstituicao = identificacaoInstituicao;
    }
}
