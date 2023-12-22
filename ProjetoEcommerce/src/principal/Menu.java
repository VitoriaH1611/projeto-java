package principal;

import java.util.Scanner;

import visual.Cores;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Muito obrigado pela preferência e volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }

    private static void exibirMenu() {
    	System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_WHITE_BACKGROUND
				+ "*****************************************************");
        System.out.println("=== Menu ===");
        System.out.println("1 - Adicionar um produto ao Carrinho");
        System.out.println("2 - Remover Produto do Carrinho");
        System.out.println("3 - Exibir os produtos do Carrinho");
        System.out.println("4 - Exibir o total do Carrinho");
        System.out.println("5 - Pagar");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
  