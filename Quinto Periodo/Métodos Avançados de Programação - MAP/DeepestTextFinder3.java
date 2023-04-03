import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class DeepestTextFinder3 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://hiring.axreng.com/internship/example4.html");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        ArrayList<Elemento> elementos = new ArrayList<>();
        int profundidade = 0;

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            inputLine = inputLine.trim();
            if (inputLine.isEmpty()) {
                continue;
            }
            char firstChar = inputLine.charAt(0);
            if (firstChar == '<') {
                if (inputLine.charAt(1) == '/') {
                    profundidade--;
                }
                Elemento elemento = new Elemento(inputLine, profundidade);
                elementos.add(elemento);
                if (firstChar != '/') {
                    profundidade++;
                }
            } else {
                Elemento elemento = elementos.get(elementos.size() - 1);
                elemento.adicionarConteudo(inputLine);
            }
        }

        in.close();

        String textoMaisProfundo = null;
        int profundidadeMaxima = -1;

        for (Elemento elemento : elementos) {
            if (elemento.profundidade == 0) {
                continue;
            }
            if (elemento.profundidade > profundidadeMaxima && elemento.getConteudoMaisProfundo() != null) {
                textoMaisProfundo = elemento.getConteudoMaisProfundo();
                profundidadeMaxima = elemento.profundidade;
            }
        }

        System.out.println(textoMaisProfundo);
    }

    static class Elemento {
        private final String tag;
        private final int profundidade;
        private final ArrayList<String> conteudos;

        public Elemento(String tag, int profundidade) {
            this.tag = tag;
            this.profundidade = profundidade;
            this.conteudos = new ArrayList<>();
        }

        public void adicionarConteudo(String conteudo) {
            conteudos.add(conteudo);
        }

        public String getConteudoMaisProfundo() {
            if (conteudos.isEmpty()) {
                return null;
            }
            return conteudos.get(conteudos.size() - 1);
        }
    }

}
