public class Musica extends Midia {
    private double Duracao;
    private String Artista;
    private int Notas;


    public Musica(String Titulo, int Ano, String Genero, double Duracao, String Artista, int Notas) {
        super(Titulo, Ano, Genero);
        Duracao = Duracao;
        Artista = Artista;
        Notas = Notas;
    }

    public double getDuracao() {
            double Duracao = 0;
        return Duracao;
    };

        public void setDuracao() {
        }
        public String getArtista() {
            return Artista;
        }

        public void setArtista(String artista) {
            Artista = artista;
        }
    public int getNotas() {
        if(this.Notas < 3){
            System.out.println("Esta música está abaixo da média");
        }else {
            System.out.println("Esta música está acima da média");
        }
        return Notas;
    }

        public void setNotas(int notas) {
            Notas = notas;
        }


    }



