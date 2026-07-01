package exercicios.exercicio7;

public class lampada {
    private boolean estado;

    public void cadastrar(){
        this.estado = false;
    }
    public void ligar(){
        if(!estado){
        this.estado = true;
        System.out.println("Lâmpada ligada.");
        }
        else{
            System.out.println("Lâmpada já estava ligada.");
        }
    }
    public void desligar(){
        if(estado){
            this.estado = false;
            System.out.println("Lâmpada desligada.");
        }
        else{
            System.out.println("Lâmpada já estava desligada.");
        }
    }
    public void mostrarEstado(){
        if(estado){
            System.out.println("Ligada");
        }
        else{
            System.out.println("Desligada");
        }
    }
}
