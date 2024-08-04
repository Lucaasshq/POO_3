package equipamentos;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impresora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}

	@Override
	public void Digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}

	@Override
	public void Copiar() {
		System.err.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}

}
