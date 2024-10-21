import aula02poom54.model.Cliente;
import aula02poom54.model.Produto;
import aula02poom54.model.Venda;

public class Aula02POO {
    public static void main(String[] args) throws Exception {
        
        Produto p1 = new Produto("Tijolo", 1.0, 2.0,   100);
       // p1.cadastrarProduto();
        p1.imprimirResumoProduto();

        Cliente cliente = new Cliente ("Amanda", "1234", "amandadkaskdsak.com");
        System.out.println(cliente.mostrarDadosCliente());

        Venda v = new Venda(cliente);
        v.adicionarProdutos(p1);

        v.cliente.mostrarDadosCliente();
    }
}
