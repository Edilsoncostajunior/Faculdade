package MHV;

public class PlacaMae {
    private String soquete;
    private String tiposBarramento;
    
    public PlacaMae(String soquete,  String tiposBarramento) {
        this.soquete = soquete;

        this.tiposBarramento = tiposBarramento;
    }
    
    public String getSoquete() {
        return soquete;
    }
    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }
    public String getTiposBarramento() {
        return tiposBarramento;
    }
    public void setTiposBarramento(String tiposBarramento) {
        this.tiposBarramento = tiposBarramento;
    }
    
    
}
