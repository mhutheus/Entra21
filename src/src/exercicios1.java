package src;
import java.util.Scanner;
public class exercicios1 {
    public static void main(String[] args) {
        //exercicio1a();
        //exercicio2a();
        //exercicio3a();
        //exercicio4a();
        //exercicio5a();
        //exercicio6a();
        //exercicio7a();
        //exercicio8a();
        //exercicio9a();
        //exercicicio9aextra();
        exercicio10a();

        //exercicio1b();
        //exercicio2b();
        //exercicio3b();
        //exercicio4b();
        //exercicio5b();
        //exercicio6b();
        //exercicio7b();
        //exercicio8b();
        //exercicio9b();
        //exercicio10b();
        //exercicio11b();
        //exercicio12b();
        //exercicio13b();
        //exercicio14b();
        //exercicio15b();
        //exercicio16b();
        //exercicio17b();
        //exercicio18b();

    }
    //exercicio de if

    static void exercicio1a(){
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
    static void exercicio2a(){
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
    static void exercicio3a(){
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
    static void exercicio4a(){
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
    static void exercicio5a(){
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
    static void exercicio6a(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu primeiro número");
        float n1 = entrada.nextFloat();
        System.out.println("Digite seu segundo número");
        float n2 = entrada.nextFloat();
        System.out.println("Digite seu terceiro número");
        float n3 = entrada.nextFloat();
        if(n1 > n2 && n1 > n3){
            System.out.println("O maior número é "+n1);
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("O maior número é "+n2);
        }
        else if(n3 > n1 && n3 > n2){
            System.out.println("O maior número é "+n3);
        }
        else{
            System.out.println("Os números são iguais");
        }
        entrada.close();
    }
    static void exercicio7a(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua nota");
        float x = entrada.nextFloat();
        if (x < 0 || x > 10){
            System.out.println("Nota inválida");}
        else if(x >= 9){
            System.out.println("Sua nota é excelente");}
        else if(x >= 7){
            System.out.println("Sua nota é boa");}
        else if(x >= 5){
            System.out.println("Sua nota é regular");}
        else{
            System.out.println("Sua nota é ruim");
        }
        entrada.close();
    }
    static void exercicio8a(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triângulo");
        float l1 = entrada.nextFloat();
        System.out.println("Digite o segundo lado do triângulo");
        float l2 = entrada.nextFloat();
        System.out.println("Digite o terceiro lado do triângulo");
        float l3 = entrada.nextFloat();
        if ((l1 + l2)>l3 && (l1 + l3) > l2 && (l2 + l3) > l1){
            System.out.println("Os lados formam um triângulo");}
        else{
            System.out.println("Os lados não formam um triângulo");
        }
        entrada.close();
    }
    static void exercicio9a(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triângulo");
        float l1 = entrada.nextFloat();
        System.out.println("Digite o segundo lado do triângulo");
        float l2 = entrada.nextFloat();
        System.out.println("Digite o terceiro lado do triângulo");
        float l3 = entrada.nextFloat();
        if (l1==l2 && l1==l3){
            System.out.println("O triângulo é equilátero");}
        else if(l1==l2 || l1==l3 || l2==l3){
            System.out.println("O triângulo é isósceles");}
        else{
            System.out.println("O triângulo é escaleno");
        }
        entrada.close();
    }
    static void exercicicio9aextra(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triângulo");
        float l1 = entrada.nextFloat();
        System.out.println("Digite o segundo lado do triângulo");
        float l2 = entrada.nextFloat();
        System.out.println("Digite o terceiro lado do triângulo");
        float l3 = entrada.nextFloat();
        int x = 0;
        if ((l1 + l2)>l3 && (l1 + l3) > l2 && (l2 + l3) > l1){
            System.out.println("Os lados formam um triângulo");
            x++;
        }
        else{
            System.out.println("Os lados não formam um triângulo");
        }
        if (x == 1){
            if (l1==l2 && l1==l3){
            System.out.println("O triângulo é equilátero");}
        else if(l1==l2 || l1==l3 || l2==l3){
            System.out.println("O triângulo é isósceles");}
        else{
            System.out.println("O triângulo é escaleno");
        }
        }
        entrada.close();
    }
    static void exercicio10a(){
         Scanner entrada = new Scanner(System.in);
         String senha = "oi 1234";
         System.out.println("Digite a senha");
         String tentativa = entrada.nextLine();
         if (tentativa.equals(senha)){
             System.out.println("Acesso permitido");
         }
         else{
             System.out.println("Acesso negado");
         }
         entrada.close();

    }

    //a partir daqui são os exercícios básicos

    static void exercicio1b(){
        int x = 10;
        System.out.println(x);

    }
    static void exercicio2b(){
        String nome = "Matheus";
        int idade = 17;
        double altura = 1.75;
        System.out.println("Meu nome é "+nome+" eu tenho "+idade+" anos e tenho "+altura);

    }
    static void exercicio3b(){
        int x = 5;
        int y = 4;
        int soma = (5+4);
        System.out.println(soma);

    }
    static void exercicio4b(){
        double garrafa = 3.99;
        System.out.println("O preço da garrafa é "+garrafa+"R$");
    }
    static void exercicio5b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.next();
        System.out.println("Olá "+nome+" seja bem vindo/a!");
        entrada.close();
        
    }
    static void exercicio6b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("em 10 anos você terá "+(idade+10)+" anos");
        entrada.close();

    }
    static void exercicio7b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        int x = entrada.nextInt();
        System.out.println("Digite outro número");
        int y = entrada.nextInt();
        int soma = (x+y);
        System.out.println("A soma dos números é "+soma);
        entrada.close();
    }
    static void exercicio8b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        int x = entrada.nextInt();
        int dobro = (x*2);
        System.out.println("O dobro de seus números é "+dobro);
        entrada.close();

    }
    static void exercicio9b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o preço");
        float preco = entrada.nextFloat();
        float desconto = (preco*1/10);
        entrada.close();
        System.out.println("com o desconto o preço fica "+desconto);

    }
    static void exercicio10b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura");
        float h = entrada.nextFloat();
        System.out.println("Digite a largura");
        float l = entrada.nextFloat();
        float a = (l*h);
        System.out.println("A área de seu retângulo é de "+a);
        entrada.close();

    }
    static void exercicio11b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        float n1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota");
        float n2 = entrada.nextFloat();
        System.out.println("Digite a terceira nota");
        float n3 = entrada.nextFloat();
        float media = ((n1+n2+n3)/3);
        System.out.println("sua média é "+ media);
        entrada.close();
    }
    static void exercicio12b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salário");
        float S = entrada.nextFloat();
        float aumento = (S * 115/100);
        System.out.println("Com o aumento, seu salário é de "+aumento);
    }
    static void exercicio13b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = entrada.next();
        System.out.println("Quantos anos você tem?");
        int idade = entrada.nextInt();
        System.out.println("Olá "+nome+", voce tem "+idade+" anos!");
        entrada.close();

    }
    static void exercicio14b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        float x = entrada.nextInt();
        System.out.println("Digite outro número");
        float y = entrada.nextInt();
        float so = (x+y);
        float su = (x-y);
        float mu = (x*y);
        float di = (x/y);
        System.out.println("A soma dos números é "+so);
        System.out.println("A subtração dos números é "+su);
        System.out.println("A multiplicação dos números é "+mu);
        System.out.println("A divisão dos números é "+di);
        entrada.close();
    }
    static void exercicio15b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        float c = entrada.nextFloat();
        float f = (c*9/5)+32;
        System.out.println("A temperatura em Fahrenheit é "+f);
        entrada.close();
    }
    static void exercicio16b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite suas horas trabalhadas");
        float h = entrada.nextFloat();
        System.out.println("Digite o valor da sua hora");
        float v = entrada.nextFloat();
        float s = h * v;
        System.out.println("Seu salário é de R$ " + s);
        entrada.close();
    }
    static void exercicio17b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = entrada.next();
        System.out.println("Digite seu 1º número:");
        float n1= entrada.nextFloat();
        System.out.println("Digite seu 2º número:");
        float n2= entrada.nextFloat();
        System.out.println("Digite seu 3º número:");
        float n3= entrada.nextFloat();
        float m= (n1+n2+n3)/3;
        System.out.println("Olá "+nome+", a média dos seus números é "+m);
        entrada.close();
    }
    static void exercicio18b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        String nome = entrada.next();
        System.out.println("Digite o valor do produto:");
        float p = entrada.nextFloat();
        System.out.println("Digite a quantidade do produto:");
        float q = entrada.nextFloat();
        float total = p * q;
        System.out.println("O total do produto " + nome + " é R$ " + total);
        entrada.close();
    }
        
}
