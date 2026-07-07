package code.heranca.exemplo;

public class Aluno extends Pessoa {

    private double media;

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getStatus() {
        return media < 7 ? "Reprovado" : "Aprovado";

        /* mesma coisa que 
        if(media<7){
        return "Reprovado";
        }
        else{
            return "Aprovado";
        } */
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Media: " + media);
        System.out.println(getStatus());
    }
}

