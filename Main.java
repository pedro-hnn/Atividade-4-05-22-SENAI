
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tCadastrar novo Produto\n" +
                        "2\t\t=>\t\tMostrar todos os Produtos\n" +
                        "3\t\t=>\t\tCalculo de equação de segundo grau\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 3) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }


    public static void main(String[] args) {
        System.out.println("Atividade SENAI 4/5/2022 - Exercício 2 Orientação a Objetos - Curso: Desenvolvedor Java Vespertino\n\n");

        List<Produto> produtos = new ArrayList<>();

        Produto produto;
        Equacao equacao;
        String nome;
        Double preco_venda,a,b,c;
        int quant_estoque;


        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    System.out.print("\n\nNome do novo Produto: ");
                    nome = new Scanner(System.in).nextLine();
                    System.out.print("\n\nPreço de venda do novo Produto: ");
                    preco_venda = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nQuantidade de Produtos no estoque: ");
                    quant_estoque = new Scanner(System.in).nextInt();

                    produto = new Produto(nome,preco_venda,quant_estoque);

                    produtos.add(produto);
                    System.out.println("\n\nPRODUTO CADASTRADO COM SUCESSO:\n");

                    System.out.println("\n=====");
                    System.out.println("Nome = " + produto.getNome());
                    System.out.println("Preço de venda = " + produto.getPreco_venda());
                    System.out.println("Quantidade no estoque = "+ produto.getQuant_estoque());
                    System.out.println("=====\n");

                    continue;

                case 2:

                    if(!produtos.isEmpty()) {
                        for (Produto p : produtos) {
                            System.out.println("\n=====");
                            System.out.println("Nome = " + p.getNome());
                            System.out.println("Preço de venda = " + p.getPreco_venda());
                            System.out.println("Quantidade no estoque = "+ p.getQuant_estoque());
                            System.out.println("=====\n");
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UM PRODUTO ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }
                    continue;

                case 3:
                    //Equacao(Double a, Double b, Double c)

                    System.out.print("\n\nDigite o valor de A: ");
                    a = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nDigite o valor de B: ");
                    b = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nDigite o valor de C: ");
                    c = new Scanner(System.in).nextDouble();

                    equacao = new Equacao(a,b,c);

                    System.out.println("\n=====");
                    System.out.println("Valor do X1 = " + equacao.getX1());
                    System.out.println("Valor do x2 = " + equacao.getX2());
                    System.out.println("Valor de Delta = "+ equacao.getDelta());
                    System.out.println("=====\n");

                    continue;
                case 0:
                    run = false;
                    break;
            }

        }
    }
}
