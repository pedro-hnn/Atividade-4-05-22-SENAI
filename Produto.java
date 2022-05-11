public class Produto {
    private String nome;
    private Double preco_venda;
    private int quant_estoque;

    public Produto(String nome, Double preco_venda, int quant_estoque) {
        this.nome = nome;
        this.preco_venda = preco_venda;
        this.quant_estoque = quant_estoque;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco_venda() {
        return preco_venda;
    }

    public int getQuant_estoque() {
        return quant_estoque;
    }

}