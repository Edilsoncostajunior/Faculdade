package BrincandoComBuscas.Atividade01;

public interface Busca_IF {
	
	int[] geraVetorNumericoOrdenado(int tamanho);
	
	boolean buscaLinear_iterativa(int[] numeros, int num);

	boolean buscaLinear_recursiva(int[] numeros, int num);

	boolean buscaBinaria_iterativa(int[] numeros, int num);

	boolean buscaBinaria_recursiva(int[] numeros, int num);

	void MostrarVetor(int[] vetor);

}