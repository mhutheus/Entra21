package exercicios.exercicioDesafio;

public class Livro {
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    public void cadastrar(String titulo, String autor, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidade;
    }
    public void emprestarLivro(){
        if(this.quantidadeDisponivel>0){
            this.quantidadeDisponivel--;
            System.out.println("Livro emprestado");
        }
        else{
            System.out.println("Nenhum livro para emprestar");
        }
    }
    public void devolverLivro(){
        this.quantidadeDisponivel++;
        System.out.println("Livro devolvido");
    }
    public void exibirLivro(){
        System.out.println("Título: "+ this.titulo);
        System.out.println("Autor: "+ this.autor);
        System.out.println("Quantidade disponível: "+ this.quantidadeDisponivel);
    }
}
