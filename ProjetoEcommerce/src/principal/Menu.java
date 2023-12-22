    
    package principal;

    import model.ItemVenda;
    import service.CarrinhoDeCompras;
    import service.CatalogoDeProdutos;
    import visual.Cores;

    import java.util.List;
    import java.util.Scanner;

    public class Menu {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
            CatalogoDeProdutos catalogo = new CatalogoDeProdutos();

            int opcao;
            do {
                exibirMenu();
                opcao = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcao) {
                    case 1:
                        exibirCatalogo(catalogo.getCatalogo());
                        adicionarProdutoAoCarrinho(carrinho, catalogo.getCatalogo(), scanner);
                        break;
                    case 2:
                        removerProdutoDoCarrinho(carrinho, scanner);
                        break;
                    case 3:
                        carrinho.exibirItens();
                        break;
                    case 4:
                        System.out.println("Total do Carrinho: " + carrinho.calcularTotal());
                        break;
                    case 5:
                        realizarPagamento(carrinho, scanner);
                        break;
                    case 6:
                        System.out.println("Saindo...");
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

        private static void exibirCatalogo(List<ItemVenda> catalogo) {
            System.out.println("=== Catálogo de Produtos ===");
            for (ItemVenda produto : catalogo) {
                produto.exibirDetalhes();
                System.out.println("-------------------------");
            }
        }

        private static void adicionarProdutoAoCarrinho(CarrinhoDeCompras carrinho, List<ItemVenda> catalogo, Scanner scanner) {
            exibirCatalogo(catalogo);
            System.out.print("Digite o nome do produto que deseja adicionar: ");
            String nomeProduto = scanner.nextLine();

            ItemVenda produtoSelecionado = null;
            for (ItemVenda produto : catalogo) {
                if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                    produtoSelecionado = produto;
                    break;
                }
            }

            if (produtoSelecionado != null) {
                System.out.print("Digite a quantidade desejada: ");
                int quantidade = scanner.nextInt();
                carrinho.adicionarItem(produtoSelecionado, quantidade);
                System.out.println("Produto adicionado ao carrinho com sucesso!");
            } else {
                System.out.println("Produto não encontrado no catálogo.");
            }
        }

        private static void removerProdutoDoCarrinho(CarrinhoDeCompras carrinho, Scanner scanner) {
            carrinho.exibirItens();
            System.out.print("Digite o nome do produto que deseja remover: ");
            String nomeProduto = scanner.nextLine();

            ItemVenda produtoSelecionado = null;
            for (ItemVenda produto : carrinho.getItens().keySet()) {	
                if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                    produtoSelecionado = produto;
                    break;
                }
            }

            if (produtoSelecionado != null) {
                carrinho.removerItem(produtoSelecionado);
                System.out.println("Produto removido do carrinho com sucesso!");
            } else {
                System.out.println("Produto não encontrado no carrinho.");
            }
        }

        private static void realizarPagamento(CarrinhoDeCompras carrinho, Scanner scanner) {
            double total = carrinho.calcularTotal();
            System.out.println("Total do Carrinho: " + total);
            System.out.print("Digite o valor pago: ");
            double valorPago = scanner.nextDouble();
            carrinho.realizarPagamento(valorPago);
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    

  