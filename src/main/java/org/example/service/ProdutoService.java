package com.mensal1.service;

import java.util.ArrayList;
import java.util.List;

import com.mensal1.model.Produto;

public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto p){
        produtos.add(p);
    }

    public List<Produto> listar(){
        return produtos;
    }

    public Produto buscar(int id){
        for(Produto p : produtos){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean remover(int id){
        Produto p = buscar(id);
        if(p != null){
            produtos.remove(p);
            return true;
        }
        return false;
    }
    public boolean atualizar(int id, String nome, double preco, int qtd){

    Produto p = buscar(id);

    if(p != null){
        p.setNome(nome);
        p.setPreco(preco);
        p.setQuantidade(qtd);
        return true;
    }

    return false;
}
}
