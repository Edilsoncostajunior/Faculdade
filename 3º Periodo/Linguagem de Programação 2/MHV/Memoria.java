package MHV;

public class Memoria {
    private String ddr;
    private String marca;
    
    public Memoria(String ddr, String marca) {
        this.ddr = ddr;
        this.marca = marca;
    }

    public String getDdr() {
        return ddr;
    }

    public void setDdr(String ddr) {
        this.ddr = ddr;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
