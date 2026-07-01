package exercicios.exercicio2;

public class contaBancaria {

    private int id;
    private String titular;
    private double saldo;

    public void cadastrar(int id, String titular){
        this.id = id;
        this.titular = titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
