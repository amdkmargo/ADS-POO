package aula02poom54.model;

public class Cliente {

    String nome;
    String cpf;
    String email;

    public Cliente(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String mostrarDadosCliente(){
        String msg = "Nome: " + this.nome + "\n"  + "CPF " + this.cpf + "\n" + "Email: " + this.email;
        return msg;
    }
}
