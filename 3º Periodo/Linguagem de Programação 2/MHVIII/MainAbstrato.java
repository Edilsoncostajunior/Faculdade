package MHVIII;

public class MainAbstrato {
    public static void main(String[] args){
        FiguraAbstrata trapezio = new Trapezio("Trapezio", 4);
        FiguraAbstrata triangulo = new Triangulo("Triangulo", 3);
        
        trapezio.Desenha();
        triangulo.Desenha();
    }
}
