package exercicios.exercicioDesafio;

public class main {
    public static void main(String[] args) {
        
        Livro a = new Livro();
        a.cadastrar("O Cortiço", "Aluízio de Azevedo", 3);

        Livro b = new Livro();
        b.cadastrar("Memórias Póstumas de Brás Cubas", "Machado de Assis", 5);

        Usuario c = new Usuario();
        c.cadastrar("João", 1);

        a.emprestarLivro();
        a.emprestarLivro();
        b.emprestarLivro();
        b.emprestarLivro();
        b.emprestarLivro();

        a.devolverLivro();
        b.devolverLivro();
        b.devolverLivro();

        c.exibirUsuario();
        a.exibirLivro();
        b.exibirLivro();

    }
}
