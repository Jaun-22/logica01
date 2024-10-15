package aplicacao.primeiro;
import java.util.Scanner; // importa a classe scanner

public class Primeiro {
    public void primeiroExecicio() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade? ");
        int idade = ler.nextInt();

        if (idade >= 0 && idade <= 7) {
            System.out.println(idade + " você é uma criança");
        } else if (idade >= 8 && idade <= 13) {
            System.out.println(idade + " você é um pré adolescente");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println(idade + " você é um adolescente");
        } else {
            System.out.println(idade + " você é um adulto");
        }
        ler.close();

    }
}
