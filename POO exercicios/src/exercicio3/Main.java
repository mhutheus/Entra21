package exercicio3;

public class Main {

    public static void main(String[] args) {
        aluno a = new aluno();

        a.cadastrar("João", 7, 8);

        a.calcularMedia();

        a.verificarSituacao();

        aluno b = new aluno();

        b.cadastrar("Vitor", 6, 7);

        b.calcularMedia();

        b.verificarSituacao();

        aluno c = new aluno();

        c.cadastrar("Maria", 4, 3);

        c.calcularMedia();

        c.verificarSituacao();
    }
}
