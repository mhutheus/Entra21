package src;

import java.util.Scanner;

public class calculadoraDeMedia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você quer descobrir sua média(1) ou quanto precisa(2)?");
        int p = entrada.nextInt();
        if (p == 1) {
            System.out.println("Sua média é aritimética (1) ou 70%-30% (2)?");
            int tipo = entrada.nextInt();
            float total = 0f;
            float total7 = 0f;
            float total3 = 0f;
            if (tipo == 1) {
                System.out.println("Quantas notas serão?");
                int q = entrada.nextInt();
                for (int i = 0; i < q; i++) {
                    System.out.println("Digite sua " + (i + 1) + "ª nota");
                    float n = entrada.nextFloat();
                    total = (total + n);
                }
                float media = (total / q);
                System.out.println("Sua média é: " + media);
            } else if (tipo == 2) {
                System.out.println("Quantas notas de 70% serão?");
                int q1 = entrada.nextInt();
                for (int i = 0; i < q1; i++) {
                    System.out.println("Digite sua " + (i + 1) + "ª nota");
                    float n = entrada.nextFloat();
                    total7 = (total7 + n);
                }
                System.out.println("Quantas notas de 30% serão?");
                int q2 = entrada.nextInt();
                for (int i = 0; i < q2; i++) {
                    System.out.println("Digite sua " + (i + 1) + "ª nota");
                    float n = entrada.nextFloat();
                    total3 = (total3 + n);
                }
                float media7 = (total7 / q1);
                float media3 = (total3 / q2);
                float media = (0.7f * media7 + 0.3f * media3);
                System.out.println("Sua média é: " + media);
            } else {
                System.out.println("Inválido!");
            }
        }
        if (p == 2) {
            System.out.println("Qual a nota necessária para passar?");
            float passar = entrada.nextFloat();
            System.out.println("Sua média é aritimética (1) ou 70%-30% (2)?");
            int tipo = entrada.nextInt();
            if (tipo == 1) {
                System.out.println("Quantas notas você já tem?");
                int tem = entrada.nextInt();
                System.out.println("Quantas o total de notas?");
                int tudo = entrada.nextInt();
                float total = 0f;
                for (int i = 0; i < tem; i++) {
                    System.out.println("Digite sua " + (i + 1) + "ª nota");
                    float n = entrada.nextFloat();
                    total = (total + n);
                }
                float falta = ((passar * tudo) - total);
                float nota = (falta / (tudo - tem));
                System.out.println(
                        "Para passar você precisa de " + falta + " pontos de nota total ou " + nota + " por prova.");
            }
            if (tipo == 2) {
                System.out.println("Quantas notas 70% você já tem?");
                int tem1 = entrada.nextInt();
                System.out.println("Qual o total de notas 70%?");
                int tudo1 = entrada.nextInt();
                System.out.println("Quantas notas 30% você já tem?");
                int tem2 = entrada.nextInt();
                System.out.println("Qual o total de notas 30%?");
                int tudo2 = entrada.nextInt();
                float total1 = 0f;
                float total2 = 0f;
                for (int i = 0; i < tem1; i++) {
                    System.out.println("Digite sua " + (i + 1) + "ª nota 70%");
                    float n = entrada.nextFloat();
                    total1 = (total1 + n);
                }
                for (int i = 0; i < tem2; i++) {
                    System.out.println("Digite sua " + (i + 1) + "ª nota 30%");
                    float n = entrada.nextFloat();
                    total2 = (total2 + n);
                }

            }
        }
    }
}
