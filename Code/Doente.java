public class Doente {
    private long id;
    private String numeroUtente;
    private PulseiraEnum pulseira;
    private CC cc;
    private Morada morada;
    private CartaoSeguradora cartaoSeguradora;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroUtente() {
        return numeroUtente;
    }

    public void setNumeroUtente(String numeroUtente) {
        this.numeroUtente = numeroUtente;
    }

    public PulseiraEnum getPulseira() {
        return pulseira;
    }

    public void setPulseira(PulseiraEnum pulseira) {
        this.pulseira = pulseira;
    }

    public CC getCc() {
        return cc;
    }

    public void setCc(CC cc) {
        this.cc = cc;
    }

    public Morada getMorada() {
        return morada;
    }

    public void setMorada(Morada morada) {
        this.morada = morada;
    }

    public CartaoSeguradora getCartaoSeguradora() {
        return cartaoSeguradora;
    }

    public void setCartaoSeguradora(CartaoSeguradora cartaoSeguradora) {
        this.cartaoSeguradora = cartaoSeguradora;
    }

    //Realizar exame associado ao diario clinico e, logo, ao doente
    public boolean realizarExame(DiarioClinico relatorio) {
        Exame exame = relatorio.getExame();
        boolean statusPassado = exame.getStatusPassado();
        boolean statusAprovado = exame.getStatusAprovado();
        boolean statusCompleto = exame.getStatusCompleto();

        if (!statusPassado) {
            return false;
        }
        if (!statusAprovado) {
            return false;
        }
        if (statusCompleto) {
            return false;
        }

        exame.setStatusCompleto(true);
        return true;
    }

    //Doente paga as contas das operações e da consulta
    public void efetuarPagamento(DiarioClinico relatorio, int pagamento) {
        int valorPagar = relatorio.getValorPagar();

        if (pagamento >= valorPagar) {
            valorPagar = 0;
        } else {
            valorPagar -= pagamento;
        }

        relatorio.setValorPagar(valorPagar);
    }
}
