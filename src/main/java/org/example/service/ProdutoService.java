package org.example.service;

import org.example.model.Produto;

import java.util.ArrayList;
import java.util.List;


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
}