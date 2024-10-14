package aplicacao.quarto;

public class Quarto {
    public void quartoExercicio() {
        //EXERCÍCIO 2- AVALIAÇÃO DE DESEMPENHO

        int nota = 100;
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

    }
}