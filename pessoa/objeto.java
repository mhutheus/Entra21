package pessoa;

import java.util.ArrayList;
import java.util.List;

public class objeto {

    public static void main(String[] args) {

        List<pessoa> seres = new ArrayList<>();

        pessoa p1 = new pessoa(); 
        p1.nome = "Ana";
        p1.email = "ana@gmail.com";
        //p1.display();
        seres.add(p1);

        pessoa p2 = new pessoa(); 
        p2.nome = "João";
        p2.email = "joao@gmail.com";
        //p2.display();
        seres.add(p2); 

        for(pessoa x : seres){
            x.display();
        }
    }
}