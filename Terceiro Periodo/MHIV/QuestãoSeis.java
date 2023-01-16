package MHIV;

public class QuestãoSeis {
    
    public static void main(String[] args) {
        Carro novoCarro  = new Carro("Gasolina", "1974", "Maverick v8", "Ford");

        System.out.println("Marca do carro é: " + novoCarro.getMarca());
        System.out.println("Modelo do carro é: " + novoCarro.getModelo());
        System.out.println("Tipo de combustivel do carro é: " + novoCarro.getCombubstivel());
        System.out.println("Ano de fabricação do carro: " + novoCarro.getAno_de_Fabricacao());

    }
}
