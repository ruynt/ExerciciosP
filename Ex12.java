package Ex12;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Produto somar(Produto outroProduto) {
        double precoTotal = this.preco + outroProduto.getPreco();
        return new Produto("Combo: " + this.nome + " + " + outroProduto.getNome(), precoTotal);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 50.0);
        Produto produto2 = new Produto("Produto B", 30.0);

        Produto produtoCombinado = produto1.somar(produto2);

        System.out.println("Produto combinado: " + produtoCombinado.getNome());
        System.out.println("Preço total: R$ " + produtoCombinado.getPreco());
    }
}
