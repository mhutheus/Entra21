package exercicios.exercicioDesafio;

public class Usuario {
    private String nome;
    private int matricula;

    public void cadastrar(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public void exibirUsuario(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Matrícula: "+ this.matricula);
    }
}
