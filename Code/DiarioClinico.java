public class DiarioClinico {
    private long id;
    private long idDoente;
    private long idMedico;
    private String sinaisVitais;
    private String observacoes;
    private String medicacao;
    private String tensao;
    private String antecedentes;
    private String diagnostico;
    private int valorPagar;
    private Exame exame;
    private Alta altas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdDoente() {
        return idDoente;
    }

    public void setIdDoente(long idDoente) {
        this.idDoente = idDoente;
    }

    public long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(long idMedico) {
        this.idMedico = idMedico;
    }

    public String getSinaisVitais() {
        return sinaisVitais;
    }

    public void setSinaisVitais(String sinaisVitais) {
        this.sinaisVitais = sinaisVitais;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public int getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }

    public Alta getAltas() {
        return altas;
    }

    public void setAltas(Alta altas) {
        this.altas = altas;
    }

    //Passar um exame para ele poder ser feito
    public boolean passarExame() {
        boolean statusPassado = exame.getStatusPassado();

        if (statusPassado) {
            return false;
        }

        exame.setStatusPassado(true);
        return true;
    }

    //Pedir aprovação ao medico chefe de serviço para o exame evasivo
    public boolean pedirAprovacao() {
        boolean statusAprovado = exame.getStatusAprovado();

        if (statusAprovado) {
            return false;
        }

        exame.setStatusAprovado(true);
        return true;
    }

    //Verificar se um exame ja existe e mandar uma mensagem se ja existir (status repetido é automaticamente feito)
    public boolean verificarExistenciaExame() {
        String exameEscolhido = exame.getExame();
        boolean statusRepetido = exame.getStatusRepetido();

        if (statusRepetido) {
            System.out.println("Exame " + exameEscolhido + " já foi criado.");
            return false;
        }

        return true;
    }
}
