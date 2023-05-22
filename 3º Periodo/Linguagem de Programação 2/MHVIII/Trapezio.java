package MHVIII;

public class Trapezio extends FiguraAbstrata{

    public Trapezio( String nome, int qtdLados) {
        super(nome, qtdLados);
    }

    public void Desenha() {
        System.out.println("desenhando um trapezio");
    }
    
}
