package exercicios.exercicio3;

public class aluno {
    private String nome;
    private double nota1;
    private double nota2;
    double media = 0;

    public void cadastrar(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public void calcularMedia(){
        media = (nota1 + nota2) / 2;
        System.out.println("Sua média ficou " + media);
    }
    public void verificarSituacao(){
        if (media >= 7){
            System.out.println("Aprovado.");
        }
        else if(media >=5){
            System.out.println("Recuperação.");
        }
        else{
            System.out.println("Reprovado.");
        }
    }
}
