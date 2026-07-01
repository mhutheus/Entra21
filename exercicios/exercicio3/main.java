package exercicios.exercicio3;

public class main {

    public static void main(String[] args) {
        aluno a = new aluno();

        a.cadastrar("João", 7, 8);

        a.calcularMedia();

        a.verificarSituacao();

        aluno b = new aluno();

        a.cadastrar("Vitor", 6, 7);

        a.calcularMedia();

        a.verificarSituacao();

        aluno c = new aluno();

        a.cadastrar("Maria", 4, 3);

        a.calcularMedia();

        a.verificarSituacao();
    }
}
