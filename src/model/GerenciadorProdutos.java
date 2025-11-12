package model;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private List<Produto> produtos = new ArrayList<>();

    public GerenciadorProdutos() {
        // Construtor padrão
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }
}
// A classe GerenciadorProdutos pertence à camada Model do padrão MVC.
// Ela aplica o padrão Strategy ao receber um objeto CalculadoraPrecoStrategy.
// Isso permite mudar o comportamento do cálculo sem alterar o código principal.
