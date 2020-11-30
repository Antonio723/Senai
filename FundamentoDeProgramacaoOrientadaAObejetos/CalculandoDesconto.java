class CalculandoDesconto{
	public static void main(String args[]){
		double compra = 584.75;
		int descontoPercentual = 15;
		double descontoMonetario = compra*descontoPercentual/100;
		double valorFinal = compra-descontoMonetario;
		System.out.println("O valor da compra foi " +compra+ " o valor do descootno percentual foi de " +descontoPercentual+ "%, e o valor com desconto e " +valorFinal);
	}
}