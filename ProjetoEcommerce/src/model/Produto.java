package model;

public abstract class Produto implements ItemVenda {
		
	    private String nome;
	    private double preco;

	    public Produto(String nome, double preco) {
	        this.nome = nome;
	        this.preco = preco;
	    }

	   
	    public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		@Override
	    public double getPreco() {
	        return preco;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Produto:");
	        System.out.println("Nome: " + getNome());
	        System.out.println("Preço: " + getPreco());
	    }
	}
