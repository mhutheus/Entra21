import dao.ProdutoDao;
import modelos.Produto;

public class Main {
public static void main(String[] args) {
    Produto p1 = new Produto("Maca", 5.85);

    ProdutoDao dao = new ProdutoDao();
    //Produto retorno = dao.salvar(p1);
     //System.out.println(retorno.getId() + " - " + retorno.getDescricao());
 
     //dao.deletar(1);
    // List<Produto> lista = dao.consultar();
    // for (Produto p : lista){
    //    System.out.println(p.getId() + " " + p.getDescricao() + " " + p.getPreco());
     //}
     
     Produto p = dao.consultar(3);
     System.out.println(p.getId() + " " + p.getDescricao() + " " + p.getPreco());

    }
}