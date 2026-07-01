package loja;


public class produto {

    String descricao;
    double preco;
    int estoque;
    String unidadeMedida;

    void display() {
        System.out.println("Descrição: " +this.descricao);
        System.out.println("Preço: "+ this.preco);
        System.out.println("Estoque: " + this.estoque);
        System.out.println(" Unidade: " + this.unidadeMedida);
    }

    double concederAcrecimo(double taxa){
            return this.preco + this.preco * (taxa/100);
        }

    double concederDesconto (double taxa){
            return this.preco - this.preco * (taxa / 100);
        }
    }
