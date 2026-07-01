package exercicios.exercicio8;

public class retangulo {
    private double altura;
    private double largura;
    double area;
    double perimetro;

    public void cadastrar(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    public void calcularArea(){
        area = (this.altura * this.largura);
        System.out.println("Área: "+area);
    }
    public void calcularPerimetro(){
        perimetro = ((this.altura * 2)+(this.largura * 2));
        System.out.println("Perímetro: "+perimetro);
    }
    public void exibirInformações(){
        System.out.println("Área: "+area);
        System.out.println("Perímetro: "+perimetro);
    }
}
