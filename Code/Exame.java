public class Exame {
    private long id;
    private String exame;
    private boolean statusRepetido;
    private boolean statusPassado = false;
    private boolean statusAprovado = false;
    private boolean statusCompleto = false;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public boolean getStatusRepetido() {
        return statusRepetido;
    }

    public void setStatusRepetido(boolean statusRepetido) {
        this.statusRepetido = statusRepetido;
    }

    public boolean getStatusPassado() {
        return statusPassado;
    }

    public void setStatusPassado(boolean statusPassado) {
        this.statusPassado = statusPassado;
    }

    public boolean getStatusAprovado() {
        return statusAprovado;
    }

    public void setStatusAprovado(boolean statusAprovado) {
        this.statusAprovado = statusAprovado;
    }

    public boolean getStatusCompleto() {
        return statusCompleto;
    }

    public void setStatusCompleto(boolean statusCompleto) {
        this.statusCompleto = statusCompleto;
    }
}