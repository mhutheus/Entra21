package code.heranca.exemplo;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(){

    }

    public Pessoa(String nome, String email){
        setNome(nome);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public void display(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

}
