
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[][] m = {{0.1, 0.2, 0.3}, {0.5, 0.1, 0.4}, {0.2, 0.1, 0.3}, {0.2, 0.1, 0.9}};
        imprimir(m);
        somaLinha(m);

    }

    public static int[][] matriz(int linha, int coluna) {
        int[][] matriz = new int[linha][coluna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }
        return matriz;
    }

    static void imprimir(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
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
