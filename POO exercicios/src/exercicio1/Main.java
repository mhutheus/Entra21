package exercicio1;

public class Main {

    public static void main(String[] args) {

        Produto1 p = new Produto1();

        p.cadastrar("Notebook", 3500.00, 10);

        p.aumentarEstoque(20);

        p.diminuirEstoque(5);

        p.exibirDados();
    }
}
