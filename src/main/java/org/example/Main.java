package org.example;

import org.example.model.Produto;
import org.example.service.ProdutoService;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        int op = 0;

        while(op != 5){

            System.out.println("\n1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Sair");

            op = sc.nextInt();

            if(op == 1){

                System.out.print("ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                System.out.print("Quantidade: ");
                int qtd = sc.nextInt();

                service.adicionar(new Produto(id,nome,preco,qtd));

            }

            if(op == 2){

                for(Produto p : service.listar()){
                    System.out.println(p);
                }

            }

            if(op == 3){

                System.out.print("ID: ");
                int id = sc.nextInt();

                Produto p = service.buscar(id);

                if(p != null){
                    System.out.println(p);
                }else{
                    System.out.println("Produto não encontrado");
                }

            }

            if(op == 4){

                System.out.print("ID: ");
                int id = sc.nextInt();

                if(service.remover(id)){
                    System.out.println("Removido");
                }else{
                    System.out.println("Produto não encontrado");
                }

            }
        }

        sc.close();
    }
}