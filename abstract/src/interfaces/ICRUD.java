package interfaces;

import animal.Pig;
import java.util.List;

public interface ICRUD {

    Pig salvar(Pig pig);

    void deletar(int id);

    void alterar(Pig pig);

    Pig consultar(int id);

    List<Pig> consultar();
}
