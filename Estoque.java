package poo;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removeProduto(int id, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                int quantidadeAtual = produto.getQuantidade();
                if (quantidadeAtual >= quantidade) {
                    produto.setQuantidade(quantidadeAtual - quantidade);
                    if (produto.getQuantidade() == 0) {
                        produtos.remove(produto);
                    }
                    if (produto.getQuantidade() < produto.getquantMinima()) {
                    	System.out.println();
                        System.out.println("A quantidade do produto " + produto.getNome() +
                                " está na área de risco (" + produto.getquantMinima() + ")");
                    }
                    return;
                } else {
                	System.out.println();
                    System.out.println("Quantidade insuficiente do produto: " + produto.getNome());
                    System.out.println("Quantidade em estoque: " + produto.getQuantidade());
                    return; 
                }
            }
        }
        System.out.println("Produto não encontrado.");
    }
   
    public void mostrarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}

