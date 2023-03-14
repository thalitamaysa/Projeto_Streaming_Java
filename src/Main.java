public class Main {
    public static void main(String[] args){
        Playlist playlistsoAsMelhores = new Playlist("Metal contra as nuvens");
        Biblioteca TudoNumSoLugar = new Biblioteca(null, null, null, "Helena");
        TudoNumSoLugar.setPlaylist(playlistsoAsMelhores,0);
        TudoNumSoLugar.executar_playlist(TudoNumSoLugar.getPlaylist()[0]);
    }
}