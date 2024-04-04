
import java.util.Scanner;
public class Sorvete {
    public static int BuscarSabor(String[] sabores, String SaborDesejado) {

        for (int i = 0; !(i >= sabores.length); i++) {
            if (sabores[i].equals(SaborDesejado)) {
                return i;
            }
        }
        return 0;
    }
public static void main(String[] args) {
    String[] SaboresDisponiveis = {"chocolate", "morango", "creme", "Limão","chocolate","melão"};

Scanner Scanner = new Scanner(System.in);
    System.out.println("Quais sabores de sorvete você deseja? ");
    String saborProcurado = Scanner.nextLine();

    int posicao = BuscarSabor(SaboresDisponiveis, saborProcurado);

    if (posicao != -1) {
        System.out.println("O sabor " + saborProcurado + " está na posição " + posicao );
    } else {
        System.out.println("Sabor não encontrado");
    }

    Scanner.close();
    }
}
