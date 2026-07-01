package exercicios.exercicio5;

public class main {
    public static void main(String[] args){
        livro a = new livro();

        a.cadastrar("Cortiço", "Aluísio de Azevedo");

        a.emprestar();

        a.exibirInformacoes();

        a.emprestar();

        a.devolver();

        a.exibirInformacoes();
    }
}
