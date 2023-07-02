public class Medico {
    private long id;
    private String nome;
    private String especializacao;
    private String numeroTelefone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    //Efetuar uma avaliação na area de triagem ao doente
    public String avaliacao(Doente doente) {
        return "AMARELA";
    }

    //Efetuar uma consulta ao paciente/doente
    public DiarioClinico consulta(Doente doente) {
        DiarioClinico relatorio = new DiarioClinico();
        relatorio.setSinaisVitais("Vivo");
        relatorio.setObservacoes("Dor de barriga");
        relatorio.setMedicacao("Xanax");
        relatorio.setTensao("Poderia estar pior");

        Exame exameParaRealizar = new Exame();
        exameParaRealizar.setExame("Raio X");
        relatorio.setExame(exameParaRealizar);

        return relatorio;
    }

    //Atribuir altas a doente associado e certificar que já não está atribuido
    public boolean atribuirAlta(DiarioClinico diarioClinico) {
        Alta altas = diarioClinico.getAltas();
        int numAltas = altas.getAltas();
        boolean status = altas.getStatus();

        if (status) {
            return true;
        }

        numAltas++;
        altas.setAltas(numAltas);
        if (numAltas == 2) {
            altas.setStatus(true);
            return true;
        }

        diarioClinico.setAltas(altas);
        return false;
    }
}
