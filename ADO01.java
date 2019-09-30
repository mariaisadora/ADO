
/**
 *
 * @author DELL
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ADO01 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // abre o arquivo
        FileReader arquivo = new FileReader("matriz.txt");

        String linha;
        try ( // lê o arquivo por linha
                BufferedReader lerArquivo = new BufferedReader(arquivo)) {
            //lê a primeira linha
            linha = lerArquivo.readLine();
            //lê da segunda até a última linha
            while (linha != null) {
                linha = lerArquivo.readLine();
                System.out.println(linha);
            }
            lerArquivo.close(); // fecha arquivos
        }

        // divide a string em strings com números e armazena em um vetor
        String vetor[] = linha.split(" ");
        // converte o vetor para double
        double M[];
        M = new double[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            M[i] = Double.parseDouble(vetor[i]);
        }

    }

    public static void somaLinha(double[][] m) {
        double soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
        }
        System.out.println(soma);
    }

}
