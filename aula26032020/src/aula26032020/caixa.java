package aula26032020;

public class caixa {

	int largura;
	int altura;
	public String caracter = "#";

	public caixa(int alt, int larg) {
		this.altura = alt;
		this.largura = larg;
	}

	public void gerarCaixa() {
		gerarTopo();
		gerarMeio();
		gerarTopo();
	}

	private void gerarTopo() {
		for (int i = 0; i < largura; i++) {
			System.out.print(caracter);
		}
		System.out.print("\n");
	}

	private void gerarMeio() {
		for (int i = 0; i < altura - 2; i++) {
			System.out.print(gerarLinhaMeio());
		}

	}

	private String gerarLinhaMeio() {
		String linha = "";
		linha += caracter;
		for (int i = 0; i < largura - 2; i++) {
			linha += " ";
		}
		linha += caracter;
		linha += "\n";
		return linha;
	}
}
