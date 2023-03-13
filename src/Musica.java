public class Musica extends Midia {
    private double Duracao;
    private String Artista;
    private int Notas;


    public Musica{double Duracao, String Artista, int Notas, String Titulo, int Ano;
        Genero){
        super(Titulo, Ano, Genero);
        this.Duracao = Duracao;
        this.Artista = Artista;
        this.Notas = Notas;

    }


    public double getDuracao() {
        double duracao = Duracao;
    }

    public void setDuracao() {
        Duracao = Duracao;
    }
    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }
    public int getNotas() {
        return Notas;
    }

    public void setNotas(int notas) {
        Notas = notas;
    }

}
