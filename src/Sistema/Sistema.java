package Sistema;

import java.util.Random;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rdn = new Random();

        int opcao = 0;
        do {
           System.out.println("VocÊ quer jogar?");
           System.out.println("Digite 1 para SIM");
           System.out.println("Digite 0 para NÃO");
           opcao = sc.nextInt();
           
           if(opcao ==1) {
        	   System.out.println("Digite seu número");
               int numeroDigitado = sc.nextInt();
               int numeroGerado = rdn.nextInt(100) + 1;

               if (numeroGerado % 2 == 0 && numeroDigitado % 2 == 0) {
                   System.out.println("Parabéns, é par!");
               } else if (numeroGerado % 2 > 0 && numeroDigitado % 2 > 0) {
                   System.out.println("Parabéns, é ímpar!");
               } else {
                   System.out.println("Ooops, errou! Tente Novamente");
               }
           }
           
           
        } while (opcao != 0 );
        sc.close();
    }

}
