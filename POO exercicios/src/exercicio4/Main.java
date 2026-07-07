package exercicio4;

public class Main {
    public static void main(String[] args){
        funcionario a = new funcionario();

        a.cadastrar("João", 3500);

        a.exibirDados();

        a.aumentarSalario(15);

        a.exibirDados();
    }
    
}
