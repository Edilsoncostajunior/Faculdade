package MHIV;

public class Carro {
    String combubstivel;
    String ano_de_Fabricacao;
    String modelo;
    
    public Carro(String combubstivel, String ano_de_Fabricacao, String modelo, String marca) {
        this.combubstivel = combubstivel;
        this.ano_de_Fabricacao = ano_de_Fabricacao;
        this.modelo = modelo;
        this.marca = marca;
    }
    String marca;
    
    public String getCombubstivel() {
        return combubstivel;
    }
    public void setCombubstivel(String combubstivel) {
        this.combubstivel = combubstivel;
    }
    public String getAno_de_Fabricacao() {
        return ano_de_Fabricacao;
    }
    public void setAno_de_Fabricacao(String ano_de_Fabricacao) {
        this.ano_de_Fabricacao = ano_de_Fabricacao;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}
