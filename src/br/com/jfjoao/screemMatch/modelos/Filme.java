package br.com.jfjoao.screemMatch.modelos;

import br.com.jfjoao.screemMatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    // Atributo
    private String diretor;
    public int getDuracaoemMinutos() {
        return 0;
    }

    // Setter
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // Getter
    public String getDiretor() {
        return diretor;
    }

    // Override de metodos
    @Override
    public int getClassificacao() {
        return (int) obterMediaAvaliacoes() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + getAnoDeLancamento() + ")";
    }
}
