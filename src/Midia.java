public class Midia {
    private String Titulo;
    private int Ano;
    private String Genero;

    public Midia (String Titulo, int Ano, String Genero){
        this.Titulo = Titulo;
        this.Ano = Ano;
        this.Genero = Genero;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }




}

