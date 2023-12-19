import br.com.jfjoao.screemMatch.calculos.CalculadoraDeTempo;
import br.com.jfjoao.screemMatch.calculos.FiltroRecomendacao;
import br.com.jfjoao.screemMatch.modelos.Filme;
import br.com.jfjoao.screemMatch.modelos.Serie;
import br.com.jfjoao.screemMatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cadastro de filme
        Filme meuFilme = new Filme("300");
        //meuFilme.setNome("300");
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
        Serie novaSerie = new Serie("Peaky Blinders");
        //novaSerie.setNome("Peaky Blinders");
        novaSerie.setAnoDeLancamento(2020);
        novaSerie.setMinutosPorEpisodio(50);
        novaSerie.setEpisodiosPorTemporada(10);
        novaSerie.setTemporadas(3);
        // Teste tempo serie
        //System.out.println(novaSerie.getDuracaoEmMinutos());


        // Testando Calculadora
        // Criando objeto
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        // Cadastrando titulos
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(novoFilme);
        calculadoraDeTempo.inclui(novaSerie);
        // Resultado total
        System.out.println(calculadoraDeTempo.getTempoTotal()/60 + " horas, para assistir tudo.");

        // Filtro de recomendação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        // Criando Arraylist
        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        listaDeTitulos.add(novaSerie);
        listaDeTitulos.add(meuFilme);
        listaDeTitulos.add(novoFilme);
        // Exibe tamanho da coleção
        System.out.println("Titulos disponiveis: " + listaDeTitulos.size());
        // Imprimi dados de acordo com escolha do usuario
        System.out.println("Escolha um filme do top 3: 1,2 ou 3 colocado ?");
        int escolhaUsuario = leitura.nextInt();
        // Utilizando index de acordo com escolha do usuario + metodo para nome
        System.out.println("O primeiro título é: " + listaDeTitulos.get(escolhaUsuario -1).getNome());
        // Testando print de ArrayList antes e depois de implementar toString (nativo do ArrayList)
        System.out.println(listaDeTitulos);
        // Checando print do ArrayList antes e depois do override em toString
        System.out.println("toString do filme: " + listaDeTitulos.get(escolhaUsuario -1).toString());
        for (Titulo item: listaDeTitulos){
            System.out.println(item);
        }

    }
}