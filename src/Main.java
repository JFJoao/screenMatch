import br.com.jfjoao.screemMatch.modelos.Filme;
public class Main {
    public static void main(String[] args) {
        // Cadastro de novo filme
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

    }
}