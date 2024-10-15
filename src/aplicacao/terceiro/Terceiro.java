package aplicacao.terceiro;

import java.util.Scanner;

public class Terceiro {
    public void terceiroExecicio() {
        Scanner validar = new Scanner(System.in);

        System.out.println("Digite uma letra para valação:");
        String letra = validar.next();


        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("A letra: " + "'" + letra + "'" + " é uma vogal");
        } else {
            System.out.println("A letra: " + "'" + letra + "'" + " é uma consoante");
        }
        validar.close();
    }
}
