package poo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private int id;
    private String nome;
    private static List<Categoria> catSalvas = new ArrayList<>();

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
        catSalvas.add(this);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static List<Categoria> getCatSalvas() {
        return catSalvas;
    }

    public static void mostrarCat() {
        for (Categoria categoria : catSalvas) {
            System.out.println("ID: " + categoria.getId() + ", Nome: " + categoria.getNome());
        }
    }
}