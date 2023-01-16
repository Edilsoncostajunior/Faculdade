package MHIV;

public class Conta {
    public String numeroConta;
    public double saldo;

    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacar(double qtdSaque){
        return this.saldo -= qtdSaque;
    }
    
    public double deposiar(double qtdDeposito){
        return this.saldo += qtdDeposito;
    }
    
}
