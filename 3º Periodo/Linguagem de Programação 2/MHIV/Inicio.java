package MHIV;

public class Inicio {


    public static void main(String[] args) {
        Conta contacorrente = new Conta("209340", 1000.00);
        Conta contapoupanca = new Conta("222222", 1000000.00);

        System.out.println("Saldo das contas antes do deposito:");
        System.out.println("Conta Nº " + contacorrente.getNumeroConta() + "Saldo: " + contacorrente.getSaldo());
        System.out.println("Conta Nº " + contapoupanca.getNumeroConta() + "Saldo: " + contapoupanca.getSaldo());

        contacorrente.deposiar(100);
        contapoupanca.deposiar(1000000.00);

        System.out.println("\nSaldo das contas depois do deposito:");
        System.out.println("Conta Nº " + contacorrente.getNumeroConta() + "Saldo: " + contacorrente.getSaldo());
        System.out.println("Conta Nº " + contapoupanca.getNumeroConta() + "Saldo: " + contapoupanca.getSaldo());

        contacorrente.sacar(100);

        System.out.println("\nSaldo das contas depois do saque: ");
        System.out.println("Conta Nº " + contacorrente.getNumeroConta() + "Saldo: " + contacorrente.getSaldo());
        System.out.println("Conta Nº " + contapoupanca.getNumeroConta() + "Saldo: " + contapoupanca.getSaldo());
        



    }
    
}
