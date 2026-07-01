package loja;
public class objetoExemplo {

    public static void main(String[] args) {

        Produto p = new Produto();
        p.descricao = "milho";
        p.preco = 100;
        p.estoque = 25;
        p.unidadeMedida = "KG";
        p.display();

        System.out.println(p.concederAcrecimo(5));
        System.out.println(p.concederDesconto(10));     
    }

}
