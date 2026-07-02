package exercicios.exercicio10;

public class Celular {
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
        System.out.println("Bateria atual: " + bateria);
        }
        else{
            this.bateria = 0;
            System.out.println("Bateria acabou antes de terminar de usar.");
        }
    }
    public void mostrarBateria(){
        System.out.println("Bateria do seu celular modelo " + modelo + " está em " + bateria + "%");
    }
}
