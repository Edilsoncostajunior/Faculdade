package MHVIII;

import java.util.ArrayList;

public class Biblioteca {
    private static ArrayList<Livros> Biblioteca = new ArrayList<>();

    public static void main(String[] args) {
        Livros livro1 = new Livros("Edilson", "n sei", Livros.tipoGenero[3], "Aloha", "19ª edicao");
        Livros livro2 = new Livros("Reparo automotivo", "Marcão", Livros.tipoGenero[2], "UH LA LA", "1ª edicao");
        Livros livro3 = new Livros("NUM ZEIIII", "Choyce", Livros.tipoGenero[1], "SLA2.0", "4ª edicao");
        Livros livro4 = new Livros("Emo", "Ivaldo", Livros.tipoGenero[2], "POPOPO", "2ª edicao");
        Livros livro5 = new Livros("o Gigante", "Caio", Livros.tipoGenero[0], "gigantomachia", "1ª edicao");

        Biblioteca.add(livro1);
        Biblioteca.add(livro2);
        Biblioteca.add(livro3);
        Biblioteca.add(livro4);
        Biblioteca.add(livro5);

        int i = 0;
        System.out.println("-----------------------------------------LIVROS-----------------------------------------");
        for (Object lista : Biblioteca) {
            System.out.println(i + "-" + lista);
            i++;
        }
    }
}