package MHVIII;

public class Triangulo extends FiguraAbstrata{

    public Triangulo( String nome,int qtdLados) {
        super(nome, qtdLados);
   }

    public void Desenha(){
        System.out.println("desenhando um triangulo");
    }
    
}
