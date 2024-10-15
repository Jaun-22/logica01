package aplicacao.segundo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Segundo {
    public void segundoExecicio() {
        Scanner valorMedia = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double notaUm = valorMedia.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double notaDois = valorMedia.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double notaTres = valorMedia.nextDouble();

        System.out.println("Digite sua quarta nota: ");
        double notaQuatro = valorMedia.nextDouble();


        double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;


        if (media >= 7.0) {
            System.out.println("Você tirou: " + String.format("%.2f", media) + " Sua nota esta na média.");
        } else {
            System.out.println("Você tirou: " + String.format("%.2f", media) + " Sua nota esta a baixo da média.");
        }

    }

}
