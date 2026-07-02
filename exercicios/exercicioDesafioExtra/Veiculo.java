package exercicios.exercicioDesafioExtra;

public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private boolean disponivel;

    public void cadastrar(String placa, String modelo, int ano){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = true;
    }

    public void alugar(){
        if(this.disponivel){
            this.disponivel = false;
            System.out.println("Carro foi alugado");
        }
        else{
            System.out.println("Carro já estava alugado");
        }
    }
    public void devolver(){
        if(!this.disponivel){
            this.disponivel = true;
            System.out.println("Carro devolvido");
        }
        else{
            System.out.println("Carro já estava devolvido");
        }
    }
    public void exibirCarro(){
        System.out.println("Placa: "+ placa);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
        if(this.disponivel){
            System.out.println("Status: Disponível");
        }
        else{
            System.out.println("Status: Não disponível");
        }
    }
}
