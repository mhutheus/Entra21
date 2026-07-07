package exercicioDesafioExtra;

public class Main {
    public static void main(String[] args) {
        Veiculo a = new Veiculo();

        a.cadastrar("1A2B3C", "Uno", 2001);

        a.alugar();

        a.exibirCarro();

        a.devolver();

        a.exibirCarro();
    }
}
