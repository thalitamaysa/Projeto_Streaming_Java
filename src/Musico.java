public class Musico extends Artista{
    private String atuacao;

    public Musico(String Nome, String DataDeNascimento, String Premiacoes, int Genero, String Titulo, String Ano, String atuacao) {
        super(Nome, DataDeNascimento, Premiacoes, Genero, Titulo, Ano);
        this.atuacao = atuacao;
    }
}
