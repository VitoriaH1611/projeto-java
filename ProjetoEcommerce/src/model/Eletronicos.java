package model;

	public class Eletronicos extends Produto {
	    private String marca;

	    public Eletronicos(String nome, double preco, String marca) {
	        super(nome, preco);
	        this.marca = marca;
	    }

	    
	    public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		 @Override
		    public void exibirDetalhes() {
		        super.exibirDetalhes();
		        System.out.println("Marca: " + marca);
		    }
	}


		

