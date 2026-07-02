package exercicios.exercicio10;

public class main {
    
    public static void main(String[] args) {
        Celular a = new Celular();

        a.cadastrar("A25");

        a.carregar();

        a.usar(50);

        a.usar(60);

        a.carregar();

        a.usar(30);

        a.mostrarBateria();
        
    }
}
