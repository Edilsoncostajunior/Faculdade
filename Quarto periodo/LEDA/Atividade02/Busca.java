package Atividade02;

public class Busca implements Busca_IF  {
    
public int[] geraVetorNumericoOrdenado(int tamanho){
    final int novo_array[] = new int[tamanho];

        for (int i = 0; i < tamanho ; i++) {
            novo_array[i] = i ; 
        }
        return novo_array;  
    }

public void MostrarVetor(int[] array){
    for (int i = 0; i < array.length ; i++) {
        System.out.println(array[i] ); ; 
    }
}

public boolean buscaLinear_iterativa(int[] numeros, int num){
    boolean estado = false;
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] == num) {
            
            estado = true;
        } 
    }
    System.out.println(estado);
    return estado;
    
}

@Override
public boolean buscaLinear_recursiva(int[] numeros, int num) {
    return false;
}

@Override
public boolean buscaBinaria_iterativa(int[] numeros, int num) {
    return false;
}

@Override
public boolean buscaBinaria_recursiva(int[] numeros, int num) {
    return false;
};
}


