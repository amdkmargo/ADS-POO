import javax.swing.JOptionPane;

public class Usuario {

    private String nome;
    private String login;
    private String senha;
    private String email;

    public void cadastrarUsuario() {
        this.nome = JOptionPane.showInputDialog("Digite Seu nome: ");
    }

    public void definirNome(String nome) {
        if (nome.equals(" ")) {
            this.nome = "Nome nao preenchido";
        }
        this.nome = nome.toUpperCase();
    }

    public String mostrarNome() {
        return this.nome;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin (String login){
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
