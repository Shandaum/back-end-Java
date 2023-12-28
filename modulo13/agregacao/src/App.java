public class App {
    public static void main(String[] args) throws Exception {
        
        //Agragação são varias classes que se unem em 1, como por exemplo em uma venda

        Produto produto1 = criarProduto(1L, 10.00, "TV");//Se usar a variavel Long tem q colocar o "L" no final do numero
        Produto produto2 = criarProduto(2L, 1000.00, "Celular");
        
        Vendedor vendedor1 = criarVendedor("Alexandre", 10.00);
        
        Comprador comprador1 = criarComprador("Alex", 2000.00);

        Venda venda = new Venda();
        venda.setVendedor(vendedor1);
        venda.setComprador(comprador1);
        venda.add(produto2);
        venda.add(produto1);

        venda.concretizarVenda();
    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome,verba);
    }

    private static Produto criarProduto(Long codigo, Double preco, String nome){
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(preco);
        produto.setNome(nome);
        return produto;
    }

    private static Vendedor criarVendedor(String nome, Double comissao){
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }
}
