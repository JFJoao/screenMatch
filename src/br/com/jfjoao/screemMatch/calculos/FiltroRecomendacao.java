package br.com.jfjoao.screemMatch.calculos;

import br.com.jfjoao.screemMatch.modelos.Titulo;

public class FiltroRecomendacao {

    // Atributo
    private String recomendacao;

    // Metodo
    public void filtra (Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento.");
        } else if (classificavel.getClassificacao() >= 3) {
            System.out.println("Bem avaliado no momento");
        } else {
            System.out.println("Adicione para assistir depois.");
        }

    }


}
