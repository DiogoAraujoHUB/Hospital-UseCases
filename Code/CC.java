import java.time.LocalDate;

public class CC {
    private long id;
    private String numeroCivil;
    private String nomeCompleto;
    private char sexo;
    private double altura;
    private String nacionalidade;
    private LocalDate dataNascimento;
    private LocalDate dataValidade;
    private String assinatura;
    private String pais;
    private String numeroFiscal;
    private String numeroSeguranca;
    private String numeroUtente;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroCivil() {
        return numeroCivil;
    }

    public void setNumeroCivil(String numeroCivil) {
        this.numeroCivil = numeroCivil;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public String getNumeroSeguranca() {
        return numeroSeguranca;
    }

    public void setNumeroSeguranca(String numeroSeguranca) {
        this.numeroSeguranca = numeroSeguranca;
    }

    public String getNumeroUtente() {
        return numeroUtente;
    }

    public void setNumeroUtente(String numeroUtente) {
        this.numeroUtente = numeroUtente;
    }
}
