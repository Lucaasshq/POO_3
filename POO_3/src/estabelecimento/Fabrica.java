package estabelecimento;

import equipamentos.EquipamentoMultifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impresora.Impressora;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Scanner scanner = new Scanner();
		
		 Impressora impressora = em;
		 Digitalizadora digitalizado = em;
		 Copiadora copiadora = em;
		 
		 impressora.imprimir();
		 digitalizado.Digitalizar();
		 copiadora.Copiar();
	}
}
