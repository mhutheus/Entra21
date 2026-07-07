package exercicio2;

public class Main {
    
    public static void main(String[] args) {
        contaBancaria c = new contaBancaria();

        c.cadastrar(1, "João");

        c.depositar(1000);

        c.sacar(300);

        c.sacar(900);

        c.consultarSaldo();

        c.exibirDados();
    }
}
