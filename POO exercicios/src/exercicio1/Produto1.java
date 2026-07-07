package exercicio1;

public class Produto1 {

    private String nome;
    private double preco;
    private int quantidade;

    public void cadastrar(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void aumentarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void diminuirEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + calcularValorTotal());
    }
}