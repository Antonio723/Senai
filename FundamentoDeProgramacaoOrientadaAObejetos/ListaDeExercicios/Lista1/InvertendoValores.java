class InvertendoValores{
	public static void main(String args[]){
	int num1 = 5;
	int num2 = 2;
	System.out.println("O valor da varivael do numero 1 e " +num1+ " , e a variavel do numero 2 e " +num2);
	int aux = num1;
	int num1 = num2;
	int num2 = aux;
	System.out.println("O valor da varivael do numero 1 trocada e " +num1+ " , e a variavel do numero 2 trocada e " +num2);
	}
}