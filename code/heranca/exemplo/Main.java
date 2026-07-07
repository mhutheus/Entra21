package code.heranca.exemplo;

public class Main {

    public static void main(String[] args) {
        Aluno al1 = new Aluno();
        al1.setMedia(7);
        al1.setEmail("matheus@gmail");
        al1.setNome("Matheus");

        al1.display();

        System.out.println("");

        Cliente cl1 = new Cliente();
        cl1.setCartao("Asus");
        cl1.setLimite(4000);
        cl1.setEmail("Henrique@gmail.com");
        cl1.setNome("Henrique");

        cl1.display();
    }
}

