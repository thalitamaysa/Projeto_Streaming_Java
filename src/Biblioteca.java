public class Biblioteca {
    private Midia midia;
    private Musica musica;
    private Filme filme;
    private String usuario;
    private Playlist[] playlist;

    public Biblioteca(Midia midia, Musica musica, Filme filme, String usuario) {
        this.midia = midia;
        this.musica = musica;
        this.filme = filme;
        this.usuario = usuario;
        this.playlist = new Playlist[5];
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Playlist[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist, int posicao) {
        this.playlist[posicao] = playlist;
    }

    public void executar_playlist(Playlist playlist){
        System.out.println("Executando playlist: " +playlist.getExecutandoAgora() );

    }
}