package exercicios.exercicio10;

public class celular {
    private String modelo;
    private int bateria;

    public void cadastrar(String modelo){
        this.modelo = modelo;
        this.bateria = 0;
    }
    public void carregar(){
        this.bateria = 100;
        System.out.println("Celular carregado");
    }
    public void usar(int percentual){
        if(percentual <= this.bateria){
        this.bateria -= percentual;
        }
    }
    public void mostrarBateria(){

    }
}
