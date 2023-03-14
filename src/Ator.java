public class Ator extends Artista{
    private String Formacao;


    public Ator(String Nome, String DataDeNascimento, String Premiacoes, int Genero, String Titulo, String Ano) {
        super(Nome, DataDeNascimento, Premiacoes, Genero, Titulo, Ano);
        this.Formacao = Formacao;
    }
}