package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme ponyo = new Filme("Ponyo", 2008);
        ponyo.avalia(10);
        Filme titanic = new Filme("Titanic", 1997);
        titanic.avalia(9);
        Filme filmeDoEric = new Filme("Back to the Future", 1985);
        filmeDoEric.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoEric);
        lista.add(titanic);
        lista.add(ponyo);
        lista.add(lost);

        for (Titulo titulo : lista) {
            System.out.println(titulo.getTitulo());
            if (titulo instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Joe");
        buscaPorArtista.add("Steve");
        buscaPorArtista.add("Paul");
        buscaPorArtista.add("Jason");
        buscaPorArtista.add("Marty");
        buscaPorArtista.add("Eric");

        Collections.sort(lista);
        System.out.println("Lista por título: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista por ano de lançamento: " + lista);
    }
}
