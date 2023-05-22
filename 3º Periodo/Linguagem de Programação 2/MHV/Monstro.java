package MHV;

public class Monstro {
    private Cabeca cabeca;
    private Perna pernas;
    private Olhos olhos;
    private Bocas bocas;
    private Bracos bracos;
    
    public Monstro(Cabeca cabeca, Perna pernas, Olhos olhos, Bocas bocas, Bracos bracos) {
        this.cabeca = cabeca;
        this.pernas = pernas;
        this.olhos = olhos;
        this.bocas = bocas;
        this.bracos = bracos;
    }

    public Cabeca getCabeca() {
        return cabeca;
    }

    public void setCabeca(Cabeca cabeca) {
        this.cabeca = cabeca;
    }

    public Perna getPernas() {
        return pernas;
    }

    public void setPernas(Perna pernas) {
        this.pernas = pernas;
    }

    public Olhos getOlhos() {
        return olhos;
    }

    public void setOlhos(Olhos olhos) {
        this.olhos = olhos;
    }

    public Bocas getBocas() {
        return bocas;
    }

    public void setBocas(Bocas bocas) {
        this.bocas = bocas;
    }

    public Bracos getBracos() {
        return bracos;
    }

    public void setBracos(Bracos bracos) {
        this.bracos = bracos;
    }

}
