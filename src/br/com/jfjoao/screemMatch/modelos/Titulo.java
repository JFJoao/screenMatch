package br.com.jfjoao.screemMatch.modelos;

public abstract class Titulo {

    // Atributos
    private String nome;
    private String sinopse;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacoes;
    private int duracaoEmMinutos;

    // Getters
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(Boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    private void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    // Métodos
    public void exibeFichaTecnica(){
        System.out.println("Nome do título: " + nome);
        System.out.println("Ano de lancamento " + anoDeLancamento);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Nota: " + avaliacao );
        System.out.println("Total avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos.");
        System.out.println("Premium: " + incluidoNoPlano);
    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double obterMediaAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public abstract int getDuracaoemMinutos();
}
