package aplicacao.terceiro;

public class Terceiro {
    public void terceiroExecicio() {

        String letra = "a";

        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"
                || letra == "A" || letra == "E" || letra == "I" || letra == "O" || letra == "U") {
            System.out.println("A letra: " + "'" + letra + "'" + " é uma vogal");
        } else {
            System.out.println("A letra: " + "'" + letra + "'" + " é uma consoante");
        }

    }
}
