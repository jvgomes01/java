package produto;

public class Produto {
    String nome;
    double preco;

    int quantidade;

    public Produto(String produto, double preco, int quantidade) {
        this.nome = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " Preço:" + getPreco() + " Quantidade:" + getQuantidade();
    }
}
