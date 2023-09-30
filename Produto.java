package poo;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private int quantMinima;
    private Categoria categoria;
    

    public Produto(int id, String nome, double preco, int quantidade, int quantMinima, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.quantMinima = quantMinima;
        this.categoria = categoria;
        
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getquantMinima() {
        return quantMinima;
    }
    
    public void setquantMinima(int quantMinima) {
        this.quantMinima = quantMinima;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "ID: " + id + 
        	   ", Nome: " + nome + 
        	   ", Preço: " + preco + 
        	   ", Quantidade: " + quantidade + 
        	   ", Área de Risco: " + quantMinima +
               ", Categoria: " + categoria.getNome();
    }
}