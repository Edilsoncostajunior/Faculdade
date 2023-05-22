public class Produtos {
    private String nome;
    private double valor;
    private int quantidade;
    private String marca;
    private String descricao;
    private String categoria;



    public Produtos(String nome, double valor, int quantidade, String marca, String descricao, String categoria) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.marca = marca;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
