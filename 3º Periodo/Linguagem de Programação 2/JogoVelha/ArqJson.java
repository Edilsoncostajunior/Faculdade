/*package JogoV;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;
import javax.tools.JavaFileObject;

import org.json.simple.JSONObject;

public class ArqJson {
    public static Scanner Sc = new Scanner(System.in);

    public static void criarJson() {
        JSONObject Arquivo = new JSONObject();
    }

    public static void adicionar(JSONObject Arquivo, String nome) throws IOException {
        int antigoValor, novoValor;

        if(Arquivo.containsKey(nome) == true){
            System.out.println(Arquivo.get(nome));
            antigoValor = (int) Arquivo.get(nome);

            novoValor = antigoValor + 3;
            Arquivo.put(nome, novoValor);
        }
    }

    public static void diminuir(JSONObject Arquivo, String nome) throws IOException {
        int antigoValor, novoValor;

        if(Arquivo.containsKey(nome) == true){
            System.out.println(Arquivo.get(nome));
            antigoValor = (int) Arquivo.get(nome);

            novoValor = antigoValor - 1;
            Arquivo.put(nome, novoValor);
        }
    }

    public static void criarArquivo(JSONObject Arquivo){
        FileWriter writeFile = null;

        try {
            writeFile = new FileWriter("Registro.json");
            writeFile.write(Arquivo.toJSONString());
            writeFile.close();
        } catch (IOException ex) {
            Logger.getLogger(Mac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}*/