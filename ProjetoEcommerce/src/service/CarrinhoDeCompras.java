
	package service;

	import model.ItemVenda;

import java.util.Collections;
import java.util.HashMap;
	import java.util.Map;

	public class CarrinhoDeCompras {
	    private Map<ItemVenda, Integer> itens = new HashMap<>();

	    public void adicionarItem(ItemVenda produto, int quantidade) {
	        if (quantidade <= 0) {
	            System.out.println("A quantidade deve ser maior que zero.");
	            return;
	        }

	        itens.merge(produto, quantidade, Integer::sum);
	        System.out.println("Produto adicionado ao carrinho com sucesso!");
	    }

	    public void removerItem(ItemVenda produto) {
	        if (!itens.containsKey(produto)) {
	            System.out.println("Produto não encontrado no carrinho.");
	            return;
	        }

	        itens.remove(produto);
	        System.out.println("Produto removido do carrinho com sucesso!");
	    }

	    public void exibirItens() {
	        if (itens.isEmpty()) {
	            System.out.println("Carrinho vazio.");
	            return;
	        }

	        System.out.println("=== Itens no Carrinho ===");
	        for (Map.Entry<ItemVenda, Integer> entry : itens.entrySet()) {
	            ItemVenda produto = entry.getKey();
	            int quantidade = entry.getValue();
	            produto.exibirDetalhes();
	            System.out.println("Quantidade: " + quantidade);
	            System.out.println("-------------------------");
	        }
	    }

	    public double calcularTotal() {
	        return itens.entrySet().stream()
	                .mapToDouble(entry -> entry.getKey().getPreco() * entry.getValue())
	                .sum();
	    }

	    public boolean realizarPagamento(double valorPago) {
	        double total = calcularTotal();
	        if (valorPago >= total) {
	            double troco = valorPago - total;
	            System.out.println("Pagamento efetuado com sucesso!");
	            System.out.println("Troco: " + troco);
	            return true;
	        } else {
	            System.out.println("Saldo insuficiente. Valor total do carrinho: " + total);
	            return false;
	        }
	    }

	    public Map<ItemVenda, Integer> getItens() {
	        return Collections.unmodifiableMap(itens);
	    }

		
	}


