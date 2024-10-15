package aplicacao.quarto;

import java.util.Scanner;

public class Quarto {
    public void quartoExercicio() {
        Scanner suaNota = new Scanner(System.in); //cria um objeto para entrada

        //EXERCÍCIO 2- AVALIAÇÃO DE DESEMPENHO

        System.out.println("Digite sua nota, entre '10' e '100': ");
        int nota = suaNota.nextInt();

        if (nota > 90) {
            System.out.println("Sua nota foi excelente: " + nota);
        } else if (nota > 80) {
            System.out.println("Sua nota foi ótimo: " + nota);
        } else if (nota > 70) {
            System.out.println("Sua nota foi boa:" + nota);
        } else if (nota > 60) {
            System.out.println("Sua nota foi suficiente:" + nota);
        } else {
            System.out.println("sua nota foi insuficiente");
        }
        suaNota.close();
    }
}