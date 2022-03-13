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
        /* System.out.print("Digite a hora inicial do jogo: ");
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

        System.out.printf("O jogo durou %d horas" ,  duracao);*/

       /* System.out.print("Informe um valor inteiro ou decimal: ");
        double valor =  ler.nextDouble();
        String intervalo = "Fora de Intervalo" ;

        if ( valor >= 0 && valor <= 25 ){
            intervalo = " Intervalo [0, 25]";
        } else
            if ( valor > 25 && valor <=50 ){
                intervalo = " Intervalo (25, 50]";
        } else
            if ( valor > 75 && valor <= 100){
                intervalo = " Intervalo (75, 100]";
            }

        System.out.println(intervalo);*/

        /* System.out.println("Informe  dois valores com casa decimal: ");
        double eixoX =  ler.nextDouble();
        double eixoY =  ler.nextDouble();
        String posicao = "Origem";

        if ( eixoX > 0  && eixoY > 0){
            posicao = "Q1";
        } else
        if ( eixoX < 0  && eixoY > 0){
            posicao = "Q2";
        } else
            if( eixoX < 0 && eixoY < 0) {
                posicao = "Q3";
            } else
                if( eixoX > 0 && eixoY < 0){
                    posicao = "Q4";
                }

        System.out.println(posicao);

         */
        String  senha = " ";

        do {
            System.out.print("Digite a senha de acesso: ");
            senha = ler.next();

            if (senha.equals("2002")) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Inválida");
            }
        } while (!senha.equals(" "));

        }
}
