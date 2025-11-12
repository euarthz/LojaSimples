package model;

import java.io.*;
import java.util.*;

public class Persistencia {
    private static final String ARQUIVO = "produtos.txt";

    public static void salvar(List<Produto> produtos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Produto p : produtos) {
                writer.write(p.getNome() + ";" + p.getPreco());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    public static List<Produto> carregar() {
        List<Produto> produtos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    produtos.add(new Produto(partes[0], Double.parseDouble(partes[1])));
                }
            }
        } catch (IOException e) {
            System.out.println("Nenhum arquivo encontrado, iniciando com lista vazia.");
        }
        return produtos;
    }
}
