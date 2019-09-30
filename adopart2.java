
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class adopart2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader arquivo = new FileReader("matriz.txt");
        BufferedReader lerArquivo = new BufferedReader(arquivo);
        String linha = lerArquivo.readLine();
        String vetStr[] = linha.split(" ");

        int lin = Integer.parseInt(vetStr[0]);
        int col = Integer.parseInt(vetStr[1]);

        float m[][] = new float[lin][col];
        for (int i = 0; i < m.length; i++) {
            linha = lerArquivo.readLine();
            vetStr = linha.split(" ");
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Float.parseFloat(vetStr[j]);

            }

        }
        imprimir(m);
        somaLinha(m);

    }

    static void imprimir(float m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void somaLinha(float[][] m) {
        float soma[] = new float[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma[i] += m[i][j];
            }

        }
        for (int k = 0; k < m.length; k++) {
            System.out.printf("Soma de cada linha: %.1f %n",soma[k]);

        }
    }

}
