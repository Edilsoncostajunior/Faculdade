package MHV;

public class Monitor {
    private String marca;
    private int polegadas;
    public Monitor(String marca, int polegadas) {
        this.marca = marca;
        this.polegadas = polegadas;
    }
   
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPolegadas() {
        return polegadas;
    }
    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }
    
}
