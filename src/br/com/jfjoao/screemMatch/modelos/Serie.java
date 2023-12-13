package br.com.jfjoao.screemMatch.modelos;

public class Serie extends Titulo {

    //Atributos
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;
    private int anoDeLancamento;

    // Setters
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    // Getters

    public int getTemporadas() {
        return temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    // Override de métodos
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
