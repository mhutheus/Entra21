package exercicios.exercicio9;

public class main {
    public static void main(String[] args) {
        ArCondiocionado a = new ArCondiocionado();

        a.cadastrar(10);
        a.cadastrar(20);

        a.aumentarTemperatura(20);
        a.aumentarTemperatura(10);

        a.diminuirTemperatura(30);
        a.diminuirTemperatura(5);
        
    }
}
