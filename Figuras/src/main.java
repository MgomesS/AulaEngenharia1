
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Figura figura = new Figura();
		//figura.setCor("vermelho");
		//System.out.println(figura);
		
		Circulo circulo = new Circulo();
		circulo.setCor("azul");
		circulo.setDiametro(10);
		System.out.println(circulo.desenhar());
		System.out.println(circulo);
		
		Retangulo retangulo = new Retangulo();
		retangulo.setCor("azul");
		retangulo.setAltura(8);
		retangulo.setLargura(10);
		System.out.println(retangulo.desenhar());
		System.out.println(retangulo);
		
		Triangulo triangulo = new Triangulo();
		triangulo.setCor("azul");
		triangulo.setAltura(6);
		triangulo.setAngulo(7);
		triangulo.setLargura(4);
		System.out.println(triangulo.desenhar());
		System.out.println(triangulo);
	}

}
