package aplicacao;

import aplicacao.primeiro.Primeiro;
import aplicacao.quarto.Quarto;
import aplicacao.segundo.Segundo;
import aplicacao.terceiro.Terceiro;

public class Aplicacao {
    public static void main(String[] args) {

        Primeiro instancia = new Primeiro();
        instancia.primeiroExecicio();
        instancia = new Primeiro();

        Quarto quartaAtividade = new Quarto();
        quartaAtividade.quartoExercicio();
        quartaAtividade = new Quarto();

        Terceiro terceiraAtivdade = new Terceiro();
        terceiraAtivdade.terceiroExecicio();
        terceiraAtivdade = new Terceiro();


    }
}
