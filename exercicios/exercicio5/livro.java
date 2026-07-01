package exercicios.exercicio5;

public class livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public void cadastrar(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    public void emprestar(){
        if(disponivel){
        this.disponivel = false;
        System.out.println("Livro emprestado.");
        }
        else{
            System.out.println("Livro indisponível");
        }
    }
    public void devolver(){
        this.disponivel = true;
        System.out.println("Livro devolvido");
    }
    public void exibirInformacoes(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Disponível: "+ disponivel);
    }
}
