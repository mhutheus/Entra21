
import dao.ProdutoDao;
import java.util.Scanner;
import modelos.Produto;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1.Salvar 2.Deletar 3.Alterar 4.Consultar um 5.Consutar todos 0.Cancelar");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 ->
                    salvar();
                case 2 ->
                    deletar();
                case 3 ->
                    alterar();
                case 4 ->
                    consultar1();
                case 5 ->
                    consultarT();

            }
        } while (opcao != 0);
    }

    private static void salvar() {
        try {
            System.out.println("Digite a descrição do produto: ");
            String descricao = sc.nextLine();

            System.out.println("Digite o preço do produto: ");
            Double preco = sc.nextDouble();

            Produto produto = new Produto();
            produto.setDescricao(descricao);
            produto.setPreco(preco);

            ProdutoDao dao = new ProdutoDao();

            Produto salvo = dao.salvar(produto);

            if (salvo != null) {
                System.out.println("Produto cadastrado com sucesso!");
                System.out.println("ID gerado: " + salvo.getId());
            } else {
                System.out.println("Não foi possível cadastrar.");
            }

        } catch (Exception e) {
            System.out.println("Erro para salvar: " + e.getMessage());
        }
    }

    private static void deletar() {
        try {
            System.out.println("Digite o id do produto para deletar: ");
            int id = sc.nextInt();

            ProdutoDao dao = new ProdutoDao();

            dao.deletar(id);

            System.out.println("Produto deletado com sucesso");

        } catch (Exception e) {
            System.out.println("Erro para deletar: " + e.getMessage());
        }
    }
    
    private static void alterar() {

    }

    private static void consultar1() {

    }

    private static void consultarT() {

    }
}
