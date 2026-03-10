package com.mensal1;

import java.util.Scanner;

import com.mensal1.model.Produto;
import com.mensal1.service.ProdutoService;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        int op = 0;

        while(op != 6){

            System.out.println("=============================");
            System.out.println("|| MINI SISTEMA DE MERCADO ||");
            System.out.println("=============================");
            System.out.println("||  1 - Cadastrar produto  ||");
            System.out.println("||  2 - Listar produtos    ||");
            System.out.println("||  3 - Buscar produto     ||");
            System.out.println("||  4 - Remover produto    ||");
            System.out.println("||  5 - Atualizar produto  ||");
            System.out.println("||  6 - Sair               ||");
            System.out.println("=============================");
            System.out.print("Escolha: ");

            while(!sc.hasNextInt()){
                System.out.println("Digite apenas números!");
                sc.next();
            }
            op = sc.nextInt();

            if(op == 1){

                System.out.print("ID: ");
                while(!sc.hasNextInt()){
                    System.out.println("Digite um número válido!");
                    sc.next();
                }
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Preço: ");
                while(!sc.hasNextDouble()){
                    System.out.println("Digite um preço válido!");
                    sc.next();
                }
                double preco = sc.nextDouble();

                System.out.print("Quantidade: ");
                while(!sc.hasNextInt()){
                    System.out.println("Digite uma quantidade válida!");
                    sc.next();
                }
                int qtd = sc.nextInt();

                service.adicionar(new Produto(id,nome,preco,qtd));

                System.out.println("Produto cadastrado!");

            }

            else if(op == 2){

                for(Produto p : service.listar()){
                    System.out.println(p);
                }

            }

            else if(op == 3){

                System.out.print("ID: ");
                while(!sc.hasNextInt()){
                    System.out.println("Digite um número válido!");
                    sc.next();
                }
                int id = sc.nextInt();

                Produto p = service.buscar(id);

                if(p != null){
                    System.out.println(p);
                }else{
                    System.out.println("Produto não encontrado");
                }

            }

            else if(op == 4){

                System.out.print("ID: ");
                while(!sc.hasNextInt()){
                    System.out.println("Digite um número válido!");
                    sc.next();
                }
                int id = sc.nextInt();

                if(service.remover(id)){
                    System.out.println("Removido");
                }else{
                    System.out.println("Produto não encontrado");
                }

            }

            else if(op == 5){

                System.out.print("ID do produto: ");
                while(!sc.hasNextInt()){
                    System.out.println("Digite um número válido!");
                    sc.next();
                }
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Novo nome: ");
                String nome = sc.nextLine();

                System.out.print("Novo preço: ");
                while(!sc.hasNextDouble()){
                    System.out.println("Digite um preço válido!");
                    sc.next();
                }
                double preco = sc.nextDouble();

                System.out.print("Nova quantidade: ");
                while(!sc.hasNextInt()){
                    System.out.println("Digite uma quantidade válida!");
                    sc.next();
                }
                int qtd = sc.nextInt();

                boolean atualizado = service.atualizar(id, nome, preco, qtd);

                if(atualizado){
                    System.out.println("Produto atualizado");
                }else{
                    System.out.println("Produto não encontrado");
                }

            }

            else if(op == 6){
                System.out.println("Sistema encerrado.");
            }

            else{
                System.out.println("Opção inválida!");
            }

        }

        sc.close();
    }
}
