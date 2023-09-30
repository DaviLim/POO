package poo;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Categoria cat1 = new Categoria(1, "Eletrônicos");
        Categoria cat2 = new Categoria(2, "Alimentos e Bebidas");
        Categoria cat3 = new Categoria(3, "Utensílios Domésticos");
        Categoria cat4 = new Categoria(4, "Roupas");

        Produto produto1 = new Produto(1, "Geladeira Brastemp", 1000.0, 50, 10, cat1);
        Produto produto2 = new Produto(2, "Geladeira Samsung", 1500.0, 100, 20, cat1);
        
        Produto produto3 = new Produto(3, "Coca-Cola 2L", 6.0, 100, 30, cat2);
        Produto produto4 = new Produto(4, "Feijão 1kg", 10.0, 300, 50, cat2);
        
        Produto produto5 = new Produto(5, "Faca", 2.0, 100, 10, cat3);
        Produto produto6 = new Produto(6, "Garfo", 3.0, 100, 10, cat3);
        
        Produto produto7 = new Produto(7, "Calça", 30.0, 200, 70, cat4);
        Produto produto8 = new Produto(8, "Saia", 25.0, 500, 60, cat4);

        estoque.addProduto(produto1);
        estoque.addProduto(produto2);
        estoque.addProduto(produto3);
        estoque.addProduto(produto4);
        estoque.addProduto(produto5);
        estoque.addProduto(produto6);
        estoque.addProduto(produto7);
        estoque.addProduto(produto8);

        System.out.println("Lista de Produtos:");
        estoque.mostrarProdutos();

        estoque.removeProduto(1,5);
        estoque.removeProduto(2,3);
        estoque.removeProduto(3,70);
        estoque.removeProduto(4,95);
        estoque.removeProduto(5,102);
        estoque.removeProduto(6,100);
        estoque.removeProduto(7,55);
        estoque.removeProduto(8,100);
        
        System.out.println("\nLista de Produtos atualizada:");
        estoque.mostrarProdutos();
        
        System.out.println();
        System.out.println("Lista de Categorias:");
        Categoria.mostrarCat();
    }
}