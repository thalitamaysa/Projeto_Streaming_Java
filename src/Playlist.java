import java.util.List;

public class Playlist{
    Musica[] musica;
    Filme[] filme;
    int [] OrdemEmExecucao;
    String ExecutandoAgora;
    String MisturaTudo;


    public Playlist(String executandoAgora) {
        ExecutandoAgora = executandoAgora;
    }


    public int[] getOrdemEmExecucao() {
        return OrdemEmExecucao;
    }

    public void setOrdemEmExecucao(int[] OrdemEmExecucao) {
        this.OrdemEmExecucao = OrdemEmExecucao;
    }

    public String getExecutandoAgora() {
        return ExecutandoAgora;
    }

    public void setExecutandoAgora(String ExecutandoAgora) {
        this.ExecutandoAgora = ExecutandoAgora;
    }


}
