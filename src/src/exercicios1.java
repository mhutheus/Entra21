package src;
import java.util.Scanner;
public class exercicios1 {
    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        exercicio6();

    }

    static void exercicio1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        float x = entrada.nextInt();
        if(x % 2 == 0){
            System.out.println("O número "+ x +" é par");}
            else{
                System.out.println("O número "+ x +" é ímpar");
            }

            entrada.close();

    }

    static void exercicio2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        float x = entrada.nextInt();
        System.out.println("Digite outro número");
        float y = entrada.nextInt();
        if(x > y){
            System.out.println("O número "+ x +" é maior que o número "+ y);
        }
        else if(x < y){
            System.out.println("O número "+ y +" é maior que o número "+ x);
        }
        else{
            System.out.println("Os números são iguais");
        }
        entrada.close();

    }

    static void exercicio3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        float x = entrada.nextInt();
        if(x > 0){
            System.out.println("O número "+ x +" é positivo");}
            else if(x < 0){
                System.out.println("O número "+ x +" é negativo");
            }
            else{
                System.out.println("O número é zero");
            }
            entrada.close();
    }
    
    static void exercicio4(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua nota");
        float x = entrada.nextInt();
        if(x < 0 || x > 10){
            System.out.println("Nota inválida");
        }
         else
        if(x >= 6){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
        entrada.close();

    }

    static void exercicio5(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int x = entrada.nextInt();
        if(x < 0){
            System.out.println("Idade inválida");
        }
        else if(x < 16){
            System.out.println("Você não pode votar");
        }
        else{
            System.out.println("Você pode votar");
        }
        entrada.close();

    }

    static void exercicio6(){

    }
}
