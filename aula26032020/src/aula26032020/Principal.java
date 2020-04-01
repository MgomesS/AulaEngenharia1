package aula26032020;

public class Principal {

	public static void main(String[] args) {
		caixa cx = new caixa(6,6);
		cx.caracter = "/";
		cx.gerarCaixa();
		
		caixa cx2 = new caixa(9,16);
		cx2.caracter = "#";
		cx2.gerarCaixa();
	
		
	//	caixa("#");
	//}

	//public static void caixa(String chr) {
	//	extremos(chr);
	//	for (int i = 0; i < 6; i++) {
	//		line(chr);
	//	}
	//	extremos(chr);
	//}

//	public static void extremos(String chr) {
	//	for (int i = 0; i < 8; i++) {
	//		System.out.print("#");
	//	}
	//	System.out.print("\n");
	//}

	//public static void line(String chr) {
        //System.out.print("#");
        //for (int i=0; i<6; i++) {
          //  System.out.print(" ");
        //}
      //  System.out.print("#");
    //    System.out.print("\n");
   }
}