
public class Triangulo extends Figura{

	 // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double angulo;
	private double altura;
	private double largura;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public double getAngulo() {
		return angulo;
	}
	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
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

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   public Triangulo() {
	   
   }


    // CONSTRUTOR COM PARÂMETROS


	public Triangulo(double angulo, double altura,
			double largura) {
		super();
		this.angulo = angulo;
		this.altura = altura;
		this.largura = largura;
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public String desenhar() {
		return "desenho triangulo ";
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
public String toString() {
	return "Triangulo [angulo=" + angulo + ", altura="
			+ altura + ", largura=" + largura + "]";
}

    // ----> equals()
}
