package exercicios.exercicio6;

public class main {
    public static void main(String[] args){
        carro a = new carro();

        a.cadastrar("Fusca", "VolksWagen");


        a.acelerar(80);

        a.frear(90);

        a.frear(20);

        a.exibirDados();
    }
}
