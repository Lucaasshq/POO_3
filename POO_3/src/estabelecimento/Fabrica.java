package estabelecimento;

import equipamentos.impresora.Deskjet;
import equipamentos.impresora.Impressora;

public class Fabrica {
	public static void main(String[] args) {
		Impressora impressora = new Deskjet();
		
		impressora.imprimir();
	}
}
