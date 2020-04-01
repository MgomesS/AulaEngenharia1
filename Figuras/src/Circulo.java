
public class Circulo extends Figura{

	 // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private double diametro;
	private String cor;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================


	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
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


public Circulo() {
	   
   }

    // CONSTRUTOR COM PARÂMETROS

	public Circulo(double diametro, String cor) {
		super();
		this.diametro = diametro;
		this.cor = cor;
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================


	public String desenhar() {
		return "desenho circulo";
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

   @Override
	public String toString() {
		return "Circulo [diametro=" + diametro + ", cor="
				+ cor + "]";
	}

    // ----> equals()
}
