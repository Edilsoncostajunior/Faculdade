package MHV;

public class Computador {
    private Teclado teclado;
    private Monitor monitor;
    private Memoria memoria;
    private PlacaMae placaMae;
    
    public Computador(Teclado teclado, Monitor monitor, Memoria memoria, PlacaMae placaMae) {
        this.teclado = teclado;
        this.monitor = monitor;
        this.memoria = memoria;
        this.placaMae = placaMae;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }
    
}
