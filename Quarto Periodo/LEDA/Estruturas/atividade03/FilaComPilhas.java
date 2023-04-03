package Estruturas.atividade03;

public class FilaComPilhas implements Fila_IF {

	protected PilhaComLista pilha1 = new PilhaComLista();
	protected PilhaComLista pilha2 = new PilhaComLista();
	protected int qntElementos = 0;
	
	
	
	@Override
	public void enqueue(int element) throws Exception {
		if (isFull()) throw new Exception("Fila Cheia");
		pilha1.push(element);
		qntElementos++;
		
	}

	@Override
	public int dequeue() throws Exception {
		if (isEmpty()) throw new Exception("Fila Vazia");
		
		while (!pilha1.isEmpty()) {
			pilha2.push(pilha1.pop());
		}
		int elemento = pilha2.pop();
		
		while (!pilha2.isEmpty()) {
			pilha1.push(pilha2.pop());
		}
		qntElementos--;
		return elemento;
	}

	@Override
	public int head() throws Exception {
		if (isEmpty()) throw new Exception("Fila Vazia");		
		
		while (!pilha1.isEmpty()) {
			pilha2.push(pilha1.pop());
		}
		int head = pilha2.top();
		
		while (!pilha2.isEmpty()) {
			pilha1.push(pilha2.pop());
		}
		return head;
	}

	@Override
	public boolean isEmpty() {
		if (qntElementos == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(qntElementos == 10) {
			return true;
		}
		return false;
	}

}
