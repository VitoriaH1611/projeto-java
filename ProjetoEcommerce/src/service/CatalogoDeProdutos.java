
	package service;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

import model.Eletronicos;
import model.ItemVenda;

	public class CatalogoDeProdutos {
	    private List<ItemVenda> catalogo = new ArrayList<>();

	    public CatalogoDeProdutos() {
	        catalogo.add(new Eletronicos("Iphone 15 Pro", 7999.99, "Apple"));
	        catalogo.add(new Eletronicos( "Headphone", 349.99, "JBL"));
	        catalogo.add(new Eletronicos( "Carregador Power Bank", 139.99, "Baseus"));
	        catalogo.add(new Eletronicos("Fone de Ouvido Bluetooth", 249.99, "Edifer"));
	        catalogo.add(new Eletronicos( "Lâmpada Intelifente", 65.49, "Positivo"));
	        catalogo.add(new Eletronicos("Microfone Dinâmico", 369.99, "FIFINE"));
	        catalogo.add(new Eletronicos( "WebCam 4k ", 299.99, "IntelBras"));
	        catalogo.add(new Eletronicos("Controle de Video-Game",289.99, "Sony"));
	        catalogo.add(new Eletronicos("Tablet Tab 6s ", 2999.99, "Samsung"));
	        catalogo.add(new Eletronicos( "Robô Aspirador", 3749.99, "Wap"));
	       
	    }

	    public List<ItemVenda> getCatalogo() {
	        return Collections.unmodifiableList(catalogo);
	    }
	}
