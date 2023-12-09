package br.com.jfjoao.screemMatch.calculos;
import br.com.jfjoao.screemMatch.modelos.Filme;
import br.com.jfjoao.screemMatch.modelos.Serie;
import br.com.jfjoao.screemMatch.modelos.Titulo;

public class CalculadoraDeTempo {
    // Atributos
    private int tempoTotal;

    // Getters
    public int getTempoTotal() {
        return tempoTotal;

    }

    // Metodos
//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
