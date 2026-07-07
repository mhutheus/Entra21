package exercicio9;

public class ArCondiocionado {

    private double temperaturaAtual;
    double temperatura;

    public void cadastrar(double temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperaturaAtual = temperatura;
            System.out.println("Temperatura atual: "+ this.temperaturaAtual);
        } else {
            System.out.println("Temperatura inválida");
        }
    }

    public void aumentarTemperatura(double mudanca) {
        if (mudanca > 0) {
            temperatura = (this.temperaturaAtual + mudanca);
            if (temperatura >= 16 && temperatura <= 30) {
                this.temperaturaAtual = temperatura;
                System.out.println("Temperatura atual: "+ this.temperaturaAtual);
            } else {
                System.out.println("Mudanca inválida");
            }
        } else {
            System.out.println("Mudanca inválida");
        }
    }

    public void diminuirTemperatura(double mudanca) {
        if (mudanca > 0) {
            temperatura = (this.temperaturaAtual - mudanca);
            if (temperatura >= 16 && temperatura <= 30) {
                this.temperaturaAtual = temperatura;
                System.out.println("Temperatura atual: "+ this.temperaturaAtual);
            } else {
                System.out.println("Mudanca inválida");
            }
        } else {
            System.out.println("Mudanca inválida");
        }
    }
}
