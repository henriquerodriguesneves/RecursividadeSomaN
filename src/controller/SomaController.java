package controller;

public class SomaController {
	
	public SomaController() {
		super();
	}
	
	public int soma(int numero) {
		//A condi��o de parada deve ser = 0
	 if (numero == 0) {
      return 0;	
      //Se for diferente de 0, dever� somar numero + (numero - 1)
	 }else {
		 //numero + (numero - 1)
		 return numero + soma(numero - 1);
	 }
	 
}
}