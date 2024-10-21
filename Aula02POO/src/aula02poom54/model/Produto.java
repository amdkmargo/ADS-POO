package aula02poom54.model;

import javax.swing.JOptionPane;

public class Produto {

    String nome;
    double precoCusto;
    double precoVenda;
    int quantidade;

    public Produto(){
        System.out.println("Isto e um construtor");
    }

    public Produto (String nome, double precoCusto, double precoVenda, int quantidade){
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public void cadastrarProduto () {
        nome = JOptionPane.showInputDialog("Digite o nome do produto");
        precoCusto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco de custo"));
        precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco de venda"));
        quantidade = 0;
    }

    public void imprimirResumoProduto () {
        String msg = "Nome: " + nome + "\n";
        msg += "Preco de Custo: " + precoCusto + "\n";
        msg = msg + "Preco de venda: " + precoVenda + "\n";
        msg += "Quantidade em estoque: " + quantidade;
        JOptionPane.showMessageDialog(null, msg);
    }
}
