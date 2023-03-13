public class Artista extends Midia {

    private String Nome;
    private String DataDeNascimento;
    private String[] Premiacoes;
    private String Genero;

    private Midia midia;

    public Artista(String Nome, String DataDeNascimento, String Premiacoes, int Genero, String Titulo, String Ano) {
        super(Titulo, Genero, Ano);
        this.Nome = Nome;
        this.DataDeNascimento = DataDeNascimento;
        String [] PremiacoStringses;
        this.Genero = String.valueOf(Genero);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

    public String[] getPremiacoes() {
        return Premiacoes;
    }

    public void setPremiacoes(String[] premiacoes) {
        Premiacoes = premiacoes;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }



}
