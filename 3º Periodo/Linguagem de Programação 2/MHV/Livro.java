package MHV;

public class Livro {
    private Autor autor;
    private Titulo titulo;
    private Capitulo capitulo;
    private Editora editora;
    
    public Livro(Autor autor, Titulo titulo, Capitulo capitulo, Editora editora) {
        this.autor = autor;
        this.titulo = titulo;
        this.capitulo = capitulo;
        this.editora = editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public Capitulo getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulo = capitulo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
}
