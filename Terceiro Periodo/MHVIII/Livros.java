package MHVIII;

public class Livros {
    
    private String titulo;
    private String autor;
    private String editora;
    private String edicao;
    private String genero;
    
    public static String[] tipoGenero = new String[] { "ficção", "ciências naturais", "literatura", "ciências humanas" };

    public Livros(String titulo, String autor, String tipo, String editora, String edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.genero = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static String[] getTipoGenero() {
        return tipoGenero;
    }

    public static void setTipoGenero(String[] tipoGenero) {
        Livros.tipoGenero = tipoGenero;
    }

    @Override
    public String toString() {
        return "Livros [autor: " + autor + ", edicao: " + edicao + ", editora: " + editora + ", genero: " + genero
                + ", titulo: " + titulo + "]";
    }
}
