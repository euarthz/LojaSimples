package controller;

import java.util.List;
import model.*;

public class LojaController {
    private GerenciadorProdutos gerenciador;

    // Construtor padrão
    public LojaController() {
        this.gerenciador = new GerenciadorProdutos();
    }

    // Construtor com injeção (opcional)
    public LojaController(GerenciadorProdutos gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void adicionarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        gerenciador.adicionarProduto(produto);
    }

    public List<Produto> listarProdutos() {
        return gerenciador.getProdutos();
    }

    public double calcularValorTotal() {
        return gerenciador.calcularValorTotal();
    }
}

// A classe LojaController atua como o "Controller" do padrão MVC.
// Faz a ponte entre a View (interface do usuário) e o Model (dados e regras de negócio).
