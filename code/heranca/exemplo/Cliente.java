package code.heranca.exemplo;

public class Cliente extends Pessoa{
    private String cartao;
    private double limite;

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getLimite() {
        return limite < 3000 ? "Baixo ": "Alto ";
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Cartao: " + cartao);
        System.out.println("Limite: " + limite);
        System.out.println(getLimite());
    }

}
