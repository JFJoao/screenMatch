import br.com.jfjoao.screemMatch.calculos.CalculadoraDeTempo;
import br.com.jfjoao.screemMatch.modelos.Filme;
import br.com.jfjoao.screemMatch.modelos.Serie;
public class Main {
    public static void main(String[] args) {
        // Cadastro de filme
        Filme meuFilme = new Filme();
        meuFilme.setNome("300");
        meuFilme.setAnoDeLancamento(2009);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setSinopse("Uma obra de arte!") ;
        meuFilme.setIncluidoNoPlano(true);
        // Bloco de avaliações
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(8.8);
        // Informações do filme
        meuFilme.exibeFichaTecnica();
        System.out.println("Nota: " + meuFilme.obterMediaAvaliacoes());
        System.out.println("Votos: " + meuFilme.getTotalDeAvaliacoes());
        // Cadastro de novo filme
        Filme novoFilme = new Filme();
        novoFilme.setNome("Avatar");
        novoFilme.setAnoDeLancamento(2023);
        novoFilme.setDuracaoEmMinutos(300);
        // Cadastro de nova Serie
        Serie novaSerie = new Serie();
        novaSerie.setNome("Peaky Blinders");
        novaSerie.setAnoDeLancamento(2020);
        novaSerie.setMinutosPorEpisodio(50);
        novaSerie.setEpisodiosPorTemporada(10);
        novaSerie.setTemporadas(3);
        System.out.println(novaSerie.getDuracaoEmMinutos());


        // Testando Calculadora

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(novoFilme);
        calculadoraDeTempo.inclui(novaSerie);
        System.out.println(calculadoraDeTempo.getTempoTotal());

    }
}