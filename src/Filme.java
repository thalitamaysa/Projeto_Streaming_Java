import java.util.Arrays;

public class Filme {
    private double Duracao;
    private String Tipo;
    private String[] Elenco;
    private String Diretor;
    private String Produtor;

    public Filme(double Duracao, String Tipo, String Elenco, String Diretor, String Produtor){
        this.Duracao = Duracao;
        this.Tipo = Tipo;
        String[] elenco;
        this.Produtor = Produtor;


    }
    public double getDuracao() {
        return Duracao;
    }

    public void setDuracao(double duracao) {
        Duracao = duracao;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String[] getElenco() {
        return Elenco;
    }

    public void setElenco(String [] Elenco) {
        Elenco = Elenco;

    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    public String getProdutor() {
        return Produtor;
    }

    public void setProdutor(String produtor) {
        Produtor = produtor;
    }



}
