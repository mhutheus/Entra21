package code.clas;

public class Main {
    public static void main(String[] args) {
        /*Produto p = new Produto();

        p.setId(1);
        p.setDescricao("milho");
        p.setPreco(1.75);
        p.setEstoque(10);

        System.out.println(p.getId());
        System.out.println(p.getDescricao());
        System.out.println(p.getPreco());
        System.out.println(p.getEstoque()); */

        Produto p1 = new Produto(2, "Banana", 2, 20);

        System.out.println(p1);

        System.out.println(p1.getId());
        System.out.println(p1.getDescricao());
        System.out.println(p1.getPreco());
        System.out.println(p1.getEstoque());

    }
}
