
public class Retangulo extends Figura{

	 // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double altura;
	private double largura;
	private String cor;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================


	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   public Retangulo() {
	   
   }

    // CONSTRUTOR COM PARÂMETROS


	public Retangulo(double altura, double largura,
			String cor) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.cor = cor;
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public String desenhar() {
		return "desenho retangulo";
	}



    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
public String toString() {
	return "Retangulo [altura=" + altura + ", largura="
			+ largura + ", cor=" + cor + "]";
}

    // ----> equals()
}
