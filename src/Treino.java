import java.sql.SQLOutput;
import java.util.Scanner;

public class Treino {
    public static void main( String [] args) {

        Scanner ler = new Scanner(System.in);

      /*  System.out.println("Digite um numero");
        int numero = ler.nextInt();

        String saida;

        if(numero >= 0){
            saida = "POSITIVO";
            if( numero%2 == 0) {
                saida += " PAR";
            } else {
                saida += " IMPAR";
            }

        } else {
            saida = "NEGATIVO";
        }

        System.out.println(saida);*/
        System.out.print("Digite a hora inicial do jogo: ");
        int hInicio = ler.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        int hFinal = ler.nextInt();

        int duracao;
        if( hInicio == hFinal){
            duracao = 24;
        }else if ( hInicio > hFinal ) {
            duracao = (24 - hInicio) + hFinal;
        } else {
            duracao = hFinal - hInicio;
        }

        System.out.printf("O jogo durou %d horas" ,  duracao);






    }
}
