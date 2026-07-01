package exercicios.exercicio4;

public class funcionario {
    private String  nome;
    private double salario;

    public void cadastrar(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(double percentual){
        percentual = percentual/100;
        this.salario += salario*percentual;
    }
    public void calcularSalarioAnual(){
        System.out.println("Salário anual: " + (salario*13));

    }
    public void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Salário: " + salario);
        System.out.println("Salario anual: " + (salario*13));
    }
}
