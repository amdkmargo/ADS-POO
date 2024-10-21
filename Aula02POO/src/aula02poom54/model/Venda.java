package aula02poom54.model;

import java.util.ArrayList;

public class Venda {

    public int codigo;
    public Cliente cliente;
    public ArrayList<Produto> produtos;

    public Venda(Cliente cliente){
        this.cliente = cliente;
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProdutos(Produto p){
        produtos.add(p);
    }

}
