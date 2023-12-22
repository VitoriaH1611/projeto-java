package service;



	import model.ItemVenda;


	public class CarrinhoDeCompras {
	  

	    public void adicionarItem(int quantidade) {
	    	 if (quantidade <= 0) {
	             System.out.println("Coloque uma quantidade maior que zero.");
	    	 }
	    }

	       
	    public void removerItem() {
	    	System.out.println("O produto foi removido do seu Carrinho");
		   
	    	}
	   
	    public void exibirItens() {
	    	System.out.println("----- Itens no Carrinho -----");
	       
	    }

	    public double calcularTotal() {
	    	
	    
	    }

	    public boolean fazerPagamento() {
	    	System.out.println("Pagamento feito com sucesso!");
	       
	     }
	    {
	}

}
