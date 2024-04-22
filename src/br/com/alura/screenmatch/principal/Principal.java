package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Cria filme Ponyo
        Filme ponyo = new Filme("Ponyo", 2008);
        ponyo.setDuracaoEmMinutos(130);
        ponyo.avalia(8);
        ponyo.avalia(8);
        ponyo.avalia(10);
        ponyo.exibeFichaTecnica();

        //Cria filme Titanic
        Filme titanic = new Filme("Titanic", 1997);
        titanic.setDuracaoEmMinutos(180);
        titanic.exibeFichaTecnica();

        //Cria serie Lost
        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        //Calcula  quantos minutos tem na lista Assistir mais tarde
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(ponyo);
        calculadora.inclui(titanic);
        calculadora.inclui(lost);
        System.out.println("Assistir mais tarde: " + calculadora.getTempoTotal() + " minutos");

        //Filtra avaliações dos filmes e episodios das series
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(ponyo);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(99);
        filtro.filtra(episodio);

        Filme filmeDoEric = new Filme("Back to the Future", 1985);
        filmeDoEric.setDuracaoEmMinutos(120);
        filmeDoEric.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoEric);
        listaDeFilmes.add(titanic);
        listaDeFilmes.add(ponyo);
        System.out.println("Quantidade de filmes na lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getTitulo());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0).toString());
    }
}
